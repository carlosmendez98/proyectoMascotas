package com.proyecto.MascotasDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.MascotasEntity.Usuarios;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    // Métodos personalizados si es necesario
}
