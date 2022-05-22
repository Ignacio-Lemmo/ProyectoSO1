package Clases.Planta2;

import Clases.Main;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Jefe2 extends Thread{
    
    //Declaración de variables.
    Semaphore dias;
    int sueldo = 7;
    
    //Declaración del constructor.
    public Jefe2(Semaphore dias){
        this.dias = dias;
    }
    
    public void run(){
        while(true){
            try {
            dias.acquire();
                Main.dias ++;
                Simulacion.dias.setText(String.valueOf(Main.dias));
                Main.diasRestantes --;
                Simulacion.diasRestantes.setText(String.valueOf(Main.diasRestantes));
            dias.release();
            Thread.sleep(Main.tiempo);
            }catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
