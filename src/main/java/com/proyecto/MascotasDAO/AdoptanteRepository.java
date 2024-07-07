/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.MascotasDAO;

import com.proyecto.MascotasEntity.PerfilAdoptante;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos Valencia
 */
@Repository
public interface AdoptanteRepository extends JpaRepository<PerfilAdoptante, Integer> {
    
}
