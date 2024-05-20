package co.edu.unipiloto.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "aplicaciones")
public class Aplicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long solicitudId;
    private Long propietarioId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(Long solicitudId) {
		this.solicitudId = solicitudId;
	}
	public Long getPropietarioId() {
		return propietarioId;
	}
	public void setPropietarioId(Long propietarioId) {
		this.propietarioId = propietarioId;
	}

}