public class Sala {

    private int numero;

    private String tituloPelicula;

    private Espectador[][] butacas;

    public Sala(int numero, String tituloPelicula, Espectador[][] butacas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        this .butacas = new Espectador[filas][columnas];
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int[][] getButacas() {
        return butacas;
    }

    public void setButacas(int[][] butacas) {
        this.butacas = butacas;
    }


    


}
