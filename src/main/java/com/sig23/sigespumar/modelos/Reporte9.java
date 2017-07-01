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
@Table(name = "reporte_9")
public class Reporte9 {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "cod_juego")
    private String codJuego;
    @Column(name = "nombre_sala")
    private String nombreSala;
    @Column(name = "mano_obra")
    private Double manoObra;
    @Column(name = "gasto")
    private Double gasto;
    @Column(name = "materiales_directos")
    private Double materialesDirectos;
    @Column(name = "total")
    private Double total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodJuego() {
        return codJuego;
    }

    public void setCodJuego(String codJuego) {
        this.codJuego = codJuego;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
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

    public Double getMaterialesDirectos() {
        return materialesDirectos;
    }

    public void setMaterialesDirectos(Double materialesDirectos) {
        this.materialesDirectos = materialesDirectos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
