package QuestaoUm;

public class Main {

	public static void main(String[] args) {

		int lado1 = 16;
		int lado2 = 16;
		int lado3 = 32;

		int resultado = lado1 + lado2;

		if (resultado > lado3) {

			if (lado1 == lado2 && lado1 == lado3) {

				System.out.println("E um Triagulo equilatero");

				return;

			}

			if (lado1 == lado2 || lado1 == lado3) {
				System.out.println("É um Triangulo Isosceles");

				return;
			}

			if (lado1 != lado2 && lado1 != lado3) {
				System.out.println("É um Triangulo Escaleno");

				return;

			}

		}

	}

}
