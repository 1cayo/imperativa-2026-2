package atividade;

public class Main {
    public static void temperatura(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 1.8) + 32));
        System.out.println("Kelvin: " + (celsius + 273.15));
        System.out.printf("Reamur: %.3f\n", (celsius * 0.8));
        System.out.printf("Rankine: %.3f\n", ((celsius * 1.8) + 491.67));
    }

    public static void main(String[] args) {
        temperatura(2.43);
    }
}
