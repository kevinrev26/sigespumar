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
@Table(name="reporte_4")
public class Reporte4 {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "cod_sala")
    private String codSala;
    @Column(name = "costo_total")
    private Double costoTotal;
    @Column(name = "costo_estandar")
    private Double costoEstandar;
    @Column(name = "diferencia")
    private Double diferencia;
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

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Double getCostoEstandar() {
        return costoEstandar;
    }

    public void setCostoEstandar(Double costoEstandar) {
        this.costoEstandar = costoEstandar;
    }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double diferencia) {
        this.diferencia = diferencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
