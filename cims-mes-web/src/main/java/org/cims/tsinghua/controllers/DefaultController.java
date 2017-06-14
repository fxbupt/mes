package org.cims.tsinghua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
  
  @RequestMapping("/home")
  public String homeController(Model model){
    return "home";
  }
}
