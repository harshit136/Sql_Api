package com.example.Sql_Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add_user")
    public String createUser(@RequestBody() User user) {

        //we can also add try catch block
        return userService.createUser(user);
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id) {
        return userService.getUser(id);
    }

    @GetMapping("/get_all_user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
