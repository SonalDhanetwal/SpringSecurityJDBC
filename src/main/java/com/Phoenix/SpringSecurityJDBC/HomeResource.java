package com.Phoenix.SpringSecurityJDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String Home()
    {
        return ("<H1> Welcome to Home</H1>");
    }

    @GetMapping("/user")
    public String User()
    {
        return ("<H1> Welcome to User</H1>");
    }

    @GetMapping("/admin")
    public String Admin()
    {
        return ("<H1> Welcome to Admin</H1>");
    }
}
