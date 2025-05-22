package pl.edu.vistula.firstprojectjava_springprojectnewstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "Tadiwanashe", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("Tadiwanashe", name);
        return "greeting";
    }
}
