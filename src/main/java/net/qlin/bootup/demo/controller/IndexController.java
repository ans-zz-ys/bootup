package net.qlin.bootup.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index"}, method = {RequestMethod.GET})
    public String index(Model model) {
        model.addAttribute("greeting", "Hello World!");
        model.addAttribute("message", "bootup is running");

        return "demo/index/index";
    }
}
