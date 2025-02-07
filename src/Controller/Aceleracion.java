package Controller;

import model.Coche;

public class Aceleracion {

    private Coche velocidadMetodo = new Coche();
    int velocidad = velocidadMetodo.getVelocidad();
    int km, cv;

    public int acelerar (int aceleracion, int vueltas) {
        /*if (velocidad != 0) {
            velocidad = km-km/3;
            System.out.println("primera La velocidad del coche en carrera sera de: " + velocidad);
            System.out.println("primera Los km del coche en carrera sera de: " + km);
        }*/

        velocidad = km-km/3;


        if (vueltas <= 0) {
            System.out.println("km totales: " + km); //vueltas

            return km;
        }else {
            System.out.println("vuelta: " + vueltas); //vueltas
            if (cv >= 105) {
                velocidad += velocidad + (int) (Math.random() * aceleracion) + 10;
                if (velocidad > 253) {
                    velocidad = 253;
                    km = velocidad + velocidad / 2;
                    System.out.println("La velocidad del coche en carrera sera de: " + velocidad );
                    System.out.println("Los km del coche en carrera sera de: " + km);
                    return km + acelerar(velocidad, vueltas - 1);
                } else {

                    km = velocidad + velocidad / 2;
                    System.out.println("La velocidad del coche en carrera sera de: " + velocidad );

                    System.out.println("Los km del coche en carrera sera de: " + km);
                    return km + acelerar(velocidad, vueltas - 1);
                }
            } else {
                velocidad += velocidad + (int) (Math.random() * aceleracion);
                if (velocidad >= 253) {
                    velocidad = 253;
                    km = velocidad + velocidad / 2;
                    System.out.println("La velocidad del coche en carrera sera de: " + velocidad );

                    System.out.println("Los km del coche en carrera sera de: " + km);
                    return km + acelerar(velocidad, vueltas - 1);
                }
                if (velocidad < 10) {
                    velocidad += 10;
                    km = velocidad + velocidad / 2;
                    System.out.println("La velocidad del coche en carrera sera de: " + velocidad );

                    System.out.println("Los km del coche en carrera sera de: " + km);
                    return km + acelerar(velocidad, vueltas - 1);
                }
                km = velocidad + velocidad / 2;
                System.out.println("La velocidad del coche en carrera sera de: " + velocidad );

                System.out.println("Los km del coche en carrera sera de: " + km);
                return km + acelerar(velocidad, vueltas - 1);
            }
        }

    }

}
