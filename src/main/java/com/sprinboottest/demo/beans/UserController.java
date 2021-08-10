package com.sprinboottest.demo.beans;

import com.sprinboottest.demo.models.User;
import com.sprinboottest.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) { this.userService = userService;}

    @PostMapping("/logger")
    public ModelAndView verification(User user) {
        ModelAndView mav = new ModelAndView("je_suis");
        String mail = user.getEmail();
        User connecter = userService.loadUserByEmail(mail);

        mav.addObject("connect", connecter);
        return mav;
    }

}
