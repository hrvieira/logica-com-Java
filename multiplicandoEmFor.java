import java.util.Scanner;

public class multiplicandoEmFor {
     public static void main(String[] args) {
          int multi = 1;
          int i, num = 0;

          Scanner ler = new Scanner(System.in);

          for (i = 1; i <= 5; ++i) {
               System.out.println("Digite um número do tipo inteiro para multiplicar: ");
               num = ler.nextInt();
               multi = multi * num;
          }

          System.out.println("Resultado da multiplicação: " + multi);
     }
}
