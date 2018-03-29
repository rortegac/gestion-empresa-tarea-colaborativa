/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

/**
 *
 * @author Rubén
 */
public class Empleado {
    
    // Número entero que representa el identificador único de cada empleado de la empresa.
    private int idEmpleado;
    
    // Cadena de caracteres que representa el nombre de un determinado Empleado.
    private String nombre;
    
    // Cadena de caracteres que representa los apellidos de un determinado Empleado.
    private String apellidos;
    
    // Cadena de caracteres que representa el tipo de trabajo que desempeña cada Empleado.
    private String trabajo;
    
    // Número decimal que representa el salario mensual que recibe cada Empleado.
    private double salario;
   
    // Cadena de caracteres que representa el nombre identificativo del departamento en el que trabaja el Empleado.
    private String nombreDepartamento;
    
    /**
     * Constructor que inicializa todos los atributos de tipo cadenas de caracteres al valor null y los números enteros a 0.
     */
    public Empleado() {
        this.idEmpleado = 0;
        this.nombre = null;
        this.apellidos = null;
        this.trabajo = null;
        this.salario = 0;
        this.nombreDepartamento = null;
    }
    
    /**
     * Constructor que tienen tantos parámetros como atributos tiene la clase, y que inicializa cada uno de los atributos con el valor de los parámetros correspondientes.
     * @param idEmpleado Número entero que representa el identificador único de cada empleado de la empresa
     * @param nombre Cadena de caracteres que representa el nombre de un determinado Empleado
     * @param apellidos Cadena de caracteres que representa los apellidos de un determinado Empleado
     * @param trabajo Cadena de caracteres que representa el tipo de trabajo que desempeña cada Empleado
     * @param salario Número decimal que representa el salario mensual que recibe cada Empleado
     * @param nombreDepartamento Cadena de caracteres que representa el nombre identificativo del departamento en el que trabaja el Emplead
     */
    public Empleado(int idEmpleado, String nombre, String apellidos, String trabajo, double salario, String nombreDepartamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.trabajo = trabajo;
        this.salario = salario;
        this.nombreDepartamento = nombreDepartamento;
    }
    
    // Métodos get y set para poder consultar y modificar cada uno de los atributos desde fuera de la clase, al tener visibilidad privada.
    
    // Getters

    public int getIdEmpleado() {return this.idEmpleado;}
    public String getNombre() {return this.nombre;}
    public String getApellidos() {return this.apellidos;}
    public String getTrabajo() {return this.trabajo;}
    public double getSalario() {return this.salario;}
    public String getNombreDepartamento() {return this.nombreDepartamento;}
    
    // Setters
    
    public void setIdEmpleado(int idEmpleado) {this.idEmpleado = idEmpleado;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setTrabajo(String trabajo) {this.trabajo = trabajo;}
    public void setSalario(double salario) {this.salario = salario;}
    public void setNombreDepartamento(String nombreDepartamento) {this.nombreDepartamento = nombreDepartamento;}
    
    
    
}
