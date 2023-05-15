import java.util.Scanner;

public class AreaCalculatorPOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = input.nextInt();

        Estudiante[] estudiantes = new Estudiante[numEstudiantes];
        double[][] areas = new double[numEstudiantes][4];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = input.next();
            estudiantes[i] = new Estudiante(nombre);

            double[] circulo = new double[1];
            double[] triangulo = new double[2];
            double[] cuadrado = new double[1];
            double[] rectangulo = new double[2];

            System.out.println("Ingrese el radio del círculo: ");
            circulo[0] = input.nextDouble();
            areas[i][0] = Math.PI * circulo[0] * circulo[0];

            System.out.println("Ingrese la base y la altura del triángulo (separados por un espacio): ");
            triangulo[0] = input.nextDouble();
            triangulo[1] = input.nextDouble();
            areas[i][1] = triangulo[0] * triangulo[1] / 2;

            System.out.println("Ingrese el lado del cuadrado: ");
            cuadrado[0] = input.nextDouble();
            areas[i][2] = cuadrado[0] * cuadrado[0];

            System.out.println("Ingrese la base y la altura del rectángulo (separados por un espacio): ");
            rectangulo[0] = input.nextDouble();
            rectangulo[1] = input.nextDouble();
            areas[i][3] = rectangulo[0] * rectangulo[1];
        }

        System.out.println("Resultados:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Nombre estudiante: " + estudiantes[i].nombre);
            System.out.println("Figuras elegidas: ");
            System.out.println("Círculo: área = " + areas[i][0]);
            System.out.println("Triángulo: área = " + areas[i][1]);
            System.out.println("Cuadrado: área = " + areas[i][2]);
            System.out.println("Rectángulo: área = " + areas[i][3]);
            System.out.println();
        }
    }
}

class Estudiante {
    String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
}
