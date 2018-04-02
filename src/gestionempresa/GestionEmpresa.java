/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

import java.util.Iterator;

/**
 *
 * @author Rubén
 */
public class GestionEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Por último se listará la información almacenada en los ArrayList creados con anterioridad mostrando en primer lugar la información del departamento y a continuación la información de los empleados que trabajan en dicho departamento.
        
        // Primero llamamos a los dos metodo estaticos de listarTrabajadoresEmpresa para rellenar los ArrayList
        listarTrabajadoresEmpresa.setListaDepartamentos();
        listarTrabajadoresEmpresa.setListaEmpleados();
        
        // Después se recorre el array list de departamento
        
        Iterator<Departamento> itr_dep = listarTrabajadoresEmpresa.listaDepartamentos.iterator();
        while(itr_dep.hasNext()) {
            Departamento elm = itr_dep.next();
            
            // Una vez se tiene el elemento especificado, se recorre el array list de Empleados para buscar quien trabaja en el mismo departamento
            String nombre_departamento = elm.getNombre();
            
            // Pintamos ya el departamento en que nos encontramos
            System.out.println("Empleados del departamento " + nombre_departamento + ":");
            
            Iterator<Empleado> itr_emp = listarTrabajadoresEmpresa.listaEmpleados.iterator();
            while(itr_emp.hasNext()) {
                Empleado emp_elm = itr_emp.next();
                
                // Comprobamos si el departamento del empleado cocincide con el departamento especifico
                if(emp_elm.getNombreDepartamento().equals(nombre_departamento)) {
                    System.out.println("    " + emp_elm.getNombre() + " " + emp_elm.getApellidos());
                }
            }
        
        
        
        
        }
            System.out.println("___________________________________________________________");
         //______________________________________________________________________________________________//
            //recorremos el arraylist de empleados
            
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
            System.out.println(" ");
            System.out.println("Lista empleados después de la consulta correspondiente a empleados cuyo salario es menor de 2000 € : ");
            System.out.println(" ");
            for (Empleado i : listarTrabajadoresEmpresa.listaEmpleados) {
                System.out.println("Empleado: " + i.getNombre() + " " + i.getApellidos() + " con un salario de " + i.getSalario());
            }
        
        
    }
    
}
