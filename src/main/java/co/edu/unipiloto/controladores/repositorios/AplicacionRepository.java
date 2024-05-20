package co.edu.unipiloto.controladores.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unipiloto.entidades.Aplicacion;

public interface AplicacionRepository extends JpaRepository<Aplicacion, Long> {
}
