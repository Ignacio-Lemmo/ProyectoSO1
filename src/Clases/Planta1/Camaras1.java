package Clases.Planta1;

import Clases.Main;
import static Clases.Main.camaras1Producidas;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;

public class Camaras1 extends Thread{
    public Semaphore camaras1;
    public Semaphore camaras1mut;
    public Semaphore camaras1em;
    
    int pordia;
    static int salary;
    int tiempoE;
    
    boolean contratadoB;
    
    
    public Camaras1(Semaphore camaras1, Semaphore camaras1mut, Semaphore camaras1em) {
        this.camaras1 = camaras1;
        this.camaras1mut = camaras1mut;
        this.camaras1em = camaras1em;
        this.pordia = 3;
        this.salary = 5;
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
                 this.camaras1.acquire();                 
                    this.camaras1mut.acquire();
                    Main.camaras1Producidas ++;
                    this.camaras1mut.release();
                    this.camaras1em.release();
                            Planta1.camaras1Progreso.setString(String.valueOf(Main.camaras1Producidas));
                            Planta1.camaras1Progreso.setValue(camaras1Producidas);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
    }

}


