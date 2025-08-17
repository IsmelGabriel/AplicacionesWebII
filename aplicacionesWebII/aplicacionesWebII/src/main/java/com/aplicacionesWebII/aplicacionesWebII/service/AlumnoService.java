package com.aplicacionesWebII.aplicacionesWebII.service;

import com.aplicacionesWebII.aplicacionesWebII.model.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AlumnoService {
    Page<Alumno> findAll(Pageable pageable);

    Page<Alumno> findall(Pageable pageable);

    Optional<Alumno> findById(Integer id);
    Alumno create(Alumno alumno);
    Alumno update(Alumno alumno);
    void delete(Integer id);

    Alumno update(Integer id, Alumno alumno);

    void deleteById(Integer id);
}
