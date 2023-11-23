import java.util.Scanner;

public class provaantiga1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdConsumidores;

        System.out.println("---Receber---");
        System.out.print("Quantidade de consumidores --> ");
        qtdConsumidores = sc.nextInt();

        String[] nome = new String[qtdConsumidores];
        double[] consumoJulho = new double[qtdConsumidores];
        double[] consumoAgosto = new double[qtdConsumidores];
        double[] consumoSetembro = new double[qtdConsumidores];

        for (int i = 0; i < qtdConsumidores; i++) {
            sc.nextLine(); // Para consumir a quebra de linha
            System.out.print("Nome --> ");
            nome[i] = sc.nextLine();

            System.out.print("Consumo do mês de Julho --> ");
            consumoJulho[i] = sc.nextDouble();

            System.out.print("Consumo do mês de Agosto --> ");
            consumoAgosto[i] = sc.nextDouble();

            System.out.print("Consumo do mês de Setembro --> ");
            consumoSetembro[i] = sc.nextDouble();
        }

        double salario;
        System.out.print("Salário --> ");
        salario = sc.nextDouble();

        double valorPagar = (salario * 3 / 100) / 100;

        System.out.println("---Imprimir---\n");

        double maiorValor = Double.MIN_VALUE;
        double menorValor = Double.MAX_VALUE;
        String maiorConsumidor = "";
        String menorConsumidor = "";

        for (int i = 0; i < qtdConsumidores; i++) {
            System.out.println(nome[i] + ": ");
            double total = 0;

            double pagarJulho = valorPagar * consumoJulho[i];
            total += pagarJulho;

            double pagarAgosto = valorPagar * consumoAgosto[i];
            total += pagarAgosto;

            double pagarSetembro = valorPagar * consumoSetembro[i];
            total += pagarSetembro;

            System.out.println("Valor a pagar em Julho: " + String.format("%.2f", pagarJulho));
            System.out.println("Valor a pagar em Agosto: " + String.format("%.2f", pagarAgosto));
            System.out.println("Valor a pagar em Setembro: " + String.format("%.2f", pagarSetembro));
            System.out.println("Total a pagar: " + String.format("%.2f", total));
            System.out.println();

            // Verificar o maior consumidor
            if (total > maiorValor) {
                maiorValor = total;
                maiorConsumidor = nome[i];
            }

            // Verificar o menor consumidor
            if (total < menorValor) {
                menorValor = total;
                menorConsumidor = nome[i];
            }
        }

        System.out.println("Maior consumidor: " + maiorConsumidor + " - Total a pagar: " + String.format("%.2f", maiorValor));
        System.out.println("Menor consumidor: " + menorConsumidor + " - Total a pagar: " + String.format("%.2f", menorValor));
    }
}
