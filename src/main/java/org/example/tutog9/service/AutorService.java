package org.example.tutog9.service;

import org.example.tutog9.repository.AutorRepository;
import org.example.tutog9.request.AutorRequest;
import org.example.tutog9.response.AutorResponse;

public interface AutorService {
    AutorResponse createAutor(AutorRequest autorRequest);
    AutorResponse findById(int id);
}
