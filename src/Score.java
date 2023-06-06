import java.util.Scanner;

public class Score {

    public static int calculateScore(int numero) {
        int score = 0;
            //Validaciones 
            if (numero % 2 == 0) {
                score += 1;
            } else if (numero % 5 == 0) {
                score += 5;
            } else {
                score += 3;
            }



        return score;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int scoreFinal=0;
        while (true){

            System.out.print("Ingrese su numero : ");
            int n = leer.nextInt();

            if(n!=0){
                scoreFinal += calculateScore(n);

                System.out.println("Score : "+ scoreFinal);
            }else {
                break;
            }

        }


    }
}
