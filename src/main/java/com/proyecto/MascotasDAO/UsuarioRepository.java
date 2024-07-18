package com.proyecto.MascotasDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.MascotasEntity.Usuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    @Query("SELECT u FROM Usuarios u WHERE u.email = :email")
    Usuarios findByEmail (@Param("email") String email);
}