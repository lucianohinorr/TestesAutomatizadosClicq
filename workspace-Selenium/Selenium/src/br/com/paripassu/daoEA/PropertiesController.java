package br.com.paripassu.daoEA;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package dbintegrator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author jean.hauck
 */
public class PropertiesController {

    private static Properties properties;
    private static final String fileName = "/clg.properties";
    private static PropertiesController propertiesController;
    
    //private static Logger logger = Logger.getLogger(PropertiesController.class.toString());
    
    private PropertiesController() {
        properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(fileName));
        } 
        catch (IOException e) {
           // logger.error("Error opening properties file "+fileName+": "+ e);
        }
    }
    public static PropertiesController getInstance(){
        if (propertiesController == null){
            propertiesController = new PropertiesController();
        }
        return propertiesController;
    }
    
    public String getProperty(String propertyName){
        return properties.getProperty(propertyName);
    }
    
    public void setProperty(String propertyName, String propertyValue){
        properties.setProperty(propertyName, propertyValue);
    }
    
    public void finalyze(){
       try {
        properties.store(new FileOutputStream(fileName), null);
        } catch (IOException e) {
           // logger.error("Error saving properties file "+fileName+": "+ e);
        } 
    }
    
}
