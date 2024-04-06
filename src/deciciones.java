public class deciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan =true;
        double notaDeLaPelicula=8.2;
        String tipoPlan ="plus";
        if (fechaDeLanzamiento > 2022){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Pelicula clasica ");
        }


//        if(incluidoEnElPlan ||  tipoPlan.equals("plus" )){  con O se cumple con uno de los dos
        if(incluidoEnElPlan &&  tipoPlan.equals("plus" )){// con y  se cumple con los dos estrictamente

        System.out.println( "disfrute de la pelicula");
        }else{
            System.out.println("la pelicula no se encuentra en el plan de pobres ");
        }
    }
}
