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

    public static void funcionarios(int quant, Scanner sc) {
        double soma = 0;
        double salario = 0;

        for (int i = 0; i < quant; i++) {
            salario = sc.nextDouble();
            soma += salario;
        }

        System.out.printf("Média salarial: %.2f\n", (soma / quant));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1:
        // temperatura(2.43);

        // Q2:
        int sexo = sc.nextInt();
        double altura = sc.nextDouble();
        alturaSexo(sexo, altura, sc);

        // Q3:
        // int quant = sc.nextInt();
        // funcionarios(quant, sc);
    }
}
