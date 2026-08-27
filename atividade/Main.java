package atividade;

import java.util.Scanner;

public class Main {
    public static void temperatura(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 1.8) + 32));
        System.out.println("Kelvin: " + (celsius + 273.15));
        System.out.printf("Reamur: %.3f\n", (celsius * 0.8));
        System.out.printf("Rankine: %.3f", ((celsius * 1.8) + 491.67));
    }

    public static void funcionarios(int quant, Scanner sc) {
        double soma = 0;
        double salario = 0;

        for (int i = 0; i < quant; i++) {
            salario = sc.nextDouble();
            soma += salario;
        }

        System.out.printf(java.util.Locale.US, "Média salarial: %.2f\n", (soma / quant));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        int quant = sc.nextInt();
        funcionarios(quant, sc);
    }
}
