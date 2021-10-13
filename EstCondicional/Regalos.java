
import java.util.Scanner; 

public class Regalos{

static Scanner sc = new Scanner(System.in);

static void algoritmoRegalos(){
  //Definir Variables
  double monto=0;
  String regalo="";
  //Datos de entrada
  System.out.println("Ingrese el monto que dispone:");  
  monto=sc.nextDouble();
  //Proceso
  if(monto>=1 && monto<=10){
    regalo="\nTarjeta";    
  } else if(monto>=11 && monto<=100){
    regalo="\nChocolate\nTarjeta";
  }else if(monto>=101 && monto<=250){
    regalo="\nFlores\nChocolate\nTarjeta";
  }else if(monto>250){
    regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
  }else{
    regalo="Ninguno";
  }
  //Datos de salida
  System.out.println("Ud. puede elegir los siguientes: "+ regalo);
}


static void pagoPolizas(){
  //Declarar Variebles
  String plan, alcohol, lentes, enfermedad;
  int edad; 
  double costoPago, recargos=0;
  //Datos de entrada
  System.out.println("Ingrese el Plan (A/B):");
  plan=sc.next();
  System.out.println("Consume Alcohol? (S/N):");
  alcohol=sc.next();
  System.out.println("Usa lentes? (S/N):");
  lentes=sc.next();
  System.out.println("Tiene alguna enfermedad? (S/N):");
  enfermedad=sc.next();    
  System.out.println("Ingrese su edad?:");
  edad=sc.nextInt();       
  //Proceso
  if(alcohol.equals("S")){recargos+=0.10;}
  if(lentes.equals("S")){recargos+=0.05;}
  if(enfermedad.equals("S")){recargos+=0.05;}
  if(edad>40){recargos+=0.20;}else{recargos+=0.10;}

  if(plan.equals("A")){ costoPago=1200+1200*recargos;}
  else{
      costoPago=950+950*recargos;
  }
  //Datos de salida
  System.out.println("Ud. debe pagar el monto de: $ "+costoPago);
}

static void mesdelAnho(){
  //Declarar Variables
  int mesNum; 
  String mesLetra="";
  //Datos de entrada
  System.out.println("Ingrese el numero del mes entre 1-12:");
  mesNum=sc.nextInt();
  //Proceso
  switch(mesNum){
    case 1:  mesLetra="Enero"; break;
    case 2:  mesLetra="Febrero"; break;
    case 3:  mesLetra="Marzo"; break;
    case 4:  mesLetra="Abril"; break;
    case 5:  mesLetra="Mayo"; break;
    case 6:  mesLetra="Junio"; break;
    case 7:  mesLetra="Julio"; break;
    case 8:  mesLetra="Agosto"; break;
    case 9:  mesLetra="Septiembre"; break;
    case 10:  mesLetra="Octubre"; break;
    case 11:  mesLetra="Noviembre"; break;
    case 12:  mesLetra="Diciembre"; break;
    default: 
    mesLetra="No existe";
    System.out.println("El mes no es valido!");break;
  }
  //Datos de salida
  System.out.println("El mes "+mesNum+" es:"+mesLetra);
}

static void menuOpciones(){
int opcion=0;
String msg="Eliga el algoritmo que desea probar\n 1=ssss\n2=zzzz";
System.out.println(msg);
opcion=sc.nextInt();

while(opcion!=0){
    switch(opcion){
        case 1: algoritmoRegalos(); break;
        case 2:  pagoPolizas(); break;
        case 3:  mesdelAnho(); break;
        default: System.out.println("Opcion no existe!");
    }
  System.out.println(msg);
  opcion=sc.nextInt();    
}
}

public static void main(String[] arg){
//algoritmoRegalos();
  //pagoPolizas();
  //mesdelAnho();
  menuOpciones();

}

}