package org.example;

public class Main {
    public static void calcularDesconto(double salario) {
        if (salario <= 900) {
            System.out.println("isento");
        } else if (salario <= 1500) {
            System.out.println("desconto de 5%");
        } else if (salario <= 2500) {
            System.out.println("desconto de 10%");
        } else {
            System.out.println("desconto de 20%");
        }
    }

    // Função principal para testar as condicionais
    public static void main(String[] args) {
        calcularDesconto(850);
        calcularDesconto(1200);
        calcularDesconto(3000);
    }
}