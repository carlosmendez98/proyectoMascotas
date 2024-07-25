package com.proyecto.MascotasEntity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "mascotas")
public class Mascotas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmascotas")
    private int idmascotas;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "especie")
    private String especie;

    @Column(name = "raza")
    private String raza;

    @Column(name = "edad")
    private int edad;

    @Column(name = "tamano")
    private double tamano;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fotos")
    private String fotos;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fechadeingreso")
    @Temporal(TemporalType.DATE)
    private Date fechadeIngreso;

    @ManyToOne
    @JoinColumn(name = "idrefugio", referencedColumnName = "idrefugio")  // Asegúrate de que este nombre coincida con la base de datos
    @JsonBackReference
    private PerfilRefugio perfilRefugio;
}