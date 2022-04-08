package com.company;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro lado de um triangulo: ");
        int primeiroLado = scanner.nextInt();
        System.out.print("Informe o segundo lado de um triangulo: ");
        int segundoLado = scanner.nextInt();
        System.out.print("Informe o terceiro lado de um triangulo: ");
        int terceiroLado = scanner.nextInt();
        boolean naoPodeSerTriangulo = primeiroLado + segundoLado + terceiroLado > 180;
        if (naoPodeSerTriangulo) {
            System.out.println("Os numeros digitados passou o limite de um triangulo.");
        } else {
            boolean eUmTriangulo = primeiroLado + segundoLado >= terceiroLado || primeiroLado + terceiroLado >= segundoLado ||
                    segundoLado + terceiroLado >= primeiroLado;
            if (!eUmTriangulo) {
                System.out.println("Os lados digitados não formam um triagulo.");
            } else {
                boolean todosOsladosIguais = primeiroLado == segundoLado && primeiroLado == terceiroLado;
                boolean doisLadosIguais = primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado;
                boolean tresLadosDiferentes = primeiroLado != segundoLado && segundoLado != terceiroLado;
                if (todosOsladosIguais) {
                    System.out.println("Todos os lados são igual, por isso forma um triangulo esquilatero.");
                } else if (doisLadosIguais) {
                    System.out.println("Dois lados são iguais, por isso forma um triangulo isóceles.");
                } else if (tresLadosDiferentes) {
                    System.out.println("Todos os são diferentes, por isso forma um triangulo escaleno.");
                }
            }
        }
        scanner.close();
    }
}