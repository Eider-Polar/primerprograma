import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double nota=0;
        double mediaEvaluaciones=0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Escribe  la nota que le darias a la pelicula de matrix");
            nota=teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones +nota;

        }
        System.out.println("la media de nota para la pelicula de matrix es "+mediaEvaluaciones/3);
    }
}
