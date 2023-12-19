package com.mysite.medium;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping("/medium")
  @ResponseBody
  public String index() {
    System.out.println("index");
    return "안녕하세요 medium에 오신것을 환영합니다.";
  }

  @GetMapping("/")
  public String root() {
    return "redirect:/post/list"; 

  }
}
