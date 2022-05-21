package Clases;

import Interfaces.Inicio;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {
    
    //Declaracion del tiempo.
    public static volatile int tiempo;
    public static volatile int tiempoRestante;
    
    //Declaración de Productores.
    public static volatile int pantallas1;
    public static volatile int botones1;
    public static volatile int pines1;
    public static volatile int camaras1;
    
    public static volatile int pantallas2;
    public static volatile int botones2;
    public static volatile int pines2;
    public static volatile int camaras2;
    
    //Declaracion de Ensambladores.
    public static volatile int ensambladores1;
    
    public static volatile int ensambladores2;
    
    //Declaracion del Jefe y el Gerente.
    public static volatile int jefe = 1;
    public static volatile int gerente = 1;
    
    //Declaracion de elementos.
    public static volatile int pantallas1Producidas = 0;
    public static volatile int botones1Producidos = 0;
    public static volatile int pines1Producidos = 0;
    public static volatile int camaras1Producidas = 0;
    public static volatile int telefonos1Producidos = 0;
    
    public static volatile int pantallas2Producidas = 0;
    public static volatile int botones2Producidos = 0;
    public static volatile int pines2roducidos = 0;
    public static volatile int camaras2Producidas = 0;
    public static volatile int telefonos2Producidos = 0;
    
    //Declaración de la capacidad máxima de almacenes.
    public static volatile int pantallas1Almacen;
    public static volatile int botones1Almacen;
    public static volatile int pines1Almacen;
    public static volatile int camaras1Almacen;
    
    public static volatile int pantallas2Almacen;
    public static volatile int botones2Almacen;
    public static volatile int pines2Almacen;
    public static volatile int camaras2Almacen;
    
    public static void main(String[] args) {
        
        //Lectura de los parámetros y asignación a las variables.
        CSVEL csvLector = new CSVEL();
        csvLector.LeerCsv();
        
        //Apertura de la interfaz inicial.
        Inicio inicio = new Inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
}
