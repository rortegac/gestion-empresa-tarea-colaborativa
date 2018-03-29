/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

/**
 *
 * @author dmm_s
 */
public class Departamento {
        //atributos de visibilidad privada.
    
    
    private String nombre;
    //nombre: cadena de caracteres que representa el nombre identificativo del departamento en la empresa.
    
    private String descripcion;
    //descripcion: cadena de caracteres que representará la actividad a la que se dedica el departamento en cuestión.
    
    /*Constructor sin parámetros: constructor que inicializa todos los atributos de tipo cadenas de caracteres al valor null 
    y los números enteros a 0*/
    
    public Departamento () {
       this.nombre= null;
       this.descripcion = null;
   }
    
   /*Constructor con parámetros: constructor que tienen tantos parámetros como atributos tiene la clase, 
        y que inicializa cada uno de los atributos con el valor de los parámetros correspondientes.*/
   
    public Departamento (String nombre, String descripcion) {
       this.nombre = nombre;
       this.descripcion = descripcion;
   }
    
    //getters y setters. Métodos get y set para poder consultar y modificar cada uno de los atributos desde fuera de la clase
    //Getters
    public String getNombre () {return this.nombre;}
    public String getDescripcion () {return this.descripcion;}
    
    
    //Setters
    public void setNombre (String nombre) {this.nombre=nombre;}
    public void setDescripcion (String descripcion) {this.descripcion = descripcion;}
} 
    

