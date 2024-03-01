import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite quatro notas : ");

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();


        Integer media =( n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua nota é " + media + ", e você esta ");
        if (media >= 7) {
            System.out.println("Aprovado");

        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        s.close();
    }
}
