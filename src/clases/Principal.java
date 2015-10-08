/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String[] args) {
        
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ManejaRegistros manejador = new ManejaRegistros();
        
        do{
            System.out.println("Qué desea hacer?");
            System.out.println("1) Agregar Registro");
            System.out.println("2) Buscar registro");
            System.out.println("3) Salir");
            opcion = teclado.nextInt();
            teclado.skip("\n");
            
            switch(opcion){
                case 1: 
                    Registro elReg = new Registro();
                    elReg.capturaDatos();
                    boolean res = manejador.agregaRegistro(elReg);
                    if(res){
                        System.out.println("Registro agregado");
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 2:
                    System.out.println("Digite la cedula a buscar:");
                    Integer ced = teclado.nextInt();
                    teclado.skip("\n");
                    Registro reg = manejador.buscarRegistro(ced);
                    if(reg == null){
                        System.out.println("No se encontro el registro.");
                    }else{
                        System.out.println("Nota= "+reg.obtieneNota());
                        reg.obtieneEstado();
                        reg.obtieneEstado();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("OPCION INVALIDA!!!");
                    break;
            }
        }while(opcion != 3);  
            
           
    }
}
