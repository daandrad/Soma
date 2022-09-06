import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
   double soma = 0;

Scanner numero = new Scanner(System.in);

System.out.println("Vamos somar?\nPara isto, digite um número");

double num1 = numero.nextDouble();

System.out.println("Ótimo. Digite outro número");

double num2 = numero.nextDouble();

soma = num1 + num2;

System.out.println("A soma é: = "+ soma);

  }
  
}