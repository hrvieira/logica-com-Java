import java.util.Scanner;

public class escolha {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int OP;
          float num = 0, resultado;

          System.out.println("Opções:");
          System.out.println("1 - Calcular o dobro do número ");
          System.out.println("2 - Calcular o triplo do número ");
          System.out.println("Escolha uma opção: ");
          OP = entrada.nextInt();
          System.out.println("Digite um número: ");
          num = entrada.nextFloat();

          switch (OP) {
               case 1:  
                    resultado = num*2;
                    System.out.println("Dobro: " + resultado);
                    break;
               case 2:
                    resultado = num*3;
                    System.out.println("Triplo: " + resultado);
                    break;
          }

     }
}
