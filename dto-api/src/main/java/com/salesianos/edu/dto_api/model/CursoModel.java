package com.salesianos.edu.dto_api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CursoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    private String nombre;

    private TipoCurso tipoCurso;


    @ToString.Exclude
	@EqualsAndHashCode.Exclude
	@Builder.Default
    @OneToMany  (mappedBy = "curso",
    fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Asignatura> asignaturas = new ArrayList<Asignatura>();

}
