package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, velocidad, km, cc, aceleracion;


    public Coche(){

    }

    public Coche (String marca, String modelo, String matricula, int cv, int cc, int velocidad, int km, int aceleracion){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.km = km;
        this.aceleracion = aceleracion;
        // 1km == 1000
    }


    //especiales
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void mostrarValores() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
    }


    public int acelerar(){
        return acelerar();
    }

    public int acelerar (int aceleracion, int vuelta, int totalVueltas ) {

        velocidad = km*2;


        if (vuelta <= 0) {
            System.out.println("km totales: " + km); //vueltas

            return 0;
        }else {

            if (cv >= 105) {
                velocidad += velocidad + (int) (Math.random() * aceleracion) + 10;
            }else {
                velocidad += velocidad + (int) (Math.random() * aceleracion) ;

                if (velocidad < 10) {
                    velocidad += 10;
                }
            }

            if (velocidad > 253) {
                velocidad = 253;

            }
            km += velocidad  / 2;

            System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );
            System.out.println("Los km han sumado: " + km);
            System.out.println(" ");
            return km;
        }
    }

}

