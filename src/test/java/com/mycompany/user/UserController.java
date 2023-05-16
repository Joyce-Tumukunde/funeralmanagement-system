package com.mycompany.user;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired private UserService service;
    @GetMapping(value = "/users")
    public String ShowUserList(Model model){
        List<User> listUsers = Service.listAll();
        model.addAttribute("/users", listUsers);

        return" user";
    }
}
