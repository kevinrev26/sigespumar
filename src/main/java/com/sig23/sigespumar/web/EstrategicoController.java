package com.sig23.sigespumar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/reporte",method = RequestMethod.GET)
    public String reporte1(){
        return "estrategico/r1";
    }
    @RequestMapping(value = "/reporte2",method = RequestMethod.GET)
    public String reporte2(){
        return "tactico/r2";
    }
    @RequestMapping(value = "/reporte3",method = RequestMethod.GET)
    public String reporte3(){
        return "estrategico/r3";
    }
    @RequestMapping(value = "/reporte4",method = RequestMethod.GET)
    public String reporte4(){
        return "estrategico/r4";
    }
    @RequestMapping(value = "/reporte5",method = RequestMethod.GET)
    public String reporte5(){
        return "estrategico/r5";
    }
    @RequestMapping(value = "/reporte6",method = RequestMethod.GET)
    public String reporte6(){
        return "estrategico/r6";
    }

}
