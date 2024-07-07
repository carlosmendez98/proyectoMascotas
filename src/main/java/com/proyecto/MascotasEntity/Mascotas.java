
package com.proyecto.MascotasEntity;

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
    @Column(name = "idMascotas")
    private int idMascotas;

   
    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Especie")
    private String Especie;

    @Column(name = "Raza")
    private String Raza;

    @Column(name = "Edad")
    private int Edad;

    @Column(name = "Tamano")
    private double Tamano;

    @Column(name = "Descripcion")
    private String Descripcion;

    @Column(name = "Fotos")
    private String Fotos;

    @Column(name = "Estado")
    private String Estado;

   @Column(name = "FechaDeIngreso")
    @Temporal(TemporalType.DATE)
    private Date FechaDeIngreso;
   
    @ManyToOne
    @JoinColumn(name = "idRefugio")
    private PerfilRefugio idRefugio; // relación con la entidad PerfilRefugio

}