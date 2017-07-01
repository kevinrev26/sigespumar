package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte10;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioDiez extends JpaRepository<Reporte10, String> {

    List<Reporte10> findByfechaBetween(Date inicio, Date fin);

}
