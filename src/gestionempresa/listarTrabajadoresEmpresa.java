/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

import java.util.*;

/**
 *
 * @author Rubén
 */
public class listarTrabajadoresEmpresa {
    
    // En primer lugar el alumno creará 4 objetos departamentos cuyo nombre identificativo será: "Desarrollo", "Sistemas", "Contabilidad", "Ventas". El resto de valores de los atributos queda a elección del alumno.
    
    static private Departamento departamento_desarrollo = new Departamento("Desarrollo", "Departamento de Desarrollo");
    static private Departamento departamento_sistemas = new Departamento("Sistemas", "Departamento de Sistemas");
    static private Departamento departamento_contabilidad = new Departamento("Contabilidad", "Departamento de Contabilidad");
    static private Departamento departamento_ventas = new Departamento("Ventas", "Departamento de Ventas");
    
    /* Creará 12 objetos empleados que tendrán los siguientes trabajos: 3 empleados serán "Progamadores" y trabajarán en el departamento de "Desarrollo", 
    otros 3 empleados serán "Administradores" y trabajarán en el departamento de "Sistemas", 
    otros 3 serán contables y trabajarán en el departamento de "Contabilidad" 
    y los tres últimos serán "Comerciales" y trabajarán en el departamento de "Ventas".*/
    
    static private Empleado emp_uno = new Empleado(1, "Javier", "Salazar", "Programador", 4000.00, "Desarrollo");
    static private Empleado emp_dos = new Empleado(2, "Francisco", "Muñiz", "Programador", 2100.50, "Desarrollo");
    static private Empleado emp_tres = new Empleado(3, "David", "Fernández", "Programador", 24000.00, "Desarrollo");
    static private Empleado emp_cuatro = new Empleado(4, "Alejandro", "Sanz", "Administrador", 1500.00, "Sistemas");
    static private Empleado emp_cinco = new Empleado(5, "Sergi", "Guardiola", "Administrador", 1900.00, "Sistemas");
    static private Empleado emp_sexto = new Empleado(6, "Marcos", "Alonso", "Administrador", 3000.00, "Sistemas");
    static private Empleado emp_septimo = new Empleado(7, "Izan", "Álvarez", "Contable", 2000.00, "Contabilidad");
    static private Empleado emp_octavo = new Empleado(8, "Claudia", "Perez", "Contable", 3000.00, "Contabilidad");
    static private Empleado emp_noveno = new Empleado(9, "Ruben", "Marés", "Contable", 1900.00, "Contabilidad");
    static private Empleado emp_decimo = new Empleado(10, "Sara", "Arizabal", "Comercial", 1570.23, "Ventas");
    static private Empleado emp_undecimo = new Empleado(11, "Victor", "Muñoz", "Comercial", 1800.00, "Ventas");
    static private Empleado emp_duodecimo = new Empleado(12, "Andrea", "Campos", "Comercial", 3000.00, "Ventas");
    
    //  A continuación se creará un ArrayList denominado listaDepartamentos donde se añadirán los 4 objetos departamentos creados y un ArrayLis denominado listaEmpleados donde se añadirán los 12 objetos empleados creados.
    
    static public ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento> ();
    static public ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado> ();
    
    static public void setListaDepartamentos() {
        listaDepartamentos.add(departamento_desarrollo);
        listaDepartamentos.add(departamento_sistemas);
        listaDepartamentos.add(departamento_contabilidad);
        listaDepartamentos.add(departamento_ventas);
    }
    
    static public void setListaEmpleados() {
        listaEmpleados.add(emp_uno);
        listaEmpleados.add(emp_dos);
        listaEmpleados.add(emp_tres);
        listaEmpleados.add(emp_cuatro);
        listaEmpleados.add(emp_cinco);
        listaEmpleados.add(emp_sexto);
        listaEmpleados.add(emp_septimo);
        listaEmpleados.add(emp_octavo);
        listaEmpleados.add(emp_noveno);
        listaEmpleados.add(emp_decimo);
        listaEmpleados.add(emp_undecimo);
        listaEmpleados.add(emp_duodecimo);
    }
    
}