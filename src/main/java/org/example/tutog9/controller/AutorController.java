package org.example.tutog9.controller;

import lombok.AllArgsConstructor;
import org.example.tutog9.repository.AutorRepository;
import org.example.tutog9.request.AutorRequest;
import org.example.tutog9.response.AutorResponse;
import org.example.tutog9.service.AutorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autor")
@AllArgsConstructor
public class AutorController {
    private AutorRepository autorRepository;
    private AutorService autorService;
    
    @PostMapping
    public AutorResponse createAutor(@RequestBody AutorRequest autorRequest) {
        return autorService.createAutor(autorRequest);
    }
}
