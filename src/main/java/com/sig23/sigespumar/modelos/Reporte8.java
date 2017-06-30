package com.sig23.sigespumar.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kevin on 06-30-17.
 */
/*
* Kevin Rivera
* Fecha: 06-30-17
* Descripción: 
*/
@Entity
@Table(name = "reporte_8")
public class Reporte8 {

    @Id
    @Column(name = "cod_sala")
    public String codSala;
    @Column(name = "nombre_juego")
    public String nombreJuego;
    @Column(name = "total")
    public Integer totalProduccion;

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

    public Integer getTotalProduccion() {
        return totalProduccion;
    }

    public void setTotalProduccion(Integer totalProduccion) {
        this.totalProduccion = totalProduccion;
    }
}
