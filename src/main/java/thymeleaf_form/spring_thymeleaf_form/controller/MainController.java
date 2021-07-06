package thymeleaf_form.spring_thymeleaf_form.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import thymeleaf_form.spring_thymeleaf_form.init.User;

@Controller
public class MainController {

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        List<String> professionList = Arrays.asList("Developer", "Service", "Designer");
        model.addAttribute("professionList", professionList);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("userAtt") User user) {
        System.out.println(user);
        return "register_success";

    }

}
