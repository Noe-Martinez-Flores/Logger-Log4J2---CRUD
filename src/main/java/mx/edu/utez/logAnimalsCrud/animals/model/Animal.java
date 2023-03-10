package mx.edu.utez.logAnimalsCrud.animals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")

public class Animal {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private String nombre;
    private String nombreCientifico ;
    private String habitad;
    private String especie;
    private Double peso;
    private String dieta;
    private int peligroExtincion;

    public Animal() {
    }

    public Animal(int id, String nombre, String nombreCientifico, String habitad, String especie, Double peso, String dieta, int peligroExtincion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.habitad = habitad;
        this.especie = especie;
        this.peso = peso;
        this.dieta = dieta;
        this.peligroExtincion = peligroExtincion;
    }

    public Animal(String nombre, String nombreCientifico, String habitad, String especie, Double peso, String dieta, int peligroExtincion) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.habitad = habitad;
        this.especie = especie;
        this.peso = peso;
        this.dieta = dieta;
        this.peligroExtincion = peligroExtincion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getPeligroExtincion() {
        return peligroExtincion;
    }

    public void setPeligroExtincion(int peligroExtincion) {
        this.peligroExtincion = peligroExtincion;
    }


    @Override
    public String toString() {
        return "modelAnimales{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", habitad='" + habitad + '\'' +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", dieta='" + dieta + '\'' +
                ", peligroExtincion=" + peligroExtincion +
                '}';
    }
}






