package com.tasawr.standupmanager.web;

import com.tasawr.standupmanager.domain.Standup;
import com.tasawr.standupmanager.domain.Users;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/standups")
@Controller
@RooWebScaffold(path = "standups", formBackingObject = Standup.class)
public class StandupController {

	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Standup standup, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest, Users users) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, standup);
            
            return "standups/create";
        }
        uiModel.asMap().clear();
        
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        Users userByName = (Users)Users.findUsersesByUsernameEquals(name).getSingleResult();
        standup.setStandupConductor(userByName);
        
        standup.persist();
        return "redirect:/standups/" + encodeUrlPathSegment(standup.getId().toString(), httpServletRequest);
    }

	@RequestMapping(produces = "text/html")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("standups", Standup.findStandupEntries(firstResult, sizeNo));
            float nrOfPages = (float) Standup.countStandups() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("standups", Standup.findAllStandups());
        }
        addDateTimeFormatPatterns(uiModel);
        return "standups/list";
    }
}
