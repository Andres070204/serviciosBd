package co.edu.unipiloto.controladores.repositorios;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unipiloto.entidades.Reporte;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
    List<Reporte> findByUbicacionActualAndFechaHoraEntrega(String ubicacionActual, LocalDateTime fechaHora);
}
