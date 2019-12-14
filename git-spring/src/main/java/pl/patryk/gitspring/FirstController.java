package pl.patryk.gitspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @GetMapping(value = "/users")
    public String getUser(Model model) throws Exception {
        model.addAttribute("person", new Person("Patryk", "Wolski", 22).get());
        return "person";
    }
}
