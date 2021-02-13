package ch.swissaquarelle.webapp;

import ch.swissaquarelle.svc.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final HelloService hs;

    @Autowired
    public HomeController(HelloService hs) {
        this.hs = hs;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("hs", hs);
        return "index";
    }
}
