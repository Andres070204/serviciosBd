package co.edu.unipiloto.controladores.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unipiloto.entidades.Solicitud;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    List<Solicitud> findByEstado(String estado);
}
