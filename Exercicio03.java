package com.company;
import java.util.Scanner;

public class Exercicio03 {

    static final  Integer NOTA_MINIMA_PARA_PASSAR = 70;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua nota final: ");
        double notaDoAluno = scanner.nextDouble();
        boolean acimaDaMedia = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR;
        if (acimaDaMedia) {
            System.out.println("O aluno passou de ano.");
        } else {
            System.out.println("O aluno não passou de ano.");
        }
        scanner.close();
    }
}