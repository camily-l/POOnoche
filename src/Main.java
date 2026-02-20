import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("""
        1- lunes
        2- martes
        3- miercoles
        4- jueves
        5- viernes
        6- sabado
        7- domingo
        """);

        System.out.println("Ingrese el numero correspondiente al dia de la semana:");

        int dia = teclado.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Es lunes");
            case 2 -> System.out.println("Es martes");
            case 3 -> System.out.println("Es miercoles");
            case 4 -> System.out.println("Es jueves");
            case 5 -> System.out.println("Es viernes");
            case 6 -> System.out.println("Es sabado");
            case 7 -> System.out.println("Es domingo");
            default -> System.out.println("Numero invalido");
        }

        teclado.close();
    }