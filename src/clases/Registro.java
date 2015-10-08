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
public class Registro {
    
    private String nombreCompleto;
    private Integer cedula;
    private String materia;
    private Double proyecto1;
    private Double proyecto2;
    private Double investigacion;
    private Double practicas;

    public Registro() {
    }
    
    public void capturaDatos(){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite el nombre del Estudiante:");
         this. nombreCompleto = teclado.nextLine();
         System.out.println("Digite la cedula del Estudiante:");
         this.cedula = teclado.nextInt();
         teclado.skip("\n");
         System.out.println("Digite la materia:");
         this.materia = teclado.nextLine();
         System.out.println("Digite la nota del proyecto 1:");
         this. proyecto1 = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite la nota del proyecto 2:");
         this. proyecto2 = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite la nota de la investigacion:");
         this. investigacion = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite la nota de las practicas:");
         this. practicas = teclado.nextDouble();
         teclado.skip("\n");
    }
            
    
    public Double obtieneNota(){
        return this.proyecto1 + 
                this.proyecto2 + 
                this.investigacion + 
                this.practicas;
    }
    
    public void obtieneEstado(){
        Double nota = this.obtieneNota();
        if(nota >= 70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(Double proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public Double getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(Double proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public Double getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Double investigacion) {
        this.investigacion = investigacion;
    }

    public Double getPracticas() {
        return practicas;
    }

    public void setPracticas(Double practicas) {
        this.practicas = practicas;
    }
    
    
    
}
