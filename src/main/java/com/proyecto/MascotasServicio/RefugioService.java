/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.MascotasServicio;

import com.proyecto.MascotasEntity.PerfilRefugio;
import java.util.List;
import java.util.Optional;




public interface RefugioService {
    
        public  List<PerfilRefugio> listadoRefugios(); 
    
    public PerfilRefugio RegistrarRefugio(PerfilRefugio Refugio);
    
    public  Optional<PerfilRefugio> buscarRefugioId(int idRefugio);  
    
    public void eliminarRefugio(int idRefugio); 
    
    public PerfilRefugio actualizarRefugio(PerfilRefugio  PerfilRefugio);
    
}
