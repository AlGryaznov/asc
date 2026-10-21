package ru.alishev.spring.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/calculation")
    public String calculation(
            @RequestParam(value = "a", required = false) int a,
            @RequestParam(value = "b", required = false) int b,
            @RequestParam(value = "action", required = false) String action,
            Model model) {

        switch (action) {
            case "addition":
                model.addAttribute("result", a + b);
                break;
            case "subtraction":
                model.addAttribute("result",  a - b);
                break;
            case "multiplication":
                model.addAttribute("result", a * b);
                break;
            case "division":
                model.addAttribute("result", (double) a / b);
                break;
            default:
                model.addAttribute("result", "action not supported");
                break;
        }

        return "first/calculation";
    }

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello, "  + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {

        model.addAttribute("message", "Hello, "  + name + " " + surname);

        return "first/goodbye";
    }
}
