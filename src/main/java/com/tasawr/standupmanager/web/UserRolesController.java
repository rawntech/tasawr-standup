package com.tasawr.standupmanager.web;

import com.tasawr.standupmanager.domain.UserRoles;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/userroleses")
@Controller
@RooWebScaffold(path = "userroleses", formBackingObject = UserRoles.class)
public class UserRolesController {
}
