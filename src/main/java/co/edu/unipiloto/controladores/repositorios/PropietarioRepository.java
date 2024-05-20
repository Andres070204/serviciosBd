package co.edu.unipiloto.controladores.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.unipiloto.entidades.Propietario;

import java.util.List;

public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
    @Query("SELECT p FROM Propietario p WHERE p.ubicacion = :ubicacion AND p.capacidad >= :volumen AND p.disponibilidad = true")
    List<Propietario> findPropietariosCercanosYDisponibles(@Param("ubicacion") String ubicacion, @Param("volumen") Double volumen);
}
