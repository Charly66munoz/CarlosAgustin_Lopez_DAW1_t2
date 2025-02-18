package Controller;

import model.Coche;

public class Aceleracion {

    private Coche velocidadMetodo = new Coche();
    int velocidad = velocidadMetodo.getVelocidad();
    int km, cv;

    public int acelerar (int aceleracion, int vueltas, int totalVueltas ) {


        velocidad = km-km/3;
        int vuelta=  totalVueltas+1 -(vueltas);

        if (vueltas <= 0) {
            System.out.println("km totales: " + km); //vueltas

            return km;
        }else {
            System.out.println("vuelta: " + vuelta); //vueltas
            if (cv >= 105) {
                velocidad += velocidad + (int) (Math.random() * aceleracion) + 10;
                if (velocidad > 253) {
                    velocidad = 253;
                    km = velocidad + velocidad / 2;

                    System.out.println("La velocidad del coche en carrera en la vuelta" +vuelta+" es de: " + velocidad );

                    System.out.println("Los km en esta vuelta han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                } else {

                    km = velocidad + velocidad / 2;

                    System.out.println("La velocidad del coche en carrera en la vuelta" +vuelta+" es de: " + velocidad );

                    System.out.println("Los km en esta vuelta han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
            } else {
                velocidad += velocidad + (int) (Math.random() * aceleracion);
                if (velocidad >= 253) {
                    velocidad = 253;
                    km = velocidad + velocidad / 2;

                    System.out.println("La velocidad del coche en carrera en la vuelta" +vuelta+" es de: " + velocidad );

                    System.out.println("Los km en esta vuelta han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
                if (velocidad < 10) {
                    velocidad += 10;
                    km = velocidad + velocidad / 2;

                    System.out.println("La velocidad del coche en carrera en la vuelta" +vuelta+" es de: " + velocidad );

                    System.out.println("Los km en esta vuelta han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
                km = velocidad + velocidad / 2;

                System.out.println("La velocidad del coche en carrera en la vuelta" +vuelta+" es de: " + velocidad );
                System.out.println("Los km en esta vuelta han sumado: " + km);
                return km + acelerar(velocidad, vueltas - 1, totalVueltas);
            }
        }

    }

}
