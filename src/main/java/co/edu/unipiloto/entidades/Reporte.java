package co.edu.unipiloto.entidades;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "reportes")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long remisionId;
    private Timestamp fechaHora;
    private String ubicacionActual;
    private String novedad;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRemisionId() {
		return remisionId;
	}
	public void setRemisionId(Long remisionId) {
		this.remisionId = remisionId;
	}
	public Timestamp getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Timestamp fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getUbicacionActual() {
		return ubicacionActual;
	}
	public void setUbicacionActual(String ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}
	public String getNovedad() {
		return novedad;
	}
	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}
    
    
}
