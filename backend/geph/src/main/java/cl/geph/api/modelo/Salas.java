package cl.geph.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="cama")
	private int cama;
	
	@Column(name="sala")
	private int sala;
	
	@Column(name="descripcion", length=255)
	private String descripcion;
	
	@Column(name="estado")
	private boolean estado;
	
	public void setNew(int sala, int cama, String descripcion, boolean estado) {
		this.descripcion = descripcion;
		this.cama = cama;
		this.estado = estado;
		this.sala=sala;
	}
	
	
	
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public int getCama() {
		return this.cama;
	}
	public int getSala() {
		return this.sala;
	}
	
	public int getId() {
		return this.id;
	}
}
