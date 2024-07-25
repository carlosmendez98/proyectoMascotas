/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controlador;

import com.proyecto.MascotasDAO.RefugioRepository;
import com.proyecto.MascotasEntity.PerfilRefugio;
import com.proyecto.MascotasServicio.RefugioServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refugios")
public class ControladorRefugio {

    @Autowired(required = true)
    RefugioServiceImpl RefugioRepositoryServiceImpl;

    
    //LISTADO DE REFUGIOS 
    @GetMapping
    public List<PerfilRefugio> listadoDeRefugios() {
        return this.RefugioRepositoryServiceImpl.listadoRefugios();
    }
    
    //REGISTRAR REFUGIOS 
    @PostMapping
    public PerfilRefugio registrarRefugio(@RequestBody PerfilRefugio perfilRefugio) {
        return this.RefugioRepositoryServiceImpl.RegistrarRefugio(perfilRefugio);

    }
    
  //OBTENER REFUGIOS POR ID 
    @GetMapping("/{id}")
    public ResponseEntity<PerfilRefugio> buscarporId(@PathVariable int idRefugio) {
        Optional<PerfilRefugio> perfilRefugioID = this.RefugioRepositoryServiceImpl.buscarRefugioId(idRefugio);
        if (perfilRefugioID.isPresent()) {
            System.out.println("Refugio Encontrado: " + perfilRefugioID.get());
            return ResponseEntity.ok().build();
        } else {
            System.out.println("*** Refugio NO encontrado **** ");
            return ResponseEntity.notFound().build();
        }

    }

    //ACTUALIZAR REFUGIO 
    @PutMapping("/{id}")
    public void ActualizarRefugio(@PathVariable int idRefugio, @RequestBody PerfilRefugio Refugio) {
        Optional<PerfilRefugio> perfilRefugioID = this.RefugioRepositoryServiceImpl.buscarRefugioId(idRefugio);
        if (perfilRefugioID.isPresent()) {
            PerfilRefugio refugioModificar = perfilRefugioID.get();
            refugioModificar.setNombre_refugio(Refugio.getNombre_refugio());
            refugioModificar.setDireccion(Refugio.getDireccion());
            refugioModificar.setEmailcontacto(Refugio.getEmailcontacto());
            refugioModificar.setTelefono(Refugio.getTelefono());

            this.RefugioRepositoryServiceImpl.actualizarRefugio(refugioModificar);
            System.out.println("Refugio Actualizado ");

        }else{
        
            System.out.println(" *** ** Refugio Nose puede Modificar ****   ");
        }

    }
 
    
    // ELIMINAR REFUGIO POR ID 
    @DeleteMapping("/{id}")
    public void EliminarRefugio(@PathVariable int idRefugio) {
        Optional<PerfilRefugio> perfilRefugioID = this.RefugioRepositoryServiceImpl.buscarRefugioId(idRefugio);
        if (perfilRefugioID.isPresent()) {
            this.RefugioRepositoryServiceImpl.eliminarRefugio(idRefugio);
            System.out.println("Refugio Eliminado ");
        } else {
            System.out.println(" ******* Refugio NO encontrado ******** ");
        }
    }
}
