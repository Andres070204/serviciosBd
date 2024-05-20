package co.edu.unipiloto.entidades;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
	@Table(name = "remisiones")
	public class Remision {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Long solicitudId;
	    private Timestamp fechaHoraEntrega;
	    private Timestamp fechaHoraRecogida;
	    private String origen;
	    private String destino;
	    private String placaCamion;
	    private String conductor;
	    private String ruta;
	    private Integer unidadesCarga;
	    private Double volumenTotal;
	    private Double pesoTotal;
	    private String cuidadosEspeciales;
	    private String estado;
	    
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
		public Timestamp getFechaHoraRecogida() {
			return fechaHoraRecogida;
		}
		public void setFechaHoraRecogida(Timestamp fechaHoraRecogida) {
			this.fechaHoraRecogida = fechaHoraRecogida;
		}
		public String getOrigen() {
			return origen;
		}
		public void setOrigen(String origen) {
			this.origen = origen;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getPlacaCamion() {
			return placaCamion;
		}
		public void setPlacaCamion(String placaCamion) {
			this.placaCamion = placaCamion;
		}
		public String getConductor() {
			return conductor;
		}
		public void setConductor(String conductor) {
			this.conductor = conductor;
		}
		public String getRuta() {
			return ruta;
		}
		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
		public Integer getUnidadesCarga() {
			return unidadesCarga;
		}
		public void setUnidadesCarga(Integer unidadesCarga) {
			this.unidadesCarga = unidadesCarga;
		}
		public Double getVolumenTotal() {
			return volumenTotal;
		}
		public void setVolumenTotal(Double volumenTotal) {
			this.volumenTotal = volumenTotal;
		}
		public Double getPesoTotal() {
			return pesoTotal;
		}
		public void setPesoTotal(Double pesoTotal) {
			this.pesoTotal = pesoTotal;
		}
		public String getCuidadosEspeciales() {
			return cuidadosEspeciales;
		}
		public void setCuidadosEspeciales(String cuidadosEspeciales) {
			this.cuidadosEspeciales = cuidadosEspeciales;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
	    public Timestamp getFechaHoraEntrega() {
	        return fechaHoraEntrega;
	    }

	    public void setFechaHoraEntrega(Timestamp fechaHoraEntrega) {
	        this.fechaHoraEntrega = fechaHoraEntrega;
	    }
}
