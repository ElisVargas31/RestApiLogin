

package com.api.rest.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud") // Nombre de la tabla en la base de datos
public class Solicitud{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private int id;

    @Column(nullable = false)
    private String fecha;

    @Column (nullable = false)
    private String estado;

    @Column(nullable = false)
    private String cargo;

    @Column(name = "cliente_id", nullable = false)
    private int cliente_id;

    @Column(nullable = false)
    private String experiencia;

    @Column(name = "tipo_contrato", nullable = false)
    private String tipo_de_contrato;

    @Column(name = "nivel_profesional", nullable = false)
    private String nivel_profesion;

    @Column(columnDefinition = "comentario") // Para campos largos como comentarios
    private String comentario;

    @Column
    private String otros;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getTipo_de_contrato() {
        return tipo_de_contrato;
    }

    public void setTipo_de_contrato(String tipo_de_contrato) {
        this.tipo_de_contrato = tipo_de_contrato;
    }

    public String getNivel_profesion() {
        return nivel_profesion;
    }

    public void setNivel_profesion(String nivel_profesion) {
        this.nivel_profesion = nivel_profesion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
}

