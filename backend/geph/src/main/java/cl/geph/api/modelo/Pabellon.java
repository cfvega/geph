package cl.geph.api.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Pabellon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="sala")
	private int sala;
	
	@Column(name="descripcion", length=255)
	private String descripcion;
	
	@Column(name="estado")
	private boolean estado;
	
	
	public void setNew(int sala, String descripcion, boolean estado) {
		this.descripcion = descripcion;
		this.sala = sala;
		this.estado = estado;
	}
	
	
	
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public int getSala() {
		return this.sala;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	
	

}
