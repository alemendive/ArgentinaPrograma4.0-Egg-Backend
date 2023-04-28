package Entidad;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantidadHoraPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String [] alumnos;

    public Curso() {
        alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHoraPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoraPorDia = cantidadHoraPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoraPorDia() {
        return cantidadHoraPorDia;
    }

    public void setCantidadHoraPorDia(int cantidadHoraPorDia) {
        this.cantidadHoraPorDia = cantidadHoraPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return  " Nombre del Curso='" + nombreCurso + '\'' +
                ", Cantidad de horas por dia= " + cantidadHoraPorDia +
                ", Cantidad de dias por semana= " + cantidadDiasPorSemana +
                ", turno= " + turno + '\'' +
                ", Precio por hora= " + precioPorHora +
                ", Alumnos= " + Arrays.toString(alumnos);
    }
}
