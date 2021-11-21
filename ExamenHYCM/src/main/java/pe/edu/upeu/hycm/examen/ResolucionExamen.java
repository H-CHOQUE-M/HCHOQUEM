package pe.edu.upeu.hycm.examen;
import pe.edu.upeu.hycm.utils.*;

public class ResolucionExamen {
static LeerTeclado lt = new LeerTeclado();

public void Ejercicio02(){
int n, categoria;
double precio, impuesto, categoria1, categoria2, categoria3, total;
categoria1 = categoria2 = categoria3 = total = impuesto = 0;
n = lt.leer(0, "Ingrese el numero de autos ");

while (n > 0){
  precio = lt.leer(0, "Ingrese el precio del auto "+n);
  categoria = lt.leer(0, "Ingrese la categoria del auto ");
  if (categoria > 0 && categoria < 4){
  if (categoria == 1){
    impuesto = precio * 0.12;
    categoria1 = categoria1 + impuesto;}
  else if (categoria == 2){
    impuesto = precio * 0.08;
    categoria2 = categoria2 + impuesto;}
  else{
    impuesto = precio * 0.05;
    categoria3 = categoria3 + impuesto;
    }
    total = total + impuesto;
    System.out.println("El impuesto a pagar por el auto " + n + " es: $" + impuesto + "\n");
      n--;
    }
    else {
    System.out.println("Ingrese la categoria correcta");
    }
  }
    System.out.println("El impuesto a pagar por la categoria 1 es : $" + categoria1);
    System.out.println("El impuesto a pagar por la categoria 2 es : $" + categoria2);
    System.out.println("El impuesto a pagar por la categoria 3 es : $" + categoria3);
    System.out.println("El impuesto total por todos los autos es : $" + total);
    }
    public void Ejercicio03(){
      int i, k, multi;

      for (i = 1; i <= 20; i++){
        System.out.println("\nLa tabla del:" + i);
      for (k = 1; k <= 10; k++){
        multi = i * k;
        System.out.println (i + " * " + k + " = " + multi);
        }
      }
    }
    public void Ejercicio04(){
      int i, n, auxEntero;
      i = 1;
      auxEntero = 0;

      n = lt.leer(0, "Introduce el rango de numeros ");

      while (i <= n){
        if(i % 2 == 0){
        for(int j = (i / 2); j >= 1 ; j--){
        if( i % j == 0){
          auxEntero = auxEntero + j;
          }
        }
        if(auxEntero == i)
          System.out.println("Número Perfecto " + auxEntero);
        }
          auxEntero = 0;
          i++;
        }

    }

    public int Ejercicio05(int x, int n){
      if (n == 0) return 1;
      return  x * Ejercicio05(x, n - 1);
    }
}