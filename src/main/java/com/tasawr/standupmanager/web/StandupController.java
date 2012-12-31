package com.tasawr.standupmanager.web;

import com.tasawr.standupmanager.domain.Standup;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/standups")
@Controller
@RooWebScaffold(path = "standups", formBackingObject = Standup.class)
public class StandupController {
}
