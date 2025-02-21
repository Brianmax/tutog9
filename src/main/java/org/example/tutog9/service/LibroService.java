package org.example.tutog9.service;

import org.example.tutog9.request.LibroRequest;
import org.example.tutog9.response.LibroResponse;

public interface LibroService {
    LibroResponse createLibro(LibroRequest libroRequest);
}
