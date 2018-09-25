package com.mc.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PortalController {
  @RequestMapping("/")
  public String show(){
      return "index";
 }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }


}
