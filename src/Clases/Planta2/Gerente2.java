package Clases.Planta2;

import Clases.CSVEL;
import Clases.Main;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Gerente2 extends Thread {
    
//Declaración de variables.
    Semaphore dias;
    int sueldo = 7;
    
    //Declaración del constructor.
    public Gerente2(Semaphore dias){
        this.dias = dias;
    }
    
    public void run(){
        while(true){
            try {
                if(Main.diasRestantes <= 0){
                    Main.diasRestantes = Integer.parseInt(CSVEL.data[19]);;
                }
            }catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
