/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.MascotasServicio;

import com.proyecto.MascotasEntity.PerfilAdoptante;
import java.util.List;
import java.util.Optional;


public interface AdoptantesService {
    
        
    public  List<PerfilAdoptante> listadoAdoptantes(); 
    
    public PerfilAdoptante RegistrarAdoptante(PerfilAdoptante Adoptante);
    
    public  Optional<PerfilAdoptante> buscarAdoptanteId(int idAdoptante);  
    
    public void eliminarAdoptante(int idAdoptante); 
    
    public PerfilAdoptante  actualizarAdoptante(PerfilAdoptante Adoptante);

    
}
