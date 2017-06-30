package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioDos extends JpaRepository<Reporte2,Long> {

    List<Reporte2> findBycodSal(String cod);
}
