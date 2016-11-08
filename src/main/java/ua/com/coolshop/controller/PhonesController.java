package ua.com.coolshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class PhonesController {


    @RequestMapping(value="/phone", method= RequestMethod.GET)
    public String phones(Model model){
        model.addAttribute("key", "value from controller");
        return "phone";
    }
}
