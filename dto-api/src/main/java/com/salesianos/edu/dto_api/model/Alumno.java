package com.salesianos.edu.dto_api.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codAlumno;

    private String nombre , apellidos , direccion , email;

    private Integer telefono;

    private Date fechaNacimiento;
}
