package org.example.controller;

import org.example.models.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * @author kushalsheth
 * @since 22/11/25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
