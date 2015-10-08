/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class ManejaRegistros {
    
    Registro[] losRegistros;

    public ManejaRegistros() {
        this.losRegistros = new Registro[3];
    }
    
    public ManejaRegistros(int x) {
        this.losRegistros = new Registro[x];
    }
    
    public boolean agregaRegistro(Registro regi){
        for (int i = 0; i < this.losRegistros.length; i++) {
            if(this.losRegistros[i] == null){
                this.losRegistros[i] = regi;
                return true;
            }   
        }
        return false;
    }
    
    public Registro buscarRegistro(int cedula){
        for (int i = 0; i < this.losRegistros.length; i++) {
            Registro reg = this.losRegistros[i];
            
            if(reg != null){
                if(reg.getCedula() == cedula){
                    return reg;
                }
            }else{
                return reg;
            }
        }
        return null;
    }

    public Registro[] getLosRegistros() {
        return losRegistros;
    }

    public void setLosRegistros(Registro[] losRegistros) {
        this.losRegistros = losRegistros;
    }
    
    
}
