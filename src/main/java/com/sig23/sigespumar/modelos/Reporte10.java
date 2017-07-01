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
@Table(name = "reporte_10")
public class Reporte10 {

    @Id
    @Column(name = "cod_linea")
    private String codLinea;
    @Column(name = "nombre_juego")
    private String nombreJuego;
    @Column(name = "unidades_producidas")
    private Integer unidadesProducidas;
    @Column(name = "materia_prima")
    private Double materiaPrima;
    @Column(name = "mano_obra")
    private Double manoObra;
    @Column(name = "gasto")
    private Double gasto;
    @Column(name = "fecha")
    private Date fecha;

    public String getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(String codLinea) {
        this.codLinea = codLinea;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Integer getUnidadesProducidas() {
        return unidadesProducidas;
    }

    public void setUnidadesProducidas(Integer unidadesProducidas) {
        this.unidadesProducidas = unidadesProducidas;
    }

    public Double getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(Double materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public Double getManoObra() {
        return manoObra;
    }

    public void setManoObra(Double manoObra) {
        this.manoObra = manoObra;
    }

    public Double getGasto() {
        return gasto;
    }

    public void setGasto(Double gasto) {
        this.gasto = gasto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
