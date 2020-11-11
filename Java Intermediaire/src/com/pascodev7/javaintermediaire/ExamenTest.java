package com.pascodev7.javaintermediaire;

import java.util.Scanner;

public class ExamenTest {

    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);

        Examen examen =new Examen();
        System.out.print("Entrer la matiere: ");
        String matiere = clavier.nextLine();
        examen.afficherMessage(matiere);

        clavier.close();
    }
}
