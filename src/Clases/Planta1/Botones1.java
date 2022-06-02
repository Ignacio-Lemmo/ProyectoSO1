package Clases.Planta1;

import Clases.Main;
import static Clases.Main.botones1Producidos;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;

public class Botones1 extends Thread{
    Semaphore botones1;
    Semaphore botones1mut;
    Semaphore botones1em;
    
    int pordia;
    int salary;
    int tiempoE;
    
    boolean contratadoB;
    
    
    public Botones1(Semaphore botones1, Semaphore botones1mut, Semaphore botones1em, int pordia, int salary, boolean contratadoB) {
        this.botones1 = botones1;
        this.botones1mut = botones1mut;
        this.botones1em = botones1em;
        this.pordia = 3;
        this.salary = 4;
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
                 this.botones1.acquire();
                    this.botones1mut.acquire();
                    Main.botones1Producidos ++;
                    this.botones1mut.release();
                    this.botones1em.release();
                            Planta1.botones1Progreso.setString(String.valueOf(Main.botones1Producidos));
                            Planta1.botones1Progreso.setValue(botones1Producidos);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
    }

}
