package com.aplicacionesWebII.aplicacionesWebII.service.impl;

import com.aplicacionesWebII.aplicacionesWebII.model.Alumno;
import com.aplicacionesWebII.aplicacionesWebII.repository.AlumnoRepository;
import com.aplicacionesWebII.aplicacionesWebII.service.AlumnoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final  AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public Page<Alumno> findAll(Pageable pageable) {
        return alumnoRepository.findAll(pageable);
    }

    @Override
    public Page<Alumno> findall(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Alumno> findById(Integer id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public Alumno create(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno update(Alumno alumno) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Alumno update(Integer id, Alumno alumno) {
        alumno.setId_alumno(id);
        return alumnoRepository.save(alumno);
    }

    @Override
    public void deleteById(Integer id) {
        alumnoRepository.deleteById(id);
    }
}
