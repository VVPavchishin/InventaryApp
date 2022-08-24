package com.pavchishin.sklad.controller;

import com.pavchishin.sklad.repository.PartRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.pavchishin.sklad.utilities.ExcelParser.excelReader;

@Controller
@RequestMapping(path = "/parts")
public class LoadController {

    public final PartRepository repository;
    public LoadController(PartRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/upload")
    public String getPartsLoader() {
        return "parts";
    }

    @PostMapping(path = "/upload")
    public String partsLoader(@RequestParam("filePath") String pathToFile){
        excelReader(pathToFile, repository);
        return "redirect:/";
    }
}
