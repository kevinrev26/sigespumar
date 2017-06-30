package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte8;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioOcho extends JpaRepository<Reporte8, String> {

    List<Reporte8> findBytotalProduccionGreaterThanEqual(Integer produccion);
}
