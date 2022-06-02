package Clases.Planta1;

import Clases.Main;
import static Clases.Main.pines1Producidos;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;

public class Pines1 extends Thread{
    
    public Semaphore pines1;
    public Semaphore pines1mut;
    public Semaphore pines1em;
    
    int pordia;
    static int salary;
    int tiempoE;
    
    boolean contratadoB;
    
    
    public Pines1(Semaphore pines1, Semaphore pines1mut, Semaphore pines1em) {
        this.pines1 = pines1;
        this.pines1mut = pines1mut;
        this.pines1em = pines1em;
        this.pordia = 1;
        this.salary = 3;
        this.tiempoE = 0;

        this.contratadoB = true;
        
    }
    
    public void setContratado(boolean setter){
        contratadoB = setter;
    }
    
     public void run(){
         
         tiempoE = Main.tiempo;

         while (this.contratadoB) {
             try {
                 Thread.sleep(Math.round(tiempoE/pordia));
                    this.pines1.acquire();
                    this.pines1mut.acquire();
                    Main.pines1Producidos ++;
                    this.pines1mut.release();
                    this.pines1em.release();
                            Planta1.pines1Progreso.setString(String.valueOf(Main.pines1Producidos));
                            Planta1.pines1Progreso.setValue(pines1Producidos);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
    }
}
