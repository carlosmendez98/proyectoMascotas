
package com.proyecto.controlador;


import com.proyecto.MascotasEntity.PerfilAdoptante;
import com.proyecto.MascotasServicio.AdoptanteServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Adoptantes")
public class ControladorAdoptante {
    
    @Autowired(required = true)
    AdoptanteServiceImpl adoptanteServiceImpl;
    
    //LISTADO DE ADOPTANTES 
    @GetMapping
    public List<PerfilAdoptante> listadoAdoptantes(){
     return this.adoptanteServiceImpl.listadoAdoptantes();
    }
    
    // REGISTRAR ADOPTANTES 
    @PostMapping
    public PerfilAdoptante RegistrarAdoptante(@RequestBody PerfilAdoptante Adoptante){
        return this.adoptanteServiceImpl.RegistrarAdoptante(Adoptante);
    }
    
    // BUSCAR POR ID A ADOPTANTE
    
     @GetMapping("/{id}")
     public ResponseEntity<PerfilAdoptante> buscarporId(@PathVariable int idAdoptante){
         Optional<PerfilAdoptante> perfilAdoptanteId = this.adoptanteServiceImpl.buscarAdoptanteId(idAdoptante);
         
         if(perfilAdoptanteId.isPresent()){
            return  ResponseEntity.ok().build();
         }else{
            return ResponseEntity.notFound().build();
         } 
         
     }
     
     // ELIMINAR ADOPTANTE
     @DeleteMapping("/{id}")
     public void eliiminarAdoptante(@PathVariable int idAdoptante){
              Optional<PerfilAdoptante> perfilAdoptanteId = this.adoptanteServiceImpl.buscarAdoptanteId(idAdoptante);
             if(perfilAdoptanteId.isPresent()){
                 this.adoptanteServiceImpl.eliminarAdoptante(idAdoptante);
                   System.out.println("Adoptante Eliminada" + perfilAdoptanteId.get()); // mensajes en consola 
             }else{
             System.out.println("Adoptante NO Encontrado"); 
             }
         
     }
     
     //ACTUALIZAR ADOPTANTE
     @PutMapping("/{id}")
     public void actualizarAdoptante(@PathVariable int idAdoptante, @RequestBody PerfilAdoptante perfilAdoptante){
       Optional<PerfilAdoptante> perfilAdoptanteId = this.adoptanteServiceImpl.buscarAdoptanteId(idAdoptante);
           if(perfilAdoptanteId.isPresent()){
               PerfilAdoptante adoptanteModificar = perfilAdoptanteId.get();
               adoptanteModificar.setNombre(perfilAdoptante.getNombre());
               adoptanteModificar.setApellido(perfilAdoptante.getApellido());
               adoptanteModificar.setDireccion(perfilAdoptante.getDireccion());
                 adoptanteModificar.setTelefono(perfilAdoptante.getTelefono());
               adoptanteModificar.setHistorial_de_Adopcion(perfilAdoptante.getHistorial_de_Adopcion());
        this.adoptanteServiceImpl.actualizarAdoptante( adoptanteModificar);
        
               System.out.println("Adoptante Modificado " +  adoptanteModificar);
           }
           else {
               System.out.println(" *****  Adoptante NO ENCONTRADO  ***** ");
           }
       
     }
    
    
    
}
