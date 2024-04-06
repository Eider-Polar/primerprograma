//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Bienvenido a screen match ");
        System.out.println("Pelicula: Matrix");
        // int numero entero
        int fechaDeLanzamiento = 1999;
        // bolean falso o verdadero
        boolean incluidoEnElPlan =true;
        //double numero decimal
        double notaDeLaPelicula=8.2;
        double media = (8.1+6.0+9.0)/3;
        System.out.println(media);

        String sinopsis = """
                unos manes que entran al meta verso de Mark 
                Zuckerberg y se dan en la geta con
                movimientos re locos fue lanzada en:
                """+ fechaDeLanzamiento;
        System.out.println(sinopsis);
        int clasificacion =(int)(media/2);
        System.out.println(clasificacion);
    }





}