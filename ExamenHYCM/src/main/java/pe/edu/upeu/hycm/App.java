package pe.edu.upeu.hycm;
import pe.edu.upeu.hycm.examen.*;
import pe.edu.upeu.hycm.utils.*;
public class App {

  public static ResolucionExamen re = new ResolucionExamen();
  static LeerTeclado lt = new LeerTeclado();
  static void menuOpciones(){ 
      
    int opcion=0;
    System.out.println("_________________");
    String msg="\nElija el algoritmo que desea probar"
    +"\n1 : El gerente de una companhia automotriz desea determinar el impuesto"
    +"\n2 : La tabla de multiplicacion del 1 al 20"
    +"\n3 : Numero perfecto"
    +"\n4 : x elevado a la n, metodo de recursividad"
    +"\nDesea terminar el programa, presione la tecla '0'\n";

    opcion=lt.leer(0, msg); 
    while(opcion!=0){
      switch(opcion) {
      case 1: re.Ejercicio02(); break;
      case 2: re.Ejercicio03(); break;
      case 3: re.Ejercicio04(); break;
      case 4: 
      int x = lt.leer(0, "Ingrese el valor de x");
      int n = lt.leer(0, "Ingrese el valor de n");
      System.out.println(re.Ejercicio05(x, n)); break;

      default: System.out.println("LA PREGUNTA NO EXISTE!");
      }   
      System.out.println("______________________"); 
      opcion=lt.leer(0, msg);        
      }
    }

    public static void main( String[] args )
    {
      System.out.println( "BIENVENIDO AL SISTEMA DE ALGORITMOS\n" );
      menuOpciones();
    }
}