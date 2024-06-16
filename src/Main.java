import com.saxyz.moviexyz.modelos.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Star Wars", 2017, 140, true);

        pelicula1.agregarCalificacion(7.7);
        pelicula1.agregarCalificacion(6.0);
        System.out.println(pelicula1.getCantidadCalificaciones());
        System.out.println(pelicula1.calcularPromedio());

    }
}
