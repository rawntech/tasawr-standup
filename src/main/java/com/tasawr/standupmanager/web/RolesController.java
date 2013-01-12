package com.tasawr.standupmanager.web;

import com.tasawr.standupmanager.domain.Roles;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/roleses")
@Controller
@RooWebScaffold(path = "roleses", formBackingObject = Roles.class)
public class RolesController {
}
