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
@Table(name = "reporte_5")
public class Reporte5 {

    @Id
    @Column(name = "cod_producto")
    private Integer codProducto;
    @Column(name = "fecha_terminado")
    private Date fecha;
    @Column(name = "nombre_juego")
    private String nombreJuego;


    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
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
