public class CineMax {

    import java.util.Scanner;

public class CineMax {

    public static void main (String [] args) {

       CineMax cineMax = new CineMax();
       CineMax  CineMax;
    
       Cine.arrancarCine();

    }

    private Cine crearCine(){

        Sala sala1 = new Sala(1, "tiburon", 1,2);
        Sala sala2 = new Sala(2, "SREK",3, 2 );
        Sala sala3 = new Sala(3, "101 Dalmatas", 4, 4);
        Sala[] salas = {sala1, sala2, sala3};
        Cine cine = new Cine("Cine Ejemplo", salas);
        return cine;
    }
        
        
        
    private Espectador [] crearEspectadores(){

        Espectador  espectador1 = new Espectador("Daniel", "12345678R");
        Espectador  espectador2 = new Espectador("Manuel", "23456781H");
        Espectador  espectador3 = new Espectador("Maria", "45678921T");
        Espectador [] espectadores = {espectador1, espectador2, espectador3};
    
        return espectadores;

    }
    private void arrancarCine(){

        Cine cine = crearCine();
        Espectador[] espectadores = crearEspectadores();
        gestionEntradas(cine, espectadores);

    }

    private void gestionEntradas(Cine cine, Espectador[] espectadores){
        //recorrer los espectadores
        for (Espectador espectador : espectadores) {
            System.out.println("\nEl espectador" + espectador.getNombre() + "está comprando entradas");
            mostrarCartelera(cine);
            int numSala = Utilidades.pideDatoNumerico("Introduce el numero de la sala");
            int numEntradas = Utilidades.pideDatoNumerico(espectador.getNombre() + "que fila quieres");
            Sala salaSeleccionada = cine.getSalas()[numSala-1];
            mostrarbutacas(salaSeleccionada);
             reservarButacas(salaSeleccionada.getButacas());
        
            
         


        }
    }      

    private void reservaButacas(Espectador[][] butacas, Espectador espectador){

            
        int numEntradas = Utilidades.pideDatoNumerico(espectador.getNombre() + "¿Cuantas entradas quieres");
        int fila = Utilidades.pideDatoNumerico(espectador.getNombre() + "Introduce la fila");
        int columna = Utilidades.pideDatoNumerico(espectador.getNombre() + "introduce columna");

        butacas[fila-1][columna-1] = espectador;

        /* int  numeros [][] =new int [2][2];
      numeros [0][1] = 4;*/

    

    }   
    private void mostrarCartelera (Cine cine){

        Sala [] salas = cine.getSalas();
        for (Sala sala : salas) {
         System.out.println(sala);
                 
        }

    }
    
    private void mostrarbutacas(Sala sala ){

        Espectador[][] butacas = sala.getButacas();
        for (int i = 0; i< butacas.length; i++);{

            for (int j = 0; j< butacas[j].length; j++);
            if(butacas [][] == null){
                System.out.println("\t");{
             }else{
                System.out.println("\tx");

            System.out.println("");
        }      



    }
     
        
}        
     
             
     

}
