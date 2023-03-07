package pu.fmi.wordle.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

  @GetMapping(path = "/")
  @ResponseBody
  public String sayHello(HttpServletResponse res) {
    res.setContentType("plain/text;charset=ASCII");
    return "Hello 123 тест 😀";
  }
}
