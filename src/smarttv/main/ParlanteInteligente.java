/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarttv.main;

/**
 *
 * @author PERSONAL
 */
public class ParlanteInteligente implements controlRemoto, Conectividad{
    private String marca;
    private int volumen;
    private boolean conectividad;
    
    
    public ParlanteInteligente(String marca){
        this.marca=marca;
        this.volumen= 15;
        this.conectividad = false;
       
    }

   @Override
    public void subirVolumen(int valor) {
        volumen += valor; 
    System.out.println("El volumen actual es: " + volumen);
}

    @Override
    public void bajarVolumen(int valor) {
             if (volumen - valor >= 0) {
        volumen -= valor;
    } else {
        System.out.println("No se puede reducir más el volumen");
    }
    System.out.println("El volumen actual es: " + volumen);
}
    
    @Override
    public void conectarInternet() {
       conectividad = true;
    System.out.println("El parlante "+ marca+" se encuentra conectado");
    }

    @Override
    public void desconectarInternet() {
        conectividad = false;
        System.out.println("El parlante "+marca+" se encuentra desconetado");
         }     
}
