package com.tomcat.simulation.v3_Connector_servlet;

import com.tomcat.simulation.v3_Connector_servlet.connector.http.HttpRequest;
import com.tomcat.simulation.v3_Connector_servlet.connector.http.HttpResponse;

import java.io.IOException;

public class StaticResourceProcessor {

  public void process(HttpRequest request, HttpResponse response) {
    try {
      response.sendStaticResource();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
