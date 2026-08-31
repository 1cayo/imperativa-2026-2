package atividade;

import java.util.Scanner;

public class Main {
    public static void temperatura(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 1.8) + 32));
        System.out.println("Kelvin: " + (celsius + 273.15));
        System.out.printf("Reamur: %.3f\n", (celsius * 0.8));
        System.out.printf("Rankine: %.3f", ((celsius * 1.8) + 491.67));
    }

    public static void alturaSexo(int sexo, double altura, Scanner sc) {

        int soma = 0, quantidade = 0;
        for (int i = 0; i < 11; i++) {
            sexo = sc.nextInt();
            altura = sc.nextDouble();

            if (sexo == 2) {
                quantidade = 1;
                soma += quantidade;
            }

        }

        System.out.println("Maior altura: ");
        System.out.println("Menor altura: ");
        System.out.println("Média da altura dos homens: ");
        System.out.println("Número de mulheres: " + soma);
    }

    public static double calcularMediaSalarial(int quant, Scanner sc) {
        double soma = 0;
        for (int i = 0; i < quant; i++) {
            double salario = sc.nextDouble();
            soma += salario;
        }
        return soma / quant;
    }

    public static int quantidadeAzulejos(double altParede, double largParede, double altAzulejo, double largAzulejo) {
        double areaParede = altParede * largParede;
        double areaAzulejo = altAzulejo * largAzulejo;
        return (int) Math.ceil(areaParede / areaAzulejo);
    }

    public static double volumeLata(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static double calcularPotenciaHp(double massa, double altura, double tempo) {
        double g = 9.81;
        double p = (massa * g * altura) / tempo;
        return p / 745.6999;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        // Questao 1:
        // temperatura(2.43);

        // Questao 2:
        // int sexo = sc.nextInt();
        // double altura = sc.nextDouble();
        // alturaSexo(sexo, altura, sc);

        // Questao 3:
        // int quant = sc.nextInt();
        // double mediaSalarial = calcularMediaSalarial(quant, sc);
        // System.out.printf("Média salarial: %.2f\n", mediaSalarial);

        // Questao 4:
        // double altParede = sc.nextDouble();
        // double largParede = sc.nextDouble();
        // double altAzulejo = sc.nextDouble();
        // double largAzulejo = sc.nextDouble();
        // int azulejos = quantidadeAzulejos(altParede, largParede, altAzulejo, largAzulejo);
        // System.out.println("Quantidade de azulejos necessários: " + azulejos);

        // Questao 5:
        // double raio = sc.nextDouble();
        // double alturaLata = sc.nextDouble();
        // double volume = volumeLata(raio, alturaLata);
        // System.out.printf("Volume da lata de óleo: %.2f m³\n", volume);

        // Questao 6:
        // double massa = sc.nextDouble();
        // double alturaMassa = sc.nextDouble();
        // double tempo = sc.nextDouble();
        // double hp = calcularPotenciaHp(massa, alturaMassa, tempo);
        // System.out.printf("Potência necessária: %.3f hp\n", hp);
    }
}
