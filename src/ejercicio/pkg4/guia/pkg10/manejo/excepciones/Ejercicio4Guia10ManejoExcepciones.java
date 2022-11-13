package ejercicio.pkg4.guia.pkg10.manejo.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4Guia10ManejoExcepciones {

    public static void main(String[] args) {
    Ejercicio4Guia10ManejoExcepciones e=new Ejercicio4Guia10ManejoExcepciones();
    e.todo();
    }
        public void mostrar() throws InputMismatchException {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero"); //inputMis
        int n=leer.nextInt();
            System.out.println("-------------------");
        }
        public void mostrar1() throws NumberFormatException{ 
            Scanner leer=new Scanner(System.in);
            System.out.println("ingrese un numero");
             String p=leer.nextLine();
             int a= Integer.parseInt(p);
             System.out.println("-------------------");
        }
        public void mostrar2() throws ArithmeticException{
           Scanner leer=new Scanner(System.in);
            System.out.println("ingrese un numero ");
            int c=leer.nextInt();
            System.out.println("ingrese otro numero");
            int e=leer.nextInt();
            int f=c/e; 
        }
        public void todo(){
        try{
                    mostrar();
                    mostrar1();
                    mostrar2();
        }
        
        catch(InputMismatchException a){
            System.out.println("lo que ingreso no es un numero "+a.getMessage());}
       
        catch(NumberFormatException b){
            System.out.println("no se puede convertir en entero "+b.getMessage());}
        
         catch(ArithmeticException c){
            System.out.println("no se puede dividir por cero "+c.getMessage());}
    }
}
/*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/