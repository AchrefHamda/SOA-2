/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rsexemplenet.config;

/**
 *
 * @author Lenovo
 */


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    // Cela configure le préfixe de l'URL RESTful comme "/api"
}

