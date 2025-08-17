package com.aplicacionesWebII.aplicacionesWebII.service;

import com.aplicacionesWebII.aplicacionesWebII.model.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProfesorService {
    Page<Profesor> findAll(Pageable pageable);

    Page<Profesor> findall(Pageable pageable);

    Optional<Profesor> findById(Integer id);
    Profesor create(Profesor profesor);
    Profesor update(Profesor profesor);
    void delete(Integer id);

    Profesor update(Integer id, Profesor profesor);

    void deleteById(Integer id);
}
