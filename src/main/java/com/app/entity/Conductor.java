package com.app.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;


@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @Column(name = "id_conductor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConductor;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private String dni;
    
    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;
    
    @Column(name = "tipo_licencia")
    private String tipoLicencia;
    
    @Column(name = "licencia")
    private String licencia;

    @Column(name = "estado")
    private String estado;
    
    @OneToMany(mappedBy = "conductor")
    private List<GuiaRemision> guiasRemision;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    
 // Getters and Setters
    
	public Integer getIdConductor() {
		return idConductor;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setIdConductor(Integer idConductor) {
		this.idConductor = idConductor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public Conductor(Integer idConductor, String nombre, String apellido, String dni, String telefono, String correo,
			String tipoLicencia, String licencia, String estado, LocalDateTime fechaCreacion) {
		super();
		this.idConductor = idConductor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoLicencia = tipoLicencia;
		this.licencia = licencia;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
	}

	public Conductor() {
		super();
	}
	
	@PrePersist
	protected void onCreate() {
	    this.fechaCreacion = LocalDateTime.now();
	}
    
}