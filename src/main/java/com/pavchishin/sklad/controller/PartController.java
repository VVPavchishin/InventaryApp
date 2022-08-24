package com.pavchishin.sklad.controller;

import com.pavchishin.sklad.repository.PartRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/parts")
public class PartController {

    public final PartRepository repository;
    public PartController(PartRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public String getPartsList(Model model) {
        model.addAttribute("parts", repository.findAll());
        return "parts";
    }
}
