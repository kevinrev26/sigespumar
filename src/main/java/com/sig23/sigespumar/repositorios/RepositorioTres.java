package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioTres extends JpaRepository<Reporte3, String> {

    List<Reporte3> findBycodOrdenBetween(String inicio, String fin);
}
