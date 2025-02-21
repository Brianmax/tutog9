package org.example.tutog9.controller;

import org.example.tutog9.request.LibroRequest;
import org.example.tutog9.response.LibroResponse;
import org.example.tutog9.service.LibroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/libro")
public class LibroController {
    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }
    
    @PostMapping("/save")
    public LibroResponse createLibro(@RequestBody LibroRequest libroRequest) {
        return libroService.createLibro(libroRequest);
    }
}
