package com.saxyz.moviexyz.modelos;

public class Pelicula {
    private String titulo;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaCalificaciones;
    private int cantidadCalificaciones;

    public void agregarCalificacion(double calificacion){
        if (calificacion > 0 && calificacion < 10) {
            sumaCalificaciones += calificacion;
            cantidadCalificaciones++;
        }
    }

    public double calcularPromedio(){
        return sumaCalificaciones / cantidadCalificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public double getSumaCalificaciones() {
        return sumaCalificaciones;
    }

    public int getCantidadCalificaciones() {
        return cantidadCalificaciones;
    }

    @Override
    public String toString() {
        return "---------------- \n" +
                "com.saxyz.moviexyz.modelos.Pelicula \n" +
                "Titulo = '" + titulo + '\'' +
                ", Fecha de lanzamiento = " + fechaLanzamiento +
                ", Duracion en minutos = " + duracionMinutos +
                ", Incluido en el plan = " + incluidoEnPlan +
                "\n----------------";
    }

    public Pelicula(String titulo, int fechaLanzamiento, int duracionMinutos, boolean incluidoEnPlan) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracionMinutos = duracionMinutos;
        this.incluidoEnPlan = incluidoEnPlan;
    }
}
