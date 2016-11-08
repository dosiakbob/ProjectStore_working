package ua.com.coolshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.coolshop.entity.User;
import ua.com.coolshop.service.UserService;
;

import java.security.Principal;
@Controller
public class UserController {

    @Autowired
    private UserService userService;





    @RequestMapping(value="/newUser", method=RequestMethod.POST)
    public String saveUser(@ModelAttribute User user){


        userService.save(user);
        return "redirect:/";
    }
    @RequestMapping (value="/login", method=RequestMethod.GET)
    public String login(){
            return "login";
    }

    @RequestMapping (value="/logout", method=RequestMethod.POST)
    public String logout(){
        return "redirect:/";
    }

    @RequestMapping (value="/home", method=RequestMethod.POST)
    public String home(){
        return "redirect:/";
    }

    @RequestMapping (value="/loginprocesing", method=RequestMethod.POST)
    public String loginprocesing(){
        return "redirect:/";
    }

    @RequestMapping (value="/getOrder", method=RequestMethod.GET)
    public String getOrder(Principal principal){

        User user = userService.findOne(Integer.parseInt(principal.getName()));

        System.out.println();
        return "redirect:/";
    }
}
