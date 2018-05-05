/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

import java.util.*;

/**
 *
 * @author dmm_s
 */
public class eliminarTrabajadoresEmpresa {
    public static void eliminar() {
        Iterator <Empleado> itr_emp2 = listarTrabajadoresEmpresa.listaEmpleados.iterator();
        System.out.println("Eliminación de empleados con salario mayor de 2000 €: ");
        System.out.println(" ");
        while(itr_emp2.hasNext()) {
            Empleado aeliminar = itr_emp2.next();

            if(aeliminar.getSalario() > 2000) { //en caso de que ganen mÃ¡s de 2000â‚¬ eliminar dicho empleado de listaEmpleados.    
                itr_emp2.remove();
                System.out.println("    " + aeliminar.getNombre() + " " + aeliminar.getApellidos() + " con salario de " + aeliminar.getSalario() + " € ");
                System.out.println("Eliminación realizada con éxito ");
            }                                                  
        }
    } 
       
}
