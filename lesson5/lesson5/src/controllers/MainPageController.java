package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home", produces = "text/xml; charset=UTF-8")
public class MainPageController {

    @GetMapping()
    public String home() {
        return "home/home";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
