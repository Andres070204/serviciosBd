package co.edu.unipiloto.controladores.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.unipiloto.entidades.Remision;

import java.time.LocalDateTime;
import java.util.List;

public interface RemisionRepository extends JpaRepository<Remision, Long> {
	 List<Remision> findByPlacaCamionAndFechaHoraRecogidaBetween(String placaCamion, LocalDateTime desde, LocalDateTime hasta);
	    List<Remision> findByPlacaCamion(String placaCamion);
	    List<Remision> findByPlacaCamionAndFechaHoraEntrega(String placaCamion, LocalDateTime fechaHora);
}
