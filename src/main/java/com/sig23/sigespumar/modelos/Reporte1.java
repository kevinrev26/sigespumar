package com.sig23.sigespumar.modelos;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by kevin on 06-29-17.
 */
/*
* Kevin Rivera
* Fecha: 06-29-17
* Descripción: 
*/
@Entity
@Table(name="reporte_1")
/*@NamedQuery(name = "findByfecha_ordenBetween",
query = "SELECT r FROM Reporte1 r WHERE r.fecha_orden between :inicio and :fin")*/
public class Reporte1 {

    @Id
    @Column(name="cod_orden")
    private String codOrden;
    @Column(name="jefe")
    private String jefe;
    @Column(name="fecha_orden")
    private Date fechaOrden;
    @Column(name="nombre_juego")
    private String nombreJuego;
    @Column(name="cantidad_material")
    private Double cantidadMaterial;
    @Column(name="costo_material")
    private Double costoMaterial;

    public String getCodOrden() {
        return codOrden;
    }

    public void setCodOrden(String codOrden) {
        this.codOrden = codOrden;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Double getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(Double cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public Double getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(Double costoMaterial) {
        this.costoMaterial = costoMaterial;
    }
}
