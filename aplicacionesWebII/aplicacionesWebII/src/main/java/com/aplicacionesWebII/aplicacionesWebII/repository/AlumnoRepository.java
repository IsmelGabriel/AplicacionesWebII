package com.aplicacionesWebII.aplicacionesWebII.repository;

import com.aplicacionesWebII.aplicacionesWebII.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno,Integer> {
}
