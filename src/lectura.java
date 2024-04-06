import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lectura {
public  static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
    System.out.println("Escriba el nombre de su pelicula favorita");
    String pelicula =teclado.nextLine();
    System.out.println("Ahora dijite la fecha de lanzamiento");
    int fechaDeLanzamiento=teclado.nextInt();
    System.out.println("Dejanos una nota para esta pelicula");
    double nota= teclado.nextDouble();
    System.out.println(pelicula);
    System.out.println(fechaDeLanzamiento);
    System.out.println(nota);
}
}
