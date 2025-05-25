import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        System.out.println("\nNombre y Género de las personas:");
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " - " + p.getGenero());
        }

        double promedio = calcularPromedioEdad(personas);
        System.out.println("\nPromedio de edad: " + promedio);

        int masculinos = contarGenero(personas, "Masculino");
        int femeninos = contarGenero(personas, "Femenino");

        System.out.println("Cantidad de personas Masculinas: " + masculinos);
        System.out.println("Cantidad de personas Femeninas: " + femeninos);
    }

    public static double calcularPromedioEdad(Persona[] personas) {
        int suma = 0;
        for (Persona p : personas) {
            suma += p.getEdad();
        }
        return (double) suma / personas.length;
    }

    public static int contarGenero(Persona[] personas, String genero) {
        int contador = 0;
        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }
}

