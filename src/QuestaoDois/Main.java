package QuestaoDois;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = ler.nextLine();

		System.out.print("Digite seu peso: ");
		Float peso = ler.nextFloat();

		String categoria = "";

		if (peso < 65) {
			categoria = "Pena";
		} else if (peso >= 65 && peso < 72) {
			categoria = "Leve";
		} else if (peso >= 72 && peso < 79) {
			categoria = "Ligeiro";
		} else if (peso >= 79 && peso < 86) {
			categoria = "Meio Médio";
		} else if (peso >= 86 && peso < 93) {
			categoria = "Médio";
		} else if (peso >= 93 && peso < 100) {
			categoria = "Meio Pesado";
		} else if (peso >= 100) {
			categoria = "Pesado";
		}

		System.out.println("O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria);
	}

}