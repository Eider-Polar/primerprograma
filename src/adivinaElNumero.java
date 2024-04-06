import java.util.Random;
import java.util.Scanner;

public class adivinaElNumero {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int numeroSecreto= new Random().nextInt(100);
        int numeroUsuario =0;
        int intentos =0;
        System.out.println(numeroSecreto);
        while (numeroSecreto != numeroUsuario  && intentos < 5){
            System.out.println("dijite un numero ");
            numeroUsuario=teclado.nextInt();
            intentos++;
            if( numeroSecreto>numeroUsuario){
                System.out.println("El numero es mayor");
            }else {
                System.out.println("el numero es menor ");
            }
        }
        System.out.println("felicidades hacertaste el numero en: "+intentos+"  intentos ");

    }
}
