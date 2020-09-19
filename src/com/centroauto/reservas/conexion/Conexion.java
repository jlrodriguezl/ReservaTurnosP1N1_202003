package com.centroauto.reservas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Clase que realiza la conexión a la base de datos
 * @author jlrodriguez
 * @since 18/08/2020
 */
public class Conexion {
   /**
    * Objeto que maneja la conexión a la BD
    */ 
   private Connection con;
   
   public Connection conectarBD() throws Exception{
       Properties prop = new Properties();
       //Cargar archivo de propiedades en memoria
       prop.load(getClass().getResourceAsStream("/com/centroauto/reservas/propiedades/Conexion.properties"));
       String user = prop.getProperty("user");
       String password = prop.getProperty("password");
       String url = prop.getProperty("url");
       Class.forName("com.mysql.jdbc.Driver"); 
       //Abrir conexión
       con = DriverManager.getConnection(url, user, password);
       return con;
   }
}
