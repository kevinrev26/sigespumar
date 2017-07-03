package com.sig23.sigespumar.web;

import com.sig23.sigespumar.modelos.Reporte1;
import com.sig23.sigespumar.repositorios.*;
//import org.apache.catalina.core.ApplicationContext;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by kevin on 06-17-17.
 */
/*
* Kevin Rivera
* Fecha: 06-17-17
* Descripción: 
*/
@Controller
@RequestMapping("/tactico")
public class TacticoController {

    @Autowired
    RepositorioUno repositorioUno;
    @Autowired
    RepositorioDos repositorioDos;
    @Autowired
    RepositorioTres repositorioTres;
    @Autowired
    RepositorioCuatro repositorioCuatro;
    @Autowired
    RepositorioCinco repositorioCinco;
    @Autowired
    private ApplicationContext appContext;



    @RequestMapping(value = "/reporte",method = RequestMethod.GET)
    public String reporte1(){
        return "tactico/r1";
    }
    @RequestMapping(value = "/reporte2",method = RequestMethod.GET)
    public String reporte2(){
        return "tactico/r2";
    }
    @RequestMapping(value = "/reporte3",method = RequestMethod.GET)
    public String reporte3(){
        return "tactico/r3";
    }
    @RequestMapping(value = "/reporte4",method = RequestMethod.GET)
    public String reporte4(){
        return "tactico/r4";
    }
    @RequestMapping(value = "/reporte5",method = RequestMethod.GET)
    public String reporte5(){
        return "tactico/r5";
    }
    @RequestMapping(value = "/reporte6",method = RequestMethod.GET)
    public String reporte6(){
        return "tactico/r6";
    }

    @RequestMapping(value = "/reporte/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte1(@RequestParam("inicio") Date inicio, @RequestParam("fin") Date fin){
        //return repositorioUno.findAll();
        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte1.jrxml");
        view.setApplicationContext(appContext);
        Map<String,Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");


        //JRDataSource jrDataSource = new JRBeanCollectionDataSource(repositorioUno.findAll());
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Consumo de materiales de producción");
        String subtitulo = "Periodo: " + " De" + df.format(inicio) + " hasta: " + df.format(fin);
        params.put("subtitulo", subtitulo);
        ///params.put("emsion", );
        params.put("datasource", repositorioUno.findByfechaOrdenBetween(inicio,fin));
        return new ModelAndView(view,params);
    }

    @RequestMapping(value = "/reporte2/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte2(@RequestParam("codSal") String codigoSala){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte2.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Mano de obra pagada por juego de sala");
        params.put("Subtitulo", codigoSala);
        params.put("datasource",repositorioDos.findBycodSal(codigoSala));
        return new ModelAndView(view,params);

    }

    @RequestMapping(value = "/reporte3/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte3(@RequestParam("inicio") String inicio, @RequestParam("fin") String fin){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte3.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        inicio = "ORD" + inicio;
        fin = "ORD" + fin;
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Costo de Sala por Orden de producción");
        String subtitulo = "Ordenes, " + " De: " + inicio + " hasta: " + fin;
        params.put("subtitulo", subtitulo);
        params.put("datasource",repositorioTres.findBycodOrdenBetween(inicio, fin));
        return new ModelAndView(view,params);

    }

    @RequestMapping(value = "/reporte4/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte4(@RequestParam("codSal") String codigoSala){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte4.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Costo Estandar vs Costo Real");
        params.put("Subtitulo", codigoSala);
        params.put("datasource", repositorioCuatro.findBycodSala(codigoSala));
        return new ModelAndView(view,params);

    }

    @RequestMapping(value = "/reporte5/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte5(@RequestParam("inicio") Date inicio, @RequestParam("fin") Date fin){
        //return repositorioUno.findAll();
        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte5.jrxml");
        view.setApplicationContext(appContext);
        Map<String,Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Producto Terminado");
        String subtitulo = "Periodo: " + " De" + df.format(inicio) + " hasta: " + df.format(fin);
        params.put("subtitulo", subtitulo);
        params.put("datasource", repositorioCinco.findByfechaBetween(inicio,fin));
        return new ModelAndView(view,params);
    }

    @RequestMapping(value = "/reporte6/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte6(@RequestParam("inicio") Date inicio, @RequestParam("fin") Date fin){
        //return repositorioUno.findAll();
        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte6.jrxml");
        view.setApplicationContext(appContext);
        Map<String,Object> params = new HashMap<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        params.put("empresa", "ESPUMAR S.A. de C.V. " + df.format(Calendar.getInstance().getTime()));
        params.put("titulo", "Ordenes liquidadas");
        String subtitulo = "Periodo: " + " De" + df.format(inicio) + " hasta: " + df.format(fin);
        params.put("subtitulo", subtitulo);
        params.put("datasource", repositorioCinco.findByfechaBetween(inicio,fin));
        return new ModelAndView(view,params);
    }


}
