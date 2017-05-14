/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.weather_client.controller;

import com.udea.weather_service.servicio.ClimaWS_Service;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Sergio
 */
public class climaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_20669/weather_service/ClimaWS.wsdl")
    private ClimaWS_Service service;

    private String ciudad;
    private String tempActualFarenheith;
    private String tempActualCentigrados;
    private String humedad;
    private String tipo_nubosidad;
    private String precipitacion;
    private String tempActualFarenheith2;
    private String tempActualCentigrados2;
    private String humedad2;
    private String tipo_nubosidad2;
    private String precipitacion2;
    private String tempActualFarenheith3;
    private String tempActualCentigrados3;
    private String humedad3;
    private String tipo_nubosidad3;
    private String precipitacion3;
    /**
     * Creates a new instance of climaBean
     */
    public climaBean() {
    }

    private String guardarClima(java.lang.String ciudad, java.lang.String tempactualfarenheith, java.lang.String tempactualcentigrados, java.lang.String humedad, java.lang.String tipoNubosidad, java.lang.String precipitacion, java.lang.String tempactualfarenheith2, java.lang.String tempactualcentigrados2, java.lang.String humedad2, java.lang.String tipoNubosidad2, java.lang.String precipitacion2, java.lang.String tempactualfarenheith3, java.lang.String tempactualcentigrados3, java.lang.String humedad3, java.lang.String tipoNubosidad3, java.lang.String precipitacion3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.weather_service.servicio.ClimaWS port = service.getClimaWSPort();
        return port.guardarClima(ciudad, tempactualfarenheith, tempactualcentigrados, humedad, tipoNubosidad, precipitacion, tempactualfarenheith2, tempactualcentigrados2, humedad2, tipoNubosidad2, precipitacion2, tempactualfarenheith3, tempactualcentigrados3, humedad3, tipoNubosidad3, precipitacion3);
    }

    private java.util.List<com.udea.weather_service.servicio.Clima> verClimas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.weather_service.servicio.ClimaWS port = service.getClimaWSPort();
        return port.verClimas();
    }
    
}
