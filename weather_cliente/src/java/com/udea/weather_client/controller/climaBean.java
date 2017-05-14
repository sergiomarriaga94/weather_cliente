/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.weather_client.controller;

import com.udea.weather_service.servicio.ClimaWS_Service;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import net.aksingh.owmjapis.OpenWeatherMap;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;

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

    public ClimaWS_Service getService() {
        return service;
    }

    public void setService(ClimaWS_Service service) {
        this.service = service;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTempActualFarenheith() {
        return tempActualFarenheith;
    }

    public void setTempActualFarenheith(String tempActualFarenheith) {
        this.tempActualFarenheith = tempActualFarenheith;
    }

    public String getTempActualCentigrados() {
        return tempActualCentigrados;
    }

    public void setTempActualCentigrados(String tempActualCentigrados) {
        this.tempActualCentigrados = tempActualCentigrados;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getTipo_nubosidad() {
        return tipo_nubosidad;
    }

    public void setTipo_nubosidad(String tipo_nubosidad) {
        this.tipo_nubosidad = tipo_nubosidad;
    }

    public String getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(String precipitacion) {
        this.precipitacion = precipitacion;
    }

    public String getTempActualFarenheith2() {
        return tempActualFarenheith2;
    }

    public void setTempActualFarenheith2(String tempActualFarenheith2) {
        this.tempActualFarenheith2 = tempActualFarenheith2;
    }

    public String getTempActualCentigrados2() {
        return tempActualCentigrados2;
    }

    public void setTempActualCentigrados2(String tempActualCentigrados2) {
        this.tempActualCentigrados2 = tempActualCentigrados2;
    }

    public String getHumedad2() {
        return humedad2;
    }

    public void setHumedad2(String humedad2) {
        this.humedad2 = humedad2;
    }

    public String getTipo_nubosidad2() {
        return tipo_nubosidad2;
    }

    public void setTipo_nubosidad2(String tipo_nubosidad2) {
        this.tipo_nubosidad2 = tipo_nubosidad2;
    }

    public String getPrecipitacion2() {
        return precipitacion2;
    }

    public void setPrecipitacion2(String precipitacion2) {
        this.precipitacion2 = precipitacion2;
    }

    public String getTempActualFarenheith3() {
        return tempActualFarenheith3;
    }

    public void setTempActualFarenheith3(String tempActualFarenheith3) {
        this.tempActualFarenheith3 = tempActualFarenheith3;
    }

    public String getTempActualCentigrados3() {
        return tempActualCentigrados3;
    }

    public void setTempActualCentigrados3(String tempActualCentigrados3) {
        this.tempActualCentigrados3 = tempActualCentigrados3;
    }

    public String getHumedad3() {
        return humedad3;
    }

    public void setHumedad3(String humedad3) {
        this.humedad3 = humedad3;
    }

    public String getTipo_nubosidad3() {
        return tipo_nubosidad3;
    }

    public void setTipo_nubosidad3(String tipo_nubosidad3) {
        this.tipo_nubosidad3 = tipo_nubosidad3;
    }

    public String getPrecipitacion3() {
        return precipitacion3;
    }

    public void setPrecipitacion3(String precipitacion3) {
        this.precipitacion3 = precipitacion3;
    }
    
    public String guardarClima() throws IOException{
        byte num=3;
        OpenWeatherMap map=new OpenWeatherMap("1969aa40bffb8239c60b05b8b1a17891");
        CurrentWeather currentWeather=currentWeather=map.currentWeatherByCityName(ciudad);
        DailyForecast dailyForecast=map.dailyForecastByCityName(ciudad, num);
        tempActualFarenheith=Float.toString(currentWeather.getMainInstance().getTemperature());
        tempActualCentigrados=Float.toString((((currentWeather.getMainInstance().getTemperature())-32)*5)/9);
        humedad=Float.toString(currentWeather.getMainInstance().getHumidity());
        tipo_nubosidad=tipo_nubosidad_Valor(currentWeather.getCloudsInstance().getPercentageOfClouds());
        precipitacion=Float.toString(currentWeather.getRainInstance().getRain());
        tempActualFarenheith2=Float.toString(dailyForecast.getForecastInstance(1).getTemperatureInstance().getDayTemperature());
        tempActualCentigrados2=Float.toString((((dailyForecast.getForecastInstance(1).getTemperatureInstance().getDayTemperature())-32)*5)/9);
        humedad2=Float.toString(dailyForecast.getForecastInstance(1).getHumidity());
        tipo_nubosidad2=tipo_nubosidad_Valor(dailyForecast.getForecastInstance(1).getPercentageOfClouds());
        precipitacion2=Float.toString(dailyForecast.getForecastInstance(1).getRain());
        tempActualFarenheith3=Float.toString(dailyForecast.getForecastInstance(2).getTemperatureInstance().getDayTemperature());
        tempActualCentigrados3=Float.toString((((dailyForecast.getForecastInstance(2).getTemperatureInstance().getDayTemperature())-32)*5)/9);
        humedad3=Float.toString(dailyForecast.getForecastInstance(2).getHumidity());
        tipo_nubosidad3=tipo_nubosidad_Valor(dailyForecast.getForecastInstance(2).getPercentageOfClouds());
        precipitacion3=Float.toString(dailyForecast.getForecastInstance(2).getRain());
        
        String envio=guardarClima(ciudad, tempActualFarenheith, tempActualCentigrados, humedad, tipo_nubosidad, precipitacion, tempActualFarenheith2, tempActualCentigrados2, humedad2, tipo_nubosidad2, precipitacion2, tempActualFarenheith3, tempActualCentigrados3, humedad3, tipo_nubosidad3, precipitacion3);
        FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_INFO,envio,"....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return null;
    }
    
    
    public String tipo_nubosidad_Valor(Float f) throws IOException{
        String tipo_escogido=null;
        if((f>=0)&(f<=20)){
            tipo_escogido="despejado";
        }
        if((f>20)&(f<=40)){
            tipo_escogido="poco nuboso";
        }
        if((f>40)&(f<=60)){
            tipo_escogido="nuboso";
        }
        if((f>60)&(f<=80)){
            tipo_escogido="muy nuboso";
        }
        if((f>80)&(f<=100)){
            tipo_escogido="cubierto";
        }
        return tipo_escogido;
    }
    
    public void limpiarForm(){
        this.ciudad=null;
    }
}
