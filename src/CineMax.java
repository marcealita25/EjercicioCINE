
/*Clase con main
- Crear Cine con 3 salas
- Crear 3 espectadores
- por cada espectador preguntarle 
    + que pelicula quiere ver
    + cuantas entradas quiere
+ de la pelicula seleccionada mostrarle los asientos libres
         O O O   
         O O O    
         X X X


+ que pueda elegir fila y asientos o solo fila
+ Cuando todos los espectadores hayan comprado la entrada mostrar un resumen por cada sala del cine*/

import java.util.Scanner;

public class CineMax {

    public static void main(String[] args) {



        Espectador [][] butacasSala1;
        
        Sala sala1 = new Sala(1, "tiburon", null);
        Sala sala2 = new Sala(2, "101 Dalmatas", null);
        Sala sala3 = new Sala(3, "Srek", null);
        Sala[] salas ={sala1, sala2, sala3};
        
        
        private void crearCine(){
            
        }

        Cine cine = new Cine("Cine ejemplo", salas);
        Espectador  espectador1 = new Espectador("Daniel", "12345678R");
        Espectador  espectador2 = new Espectador("Manuel", "23456781H");
        Espectador  espectador3 = new Espectador("Maria", "45678921T");

        Espectador [] espectador = {espectador1, espectador2, espectador3};


        for (Espectador espectadores : espectador) {

            System.out.println(espectadores.getNombre());

            System.out.println(espectadores.getDni());

            System.out.println("que pelicula quiere ver");

            

            Scanner scan = new Scanner(System.in);

            String opcionPelicula = scan.nextLine();

            System.out.println("El espectador "+espectadores.getNombre()+" ELIGIO LA PELICULA "+ opcionPelicula);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Cuantas entradas quieres");

            int entradas =  scanner.nextInt();
            



            System.out.println("-----------------------------");

        }

        private  void arrancarCine(){

            Espectador [][] butacasSala1;
        
        Sala sala1 = new Sala(1, "tiburon", null);
        Sala sala2 = new Sala(2, "101 Dalmatas", null);
        Sala sala3 = new Sala(3, "Srek", null);
        Sala[] salas ={sala1, sala2, sala3};

        private void arrancarCine(){
            Cine cine = crearCine();
            Espectador[] espectadores = creaEspectadores();
            gestionEntradas(Cine, espectadores);



        }


        }

        private void gestionEntradas(Cine cine, Espectador[] espectador){
            //recorrer los espectadores
            for (Espectador espectador : espectadores) {
                System.out.println();
                System.out.println("El espectador"+espectador.getNombre() +"esta comprando entradas");

                
            }


        }
            

       

        private void mostrarCartelera (Cine cine){
           sala [] salas = cine.getSalas();
           for (Sala sala : salas) {
            System.out.println(sala);
            
           }





        }

        private void mostrarbutacas(Sala sala){

            Espectador[][] butacas = sala.getButacas();
            for (int i = 0; i< butacas.length; i++);
                for (int j = 0; j< butacas[j].length; j++);
                System.out.println("\t");






        }

    }

    @Override
    public String toString() {
        return "CineMax []";
    }   








}
