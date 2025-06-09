import java.util.Scanner;

public class ProgramaTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetro = sc.nextDouble();

        Terreno terreno = new Terreno(largura, comprimento, valorMetro);

        System.out.printf("Area do terreno = %.2f\n", terreno.calcularArea());
        System.out.printf("Preco do terreno = %.2f\n", terreno.calcularPreco());

        sc.close();
    }
}