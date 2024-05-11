import java.util.Scanner;

public class multiComDoWhile {
     public static void main(String[] args) {
          int multi = 1;
          int i = 1; 
          int num = 0;

          Scanner ler = new Scanner(System.in);

          do {
               System.out.println("Digite um número do tipo inteiro para multiplicar: ");
               num = ler.nextInt();
               multi = multi * num;
               i++;

          } while (i <= 5);
          

          System.out.println("Resultado da multiplicação: " + multi);
     }
}
