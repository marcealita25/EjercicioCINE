
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

public class CineMax {


    public static void main(String[] args) {
        
        Sala sala1 = new Sala(1, "tiburon", null);
        Sala sala2 = new Sala(2, "101 Dalmatas", null);
        Sala sala3 = new Sala(3, "Srek", null);

        Sala[] salas ={sala1, sala2, sala3};

        for (Sala sala : salas) {
           System.out.println(sala.getNumero());

            System.out.println(sala.getTituloPelicula());

            System.out.println("-------------------------------------");

        }

        Espectador  espectador1 = new Espectador(null, null);
        Espectador  espectador2= new Espectador(null, null);
        Espectador  espectador3= new Espectador(null, null);




    }   








}
