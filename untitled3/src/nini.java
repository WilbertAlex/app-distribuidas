public class nini {
    public static void main(String[] args) {

        String[][] tableros = new String[5][5];

            tableros[0][2] = "x";
            tableros[2][1] = "x";
            tableros[2][3] = "x";
            tableros[4][4] = "x";

              for(int j = 0; j <= 4; j++) {
                  for(int j = 0; j <=5; i++) {
                      if(tableros[i][j].equals("x")) {
                          tableros[i][j] = "x";
                      }
                  }
              }
           System.out.print(tableros[0][2]+"  ");
           System.out.print(tableros[0][1]+"  ");
           System.out.print(tableros[0][3]+"  ");
           System.out.print(tableros[0][4]+"  ");

           System.out.println();
           System.out.print(tableros[1][2]+"  ");
           System.out.print(tableros[1][1]+"  ");
           System.out.print(tableros[1][3]+"  ");
           System.out.print(tableros[1][4]+"  ");

           System.out.println();
           System.out.print(tableros[2][2]+"  ");
           System.out.print(tableros[2][1]+"  ");
           System.out.print(tableros[2][3]+"  ");
           System.out.print(tableros[2][4]+"  ");

           System.out.println();
           System.out.print(tableros[3][2]+"  ");
           System.out.print(tableros[3][1]+"  ");
           System.out.print(tableros[3][3]+"  ");
           System.out.print(tableros[3][4]+"  ");

           System.out.println();
           System.out.print(tableros[4][2]+"  ");
           System.out.print(tableros[4][1]+"  ");
           System.out.print(tableros[4][3]+"  ");
           System.out.print(tableros[4][4]+"  ");


    }
}
