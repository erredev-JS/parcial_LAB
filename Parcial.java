import java.util.Scanner;
import java.util.Locale;
public class Parcial {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useLocale(Locale.US);
     double resultado_anterior = 0;
     int op = 1;
        while (op != 5){
            System.out.println("[1] Suma [2] Resta [3] Multiplicacion [4] Division [5] Salir del programa.");
            System.out.println("Ingresa la opcion que deseas utilizar:");
             op = sc.nextInt();
            if (op == 1){
                // Suma
                if(resultado_anterior != 0){ // Logica repetida para comprobar si hicimos una operacion previamente.
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double suma = resultado_anterior + n2;
                    System.out.println("La suma de " + resultado_anterior + " y " + n2 + " es: " + suma);
                    resultado_anterior = suma; // Logica repetida para guardar el resultado anterior.
                }else{
                    System.out.println("Ingresa el primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double suma = n1 + n2;
                    System.out.println("La suma de " + n1 + " y " + n2 + " es: " + suma);
                    resultado_anterior = suma;
                }
            }if (op == 2){
                // Resta
                if(resultado_anterior != 0){
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double resta = resultado_anterior - n2;
                    System.out.println("La resta de " + resultado_anterior + " y " + n2 + " es: " + resta);
                    resultado_anterior = resta;
                }else{
                    System.out.println("Ingresa el primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double resta = n1 - n2;
                    System.out.println("La resta de " + n1 + " y " + n2 + " es: " + resta);
                    resultado_anterior = resta;
                }

            }if (op == 3){
                // Multiplicacion
                if(resultado_anterior != 0){
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double multp = resultado_anterior * n2;
                    System.out.println("La multiplicacion de " + resultado_anterior + " y " + n2 + " es: " + multp);
                    resultado_anterior = multp;
                }else{
                    System.out.println("Ingresa el primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double multp = n1 * n2;
                    System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es: " + multp);
                    resultado_anterior = multp;
                }

            }if (op == 4){
                // Division
                if(resultado_anterior != 0){
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    double div = resultado_anterior / n2;
                    if(n2 == 0){
                        System.out.println("Error de entrada, no puedes dividir por cero");
                    }else{
                        System.out.println("La division de " + resultado_anterior + " y " + n2 + " es: " + div);
                        resultado_anterior = div;
                    }
                }else{
                    System.out.println("Ingresa el primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double n2 = sc.nextDouble();
                    if(n2 == 0){
                        System.out.println("Error de entrada, no puedes dividir por cero");

                    }else{
                        double div = n1 / n2;
                        System.out.println("La division entre " + n1 + " y " + n2 + " es: " + div);
                        resultado_anterior = div;
                    }
                }



            }if(op == 5){
                System.out.println("Nos vemos, gracias por utilizar la calculadora!!");
                break;
            }
        }


    }
}