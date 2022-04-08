package com.company;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira o primeiro número que deseja calcular: ");
            Double primeiroNumero = scanner.nextDouble();
            System.out.print("ADIÇÃO(1)\nSUBTRAÇÃO(2)\nMULTIPLICAÇÃO(3)\nDIVISÃO(4)\n");
            System.out.print("Escolha o tipo de operação: ");
            int operaçãoEscolhida = scanner.nextInt();
            System.out.print("Insira o segundo número que deseja calcular: ");
            Double segundoNumero = scanner.nextDouble();
            System.out.println("=================================");
            for (int i = 0; i < 80; i++) {
                System.out.println("");
            }
            boolean operacaoAdicao = operaçãoEscolhida == 1;
            boolean opercaoSubtracao = operaçãoEscolhida == 2;
            boolean opercaoMultiplicacao = operaçãoEscolhida == 3;
            boolean opercaoDivisao = operaçãoEscolhida == 4;
            if (operacaoAdicao) {
                double totalAdicao = primeiroNumero + segundoNumero;
                System.out.println("O calculo deu: " + totalAdicao);
            } else if (opercaoSubtracao) {
                double totalSubtracao = primeiroNumero - segundoNumero;
                System.out.println("O calculo deu: " + totalSubtracao);
            } else if (opercaoMultiplicacao) {
                double totalMultiplicacao = primeiroNumero * segundoNumero;
                System.out.println("O calculo deu: " + totalMultiplicacao);
            } else if (opercaoDivisao) {
                double totalDivisao = primeiroNumero / segundoNumero;
                System.out.println("O calculo deu: " + totalDivisao);
            } else {
                System.out.println("!!!!ERRO!!!!");
            }
            scanner.close();
    }
}