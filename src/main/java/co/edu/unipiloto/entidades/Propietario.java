package co.edu.unipiloto.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "propietarios")
public class Propietario {
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double capacidad;
    private Boolean disponibilidad;
    private String ubicacion;

}
