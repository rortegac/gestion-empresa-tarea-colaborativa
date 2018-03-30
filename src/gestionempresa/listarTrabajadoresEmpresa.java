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
    
    static private Empleado emp_uno = new Empleado(1, "Primer", "Empleado", "Programador", 21000.00, "Desarrollo");
    static private Empleado emp_dos = new Empleado(2, "Segundo", "Empleado", "Programador", 19500.50, "Desarrollo");
    static private Empleado emp_tres = new Empleado(3, "Tercer", "Empleado", "Programador", 24000.00, "Desarrollo");
    static private Empleado emp_cuatro = new Empleado(4, "Cuarto", "Empleado", "Administrador", 15000.00, "Sistemas");
    static private Empleado emp_cinco = new Empleado(5, "Quinto", "Empleado", "Administrador", 19000.00, "Sistemas");
    static private Empleado emp_sexto = new Empleado(6, "Sexto", "Empleado", "Administrador", 23000.00, "Sistemas");
    static private Empleado emp_septimo = new Empleado(7, "Septimo", "Empleado", "Contable", 17000.00, "Contabilidad");
    static private Empleado emp_octavo = new Empleado(8, "Octavo", "Empleado", "Contable", 31000.00, "Contabilidad");
    static private Empleado emp_noveno = new Empleado(9, "Noveno", "Empleado", "Contable", 23000.00, "Contabilidad");
    static private Empleado emp_decimo = new Empleado(10, "Decimo", "Empleado", "Comercial", 21000.23, "Ventas");
    static private Empleado emp_undecimo = new Empleado(11, "Undecimo", "Empleado", "Comercial", 25000.00, "Ventas");
    static private Empleado emp_duodecimo = new Empleado(12, "Duodecimo", "Empleado", "Comercial", 21000.00, "Ventas");
    
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