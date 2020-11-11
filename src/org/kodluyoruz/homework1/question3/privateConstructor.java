package org.kodluyoruz.homework1.question3;
/*
    3- 	kurucu methodlarda
	    private erişim belirteci ile method oluşturabilir miyiz?
	    OIuşturabiliyorsak buna neden ihtiyacımız var.
*/
public class privateConstructor {

    private String dbName;
    private String serverName;
    private int portNumber;
    private static privateConstructor instance = null;

    private privateConstructor() {
    }

    public static privateConstructor getInstance() {
        if (instance == null) {
            instance = new privateConstructor();
        }
        return instance;
    }

    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
    public String getServerName() {
        return serverName;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    public int getPortNumber() {
        return portNumber;
    }
    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
}
