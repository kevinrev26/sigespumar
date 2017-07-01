package com.sig23.sigespumar.web;

import com.sig23.sigespumar.repositorios.RepositorioDiez;
import com.sig23.sigespumar.repositorios.RepositorioNueve;
import com.sig23.sigespumar.repositorios.RepositorioOcho;
import com.sig23.sigespumar.repositorios.RepositorioOnce;
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
@RequestMapping("/estrategico")
public class EstrategicoController {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private RepositorioOnce repositorioOnce;
    @Autowired
    private RepositorioOcho repositorioOcho;
    @Autowired
    private RepositorioNueve repositorioNueve;
    @Autowired
    private RepositorioDiez repositorioDiez;

    @RequestMapping(value = "/reporte", method = RequestMethod.GET)
    public String reporte1() {
        return "estrategico/r7";
    }

    @RequestMapping(value = "/reporte2", method = RequestMethod.GET)
    public String reporte2() {
        return "estrategico/r8";
    }

    @RequestMapping(value = "/reporte3", method = RequestMethod.GET)
    public String reporte3() {
        return "estrategico/r9";
    }

    @RequestMapping(value = "/reporte4", method = RequestMethod.GET)
    public String reporte4() {
        return "estrategico/r10";
    }

    @RequestMapping(value = "/reporte5", method = RequestMethod.GET)
    public String reporte5() {
        return "estrategico/r11";
    }


    @RequestMapping(value = "/reporte/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte(@RequestParam("costoTotal") Double costoTotal) {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte7.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        params.put("datasource", repositorioOnce.findBycostoTotalGreaterThanEqual(costoTotal));
        return new ModelAndView(view, params);

    }

    @RequestMapping(value = "/reporte2/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte2(@RequestParam("total") Integer total){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte8.jrxml");
        view.setApplicationContext(appContext);
        Map<String,Object> params = new HashMap<>();
        params.put("datasource", repositorioOcho.findBytotalProduccionGreaterThanEqual(total));
        return new ModelAndView(view, params);
    }

    @RequestMapping(value = "/reporte3/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte2(@RequestParam("total") Double total){

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte9.jrxml");
        view.setApplicationContext(appContext);
        Map<String,Object> params = new HashMap<>();
        params.put("datasource", repositorioNueve.findBytotalGreaterThan(total));
        return new ModelAndView(view, params);
    }


    @RequestMapping(value = "/reporte4/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte4(@RequestParam("inicio") Date inicio, @RequestParam("fin") Date fin) {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte10.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        params.put("datasource", repositorioDiez.findByfechaBetween(inicio,fin));
        return new ModelAndView(view, params);

    }

    @RequestMapping(value = "/reporte5/pdf", method = RequestMethod.GET)
    public ModelAndView getReporte5(@RequestParam("inicio") Date inicio, @RequestParam("fin") Date fin) {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reportes/reporte11.jrxml");
        view.setApplicationContext(appContext);
        Map<String, Object> params = new HashMap<>();
        params.put("datasource", repositorioOnce.findByfechaBetween(inicio,fin));
        return new ModelAndView(view, params);

    }
}
