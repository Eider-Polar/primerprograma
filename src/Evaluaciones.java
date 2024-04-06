import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double nota =0;
        double mediaEvaluaciones=0;
        double tatalEvaluaciones=0;

        while (nota != -1){
            System.out.print("Escribe  la nota que le darias a la pelicula de matrix");
            nota=teclado.nextDouble();
            if (nota !=-1){
                mediaEvaluaciones +=nota;
                tatalEvaluaciones++;
            }


        }
        System.out.println("la media de nota para la pelicula de matrix es "+mediaEvaluaciones/tatalEvaluaciones);
    }
}
