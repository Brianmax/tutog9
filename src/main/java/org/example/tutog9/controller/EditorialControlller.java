package org.example.tutog9.controller;

import org.example.tutog9.request.EditorialDto;
import org.example.tutog9.service.EditorialService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/editorial")

public class EditorialControlller {
    private EditorialService editorialService;
    
    public EditorialControlller(EditorialService editorialService) {
        this.editorialService = editorialService;
    }
    
    @PostMapping("/save")
    public EditorialDto saveEditorial(@RequestBody EditorialDto editorialDto) {
        return editorialService.createEditorial(editorialDto);
    }
}
