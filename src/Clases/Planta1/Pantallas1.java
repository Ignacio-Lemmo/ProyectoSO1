package Clases.Planta1;

import Clases.Main;
import static Clases.Main.pantallas1Producidas;
import Interfaces.Planta1;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;


public class Pantallas1 extends Thread{
    
    Semaphore pantallas1;
    Semaphore pantallas1mut;
    Semaphore pantallas1em;
    
    int pordia;
    int salary;
    int tiempoE;
    
    boolean contratadoB;
    
    
    public Pantallas1(Semaphore pantallas1, Semaphore pantallas1mut, Semaphore pantallas1em, int pordia, int salary, boolean contratadoB) {
        this.pantallas1 = pantallas1;
        this.pantallas1mut = pantallas1mut;
        this.pantallas1em = pantallas1em;
        this.pordia = 3;
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
                    this.pantallas1.acquire();
                    this.pantallas1mut.acquire();
                    Main.pantallas1Producidas ++;
                    this.pantallas1mut.release();
                    this.pantallas1em.release();
                            Planta1.pantallas1Progreso.setString(String.valueOf(Main.pantallas1Producidas));
                            Planta1.pantallas1Progreso.setValue(pantallas1Producidas);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
    }
}

