public class Main {
    public static void main(String[] args) {


         int[] numeros = new int[10];//delaramos o creamos un array entero de 10 seldas

        //colocamos valores en las celdas de array "numeros"
        numeros[0]=8;
        numeros[9]=800;
        numeros[1]=700;
        numeros[2]=-5;
        numeros[3]=-4;
        numeros[4]=90;
        numeros[5]=55;
        numeros[6]=0;
        numeros[7]=200;
        numeros[8]=15;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("valor de la selda "+i+":" + numeros[i]);

        }

    }
}