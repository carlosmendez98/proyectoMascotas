
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

   
    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Especie")
    private String especie;

    @Column(name = "Raza")
    private String raza;

    @Column(name = "Edad")
    private int edad;

    @Column(name = "Tamano")
    private double tamano;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Fotos")
    private String fotos;

    @Column(name = "Estado")
    private String estado;

   @Column(name = "fechadeingreso")
    @Temporal(TemporalType.DATE)
    private Date fechadeIngreso;
   
    @ManyToOne
    @JoinColumn(name = "idRefugio", referencedColumnName = "idRefugio")
    @JsonBackReference
    private PerfilRefugio perfilRefugio;
}