package Clases;

import Clases.Planta1.Botones1;
import Clases.Planta1.Camaras1;
import Clases.Planta1.Ensambladores1;
import Clases.Planta1.Pantallas1;
import Clases.Planta1.Pines1;
import Clases.Planta2.Botones2;
import Clases.Planta2.Camaras2;
import Clases.Planta2.Ensambladores2;
import Clases.Planta2.Pantallas2;
import Clases.Planta2.Pines2;
import Interfaces.Inicio;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {
    
    //Declaracion del tiempo.
    public static volatile int tiempo;
    public static volatile int diasRestantes;
    public static volatile int dias;
    
    //Declaración de Productores.
    public static volatile int pantallas1Contratados;
    public static volatile int botones1Contratados;
    public static volatile int pines1Contratados;
    public static volatile int camaras1Contratados;
    
    public static volatile int pantallas2Contratados;
    public static volatile int botones2Contratados;
    public static volatile int pines2Contratados;
    public static volatile int camaras2Contratados;
    
    //Declaracion de Ensambladores.
    public static volatile int ensambladores1;
    
    public static volatile int ensambladores2;
    
    //Declaracion del Jefe y el Gerente.
    public static volatile int jefe = 1;
    public static volatile int jefeEstado;
    public static volatile int gerente = 1;
    
    //Declaracion de elementos.
    public static volatile int pantallas1Producidas = 0;
    public static volatile int botones1Producidos = 0;
    public static volatile int pines1Producidos = 0;
    public static volatile int camaras1Producidas = 0;
    public static volatile int telefonos1Producidos = 0;
    
    public static volatile int pantallas2Producidas = 0;
    public static volatile int botones2Producidos = 0;
    public static volatile int pines2Producidos = 0;
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
    
    //Declaración de Gastos.
    public static volatile int pantallas1Gastos = 0;
    public static volatile int botones1Gastos = 0;
    public static volatile int pines1Gastos = 0;
    public static volatile int camaras1Gastos = 0;
    public static volatile int ensambladores1Gastos = 0;
    public static volatile int gerente1Gastos = 0;
    public static volatile int jefe1Gastos = 0;
    
    public static volatile int pantallas2Gastos = 0;
    public static volatile int botones2Gastos = 0;
    public static volatile int pines2Gastos = 0;
    public static volatile int camaras2Gastos = 0;
    public static volatile int ensambladores2Gastos = 0;
    public static volatile int gerente2Gastos = 0;
    public static volatile int jefe2Gastos = 0;
    
    //Creación de Lista de Productores.
    public static volatile Botones1 listaBotones1[] = new Botones1[15];
    public static volatile Pantallas1 listaPantallas1[] = new Pantallas1[15];
    public static volatile Pines1 listaPines1[] = new Pines1[15];
    public static volatile Camaras1 listaCamaras1[] = new Camaras1[15];
    public static volatile Ensambladores1 listaEnsambladores1[] = new Ensambladores1[15];

    public static volatile Botones2 listaBotones2[] = new Botones2[15];
    public static volatile Pantallas2 listaPantallas2[] = new Pantallas2[15];
    public static volatile Pines2 listaPines2[] = new Pines2[15];
    public static volatile Camaras2 listaCamaras2[] = new Camaras2[15];
    public static volatile Ensambladores2 listaEnsambladores2[] = new Ensambladores2[15];
    
    //Declaración de Ganancias.
    public static volatile int ganancias = 0;
    public static volatile int gananciaTotal = 0;
    
    //Declaracion de telefonos producidos.
    public static volatile int producidos1 = 0;
    public static volatile int producidos2 = 0;
    public static volatile int producidos1Total = 0;
    public static volatile int producidos2Total = 0;
    
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
