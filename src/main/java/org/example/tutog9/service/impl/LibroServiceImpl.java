package org.example.tutog9.service.impl;

import org.example.tutog9.entity.AutorEntity;
import org.example.tutog9.entity.EditorialEntity;
import org.example.tutog9.entity.LibroEntity;
import org.example.tutog9.repository.AutorRepository;
import org.example.tutog9.repository.EditorialRepository;
import org.example.tutog9.repository.LibroRepository;
import org.example.tutog9.request.EditorialDto;
import org.example.tutog9.request.LibroRequest;
import org.example.tutog9.response.LibroResponse;
import org.example.tutog9.service.LibroService;
import org.springframework.expression.spel.ast.OpOr;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    
    private final AutorRepository autorRepository;
    private final LibroRepository libroRepository;
    private final EditorialRepository editorialRepository;

    public LibroServiceImpl(AutorRepository autorRepository, LibroRepository libroRepository, EditorialRepository editorialRepository) {
        this.autorRepository = autorRepository;
        this.libroRepository = libroRepository;
        this.editorialRepository = editorialRepository;
    }

    @Override
    public LibroResponse createLibro(LibroRequest libroRequest) {
        Optional<AutorEntity> autorOptional = autorRepository.findById(libroRequest.getIdAutor());
        Optional<EditorialEntity> editorialOptional = editorialRepository.findById(libroRequest.getRucEditorial());
        if(autorOptional.isEmpty() || editorialOptional.isEmpty()) {
            return null;
        }
        
        LibroEntity libroEntity = new LibroEntity();
        libroEntity.setIsbn(libroRequest.getIsbn());
        libroEntity.setNombre(libroRequest.getNombre());
        libroEntity.setFechaPublicacion(libroRequest.getFechaPublicacion());
        libroEntity.setCreatedAt(LocalDate.now());
        libroEntity.setEstado(true);
        
        libroEntity.setAutorEntity(autorOptional.get());
        libroEntity.setEditorialEntity(editorialOptional.get());
        
        libroRepository.save(libroEntity);
        autorOptional.get().setNumLibros(autorOptional.get().getNumLibros() + 1);
        autorRepository.save(autorOptional.get());
        
        return new LibroResponse(
                libroEntity.getIsbn(),
                libroEntity.getNombre(),
                libroEntity.getFechaPublicacion(),
                libroEntity.getEdicion(),
                libroEntity.getAutorEntity().getNombre() + " " + libroEntity.getAutorEntity().getApellido(),
                libroEntity.getEditorialEntity().getNombre());
    }
}
