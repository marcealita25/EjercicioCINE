public class Sala {

    private int numero;

    private String tituloPelicula;

    private Espectador[][] butacas;

    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
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

    public Espectador[][] getButacas() {
        return butacas;
    }

    public void setButacas(Espectador[][] butacas) {
        this.butacas = butacas;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala ");
        sb.append("").append(numero);
        sb.append(", tituloPelicula=").append(tituloPelicula);
        sb.append("");
        return sb.toString();
    }


}
