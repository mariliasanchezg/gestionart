package com.pol.gestionart.security;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.validation.constraints.NotEmpty;

import com.pol.gestionart.main.GenericEntity;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(name = "rol_codigo_uk", columnNames = { "codigo" }) })
public class Rol extends GenericEntity {
	private static final String SECUENCIA = "rol_id_seq";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SECUENCIA)
	@SequenceGenerator(name = SECUENCIA, sequenceName = SECUENCIA)
	private Long id;

	@NotNull(message = "rol.codigo.notNull")
	@NotEmpty(message = "rol.codigo.notBlank")
	@Size(max = 20, message = "rol.codigo.size")
	private String codigo;

	@NotNull(message = "rol.descripcion.notNull")
	@NotEmpty(message = "rol.descripcion.notBlank")
	@Size(max = 100, message = "rol.descripcion.size")
	private String descripcion;
	
//	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.PERSIST, CascadeType.MERGE,CascadeType.ALL, CascadeType.REFRESH, CascadeType.DETACH })
//	@JoinTable(name = "rol_permiso", joinColumns = @JoinColumn(name = "rol_id"), inverseJoinColumns = @JoinColumn(name = "permiso_id"))
//	
//	private List<Permiso> listPermiso;
//	
	
	public Rol() {
	}

	
	
	public Rol(Long id, String codigo, String descripcion, List<Permiso> listPermiso) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;

	}


	@Override
	public String toString() {
		return "Rol [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}

	

	
	
}
