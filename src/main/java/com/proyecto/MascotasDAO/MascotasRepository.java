/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.MascotasDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.MascotasEntity.Mascotas;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Carlos Valencia
 */
@Repository
public interface MascotasRepository extends JpaRepository<Mascotas, Integer>{
    
}
