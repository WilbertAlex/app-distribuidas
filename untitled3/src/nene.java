import java.util.Scanner;

public class nene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int indice;
        int valor = 0;

        do {
            System.out.println(" EN QUE INDICE DEL ARRAY DESEAS INGRESAR UN NUMERO ?:");
            indice = sc.nextInt();

            if (indice != 1000) {

                if (indice >= 0 && indice <= 9) {
                    System.out.println(" QUE NUEMRO DESEAS INGRESAR EN ESE INDICE:");
                    valor = sc.nextInt();
                    numeros[indice] = valor;//ESTE ES EL CORRECTO

                }else{
                    System.out.println("error ese indice NO EXSISTE");
                }

            }



            } while (indice != 1000) ;
        System.out.println("-------eso los valores que pusites aca indice---------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("valor de la selda " + i + ":" + numeros[i]);
        }


        }
    }



