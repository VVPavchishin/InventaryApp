package com.pavchishin.sklad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;

@Controller
@RequestMapping(path = "/")
public class StartController {

    @GetMapping
    public String getStartPage(Model model) {
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        model.addAttribute("ipAddress", Objects.requireNonNull(ip).getHostAddress() );
        return "index";
    }


}
