
package com.proyecto.MascotasServicio;

import com.proyecto.MascotasEntity.Mascotas;
import java.util.List;
import java.util.Optional;


public interface MascotasService {
    
    public  List<Mascotas> listadoMascotas(); 
    
    public Mascotas publicarMascota(Mascotas mascota);
    
    public  Optional<Mascotas> buscarMascotaId(int idMascota);  
    
    public void eliminarMascota(int idMascota); 
    
    public Mascotas actualizarMascota(Mascotas mascota);
    
    public List<Mascotas> listadoUltimasMascotas();
    
    
}
