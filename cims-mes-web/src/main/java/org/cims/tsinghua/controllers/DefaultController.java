package org.cims.tsinghua.controllers;

import org.cims.tsinghua.services.SimpleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
  @Autowired
  private SimpleOrder simpleOrder;
  
  @RequestMapping("/home")
  public String homeController(Model model){
    model.addAttribute("name", simpleOrder.retriveName());
    return "home";
  }
}
