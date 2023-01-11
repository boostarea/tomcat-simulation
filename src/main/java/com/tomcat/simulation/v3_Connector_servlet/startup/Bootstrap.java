package com.tomcat.simulation.v3_Connector_servlet.startup;


import com.tomcat.simulation.v3_Connector_servlet.connector.http.HttpConnector;

import java.util.Locale;

public final class Bootstrap {
  public static void main(String[] args) {
    Locale.setDefault(Locale.JAPANESE);
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}