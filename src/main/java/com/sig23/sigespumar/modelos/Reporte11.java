package com.sig23.sigespumar.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by kevin on 06-30-17.
 */
/*
* Kevin Rivera
* Fecha: 06-30-17
* Descripción: 
*/
@Entity
@Table(name = "reporte_11")
public class Reporte11 {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "cod_sala")
    private String codSala;
    @Column(name = "nombre_juego")
    private String nombreJuego;
    @Column(name = "costo_total")
    private Double costoTotal;
    @Column(name = "fecha")
    private Date fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodSala() {
        return codSala;
    }

    public void setCodSala(String codSala) {
        this.codSala = codSala;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
