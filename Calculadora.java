import java.util.Scanner;
public class Calculadora {
public static double sumar(double a, double b) {
return a + b;
}
public static double restar(double a, double b) {
return a - b;
}
public static double multiplicar(double a, double b) {
return a * b;
}
public static double dividir(double a, double b) {
if (b == 0) {
throw new ArithmeticException();
}
return a / b;
}
public static double calculadora(double a, double b, int opcion) {
switch (opcion) {
case 1: return sumar(a, b);
case 2: return restar(a, b);
case 3: return multiplicar(a, b);
case 4: return dividir(a, b);
}
return 0;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora:");
System.out.println("1 Sumar");
System.out.println("2 Restar");
System.out.println("3 Multiplicar");
System.out.println("4 Dividir");
System.out.print("Elige una opción: ");
int opcion = scanner.nextInt();
System.out.print("Introduce el primer número: ");
double a = scanner.nextDouble();
System.out.print("Introduce el segundo número: ");
double b = scanner.nextDouble();
try {
double resultado = calculadora(a, b, opcion);
System.out.println("Resultado: " + resultado);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
scanner.close();
}
}