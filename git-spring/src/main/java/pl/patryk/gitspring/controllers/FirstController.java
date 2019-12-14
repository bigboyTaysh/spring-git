package pl.patryk.gitspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patryk.gitspring.models.Person;

@RestController
public class FirstController {

    @GetMapping(value = "/users")
    public String getUser(Model model) throws Exception {
        model.addAttribute("person", new Person("Patryk", "Wolski", 22).get());
        return "person";
    }

    @GetMapping(value = "/name")
    public String getUser2(Model model) throws Exception {
        model.addAttribute("person", new Person("Patryk", "Wolski", 22).getName());
        return "person";
    }
}
