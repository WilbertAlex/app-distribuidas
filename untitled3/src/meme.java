import java.util.Scanner;

public class meme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]nombres = new String[10];

        for (int i = 0; i <=9; i++) {
            System.out.print("INGRESE EL NOMBRE ");
            nombres[i] =sc.nextLine();

        }
        System.out.println("LISTA DE NOMBRES INGRESADOS");
        for (int i = 0; i < nombres[1].length(); i++) {
            switch (nombres[1].charAt(i)) {}
        }
    }
}

