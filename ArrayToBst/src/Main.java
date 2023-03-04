import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        BST tree = new BST();

        System.out.println("Bienvenido \n \nPorfavor, ingrese los nombres ordenados alfabeticamente como en el siguiente ejemplo:");
        System.out.println("Andres Carlos Daniela Nicolas Pablo William \n");

        String names = sc.nextLine();

        String[] array = names.split(" ");

        tree.arrayTo(array);

        System.out.println("\nEl recorrido inverso es:");
        tree.inOrderReverse();

    }

}