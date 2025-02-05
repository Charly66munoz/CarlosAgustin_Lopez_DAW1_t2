package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cv;
    private double  cc ,velocidad, km;

    public Coche(){

    }

    public Coche (String marca, String modelo, String matricula, int cv, double cc, double velocidad, double km){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.km = km;
    }

    public void mostrarValores() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("KM: " + km);
    }
    //especiales


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }

    public double getCc() {
        return cc;
    }
    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }
}

