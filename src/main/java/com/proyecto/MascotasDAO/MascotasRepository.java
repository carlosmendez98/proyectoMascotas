
package com.proyecto.MascotasDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.MascotasEntity.Mascotas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Carlos Valencia
 */
@Repository
public interface MascotasRepository extends JpaRepository<Mascotas, Integer>{
    
   @Query("SELECT m FROM Mascotas m ORDER BY m.idmascotas DESC")
    List<Mascotas> findTop10ByOrderByIdmascotasDesc();
}
