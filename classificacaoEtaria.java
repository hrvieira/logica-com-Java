import java.util.Scanner;

public class classificacaoEtaria {
     public static void main(String[] args) {
          Scanner idade = new Scanner(System.in);
          int valor;
          String resultado = "";

          System.out.println("Sua idade está entre:");
          System.out.println("1 - Menos que 12");
          System.out.println("2 - Menos que 18");
          System.out.println("3 - Menos que 60");
          System.out.println("4 - Mais que 60");
          valor = idade.nextInt();

          switch (valor) {
               case 1:  
                    resultado = "criança";
                    break;
               case 2:
                    resultado = "adolescente";
                    break;
               case 3:
                    resultado = "adulto";
                    break;
               case 4:
                    resultado = "idoso";
                    break;
               default:
                    System.out.println("Opção inválida!");
                    break;
          }

          if (!resultado.isEmpty()) {
               System.out.println("Sua classificação etária é " + resultado + ".");
          }
     }
}
