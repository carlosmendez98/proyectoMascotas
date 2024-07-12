package com.proyecto.controlador;

import com.proyecto.MascotasEntity.Mascotas;
import com.proyecto.MascotasServicio.MascotasServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascota")
public class ControladorMascotas {

    @Autowired(required = true)
    private MascotasServiceImpl mascotasServiceImpl;

    // listado de mascotas
    @GetMapping
    public List<Mascotas> listadoMascotas() {
        return this.mascotasServiceImpl.listadoMascotas();

    }

    // Publicar Mascota 
    @PostMapping
    public Mascotas publicarMascota(@RequestBody Mascotas mascota) {
        return this.mascotasServiceImpl.publicarMascota(mascota);
    }

    //Buscar mascota por id  /mascota/id
    @GetMapping("/{id}")
    public ResponseEntity<Mascotas> usuarioPorID(@PathVariable int id) {
        Optional<Mascotas> mascotasID = this.mascotasServiceImpl.buscarMascotaId(id);
        if (mascotasID.isPresent()) {
            return ResponseEntity.ok(mascotasID.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //eliminar mascota estado Delete: /mascota/id
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        Optional<Mascotas> mascotaID = this.mascotasServiceImpl.buscarMascotaId(id);
        if (mascotaID.isPresent()) {
            this.mascotasServiceImpl.eliminarMascota(id);
            System.out.println("Mascota Eliminada" + mascotaID.get()); // mensajes en consola 
        } else {
            System.out.println("mascota NO Encontrada"); // mensajes en consola 

        }
    }
    //Modificar Mascota Put: /mascota/id

    @PutMapping("/{id}")
    public void actualizarUsuario(@RequestBody Mascotas mascota) {
        Optional<Mascotas> mascotaId = this.mascotasServiceImpl.buscarMascotaId(mascota.getIdmascotas());

        if (mascotaId.isPresent()) {
            Mascotas mascotaModificar = mascotaId.get();
            mascotaModificar.setNombre(mascota.getNombre());
            mascotaModificar.setEspecie(mascota.getEspecie());
            mascotaModificar.setRaza(mascota.getRaza());
            mascotaModificar.setEdad(mascota.getEdad());
            mascotaModificar.setDescripcion(mascota.getDescripcion());
            mascotaModificar.setFotos(mascota.getFotos());
            mascotaModificar.setFechadeIngreso(mascota.getFechadeIngreso());

            this.mascotasServiceImpl.actualizarMascota(mascotaModificar);
            System.out.println("Mascota Actualizado ID= " + mascota.getIdmascotas() + "Mascota: " + mascotaModificar);

        } else {
            System.out.println(" ***   MASCOTA NO ENCONTRADA *****  ");
        }
    }

}
