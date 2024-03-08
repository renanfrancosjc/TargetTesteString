import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String text;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");

        String palavra = scanner.nextLine();

        System.out.println("a palavra é: ");
        System.out.println(palavra);

        char[] palavraInvertida = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            palavraInvertida[palavra.length() - 1 - i] = palavra.charAt(i);
        }

        System.out.println("A palavra de trás para frente é: ");
        for (char letra : palavraInvertida) {
            System.out.print(letra);
        }

    }
}