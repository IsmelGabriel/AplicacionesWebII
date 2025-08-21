package com.aplicacionesWebII.aplicacionesWebII.controller;

import com.aplicacionesWebII.aplicacionesWebII.model.Alumno;
import com.aplicacionesWebII.aplicacionesWebII.service.AlumnoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    private AlumnoService alumnoService;

    @GetMapping
    public Page<Alumno> getAll(@RequestParam int page, @RequestParam int size) {
        Pageable pageable  = PageRequest.of(page, size);
        return alumnoService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Optional<Alumno> getById(@PathVariable Integer id) {
        return alumnoService.findById(id);
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) {
        return alumnoService.create(alumno);
    }

    @PutMapping("/{id}")
    public Alumno update(@PathVariable Integer id, @RequestBody Alumno alumno) {
        return alumnoService.update(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        alumnoService.deleteById(id);
    }
}
