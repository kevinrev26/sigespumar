package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte4;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioCuatro extends JpaRepository<Reporte4, Long> {

    List<Reporte4> findBycodSala(String cod);
}
