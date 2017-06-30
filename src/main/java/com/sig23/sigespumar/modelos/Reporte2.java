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
@Table(name = "reporte_2")
public class Reporte2 {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "cod_sal")
    private String codSal;
    @Column(name = "costo_mo")
    private Double costoMo;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "nombre_juego")
    private String nombreJuego;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodSal() {
        return codSal;
    }

    public void setCodSal(String codSal) {
        this.codSal = codSal;
    }

    public Double getCostoMo() {
        return costoMo;
    }

    public void setCostoMo(Double costoMo) {
        this.costoMo = costoMo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
}
