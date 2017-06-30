package com.sig23.sigespumar.web;

import com.sig23.sigespumar.modelos.Reporte1;
import com.sig23.sigespumar.repositorios.RepositorioCuatro;
import com.sig23.sigespumar.repositorios.RepositorioDos;
import com.sig23.sigespumar.repositorios.RepositorioUno;
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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    RepositorioCuatro repositorioCuatro;
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
        //JRDataSource jrDataSource = new JRBeanCollectionDataSource(repositorioUno.findAll());
        params.put("datasource", repositorioUno.findByfechaOrdenBetween(inicio,fin));
        return new ModelAndView(view,params);
    }

    @RequestMapping(value = "/reporte2/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte2(@RequestParam("codSal") String codigoSala){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte2.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        params.put("datasource",repositorioDos.findBycodSal(codigoSala));
        return new ModelAndView(view,params);

    }

    @RequestMapping(value = "/reporte4/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte4(@RequestParam("codSal") String codigoSala){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte4.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        params.put("datasource", repositorioCuatro.findBycodSala(codigoSala));
        return new ModelAndView(view,params);

    }

}
