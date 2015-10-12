package br.com.paripassu.daoEA;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package dbintegrator.connection;

/**
 *
 * @author jean.hauck 
 */
public abstract class Connection {

    protected java.sql.Connection connection = null;
    protected String[] connectionParams;
    protected String driverName;
    protected String serverName = "";
    protected String database = "";
    protected String port = "";
    protected String username = "";
    protected String password = "";
    protected String url = "";
    protected String appName;
    
    public void setUsernamePassword(String username, String password){
    	this.username = username;
    	this.password = password;
    }

    public Connection(String appName){
        this.appName = appName;
        loadProperties();
    }

    protected abstract void loadProperties();


        /**
     * Método para setar os parâmetros da conexão
     * @param params - Vetor com parâmetros da conexão.
     */
    public void setParams(String[] params) {
        connectionParams = params;
    }

}
