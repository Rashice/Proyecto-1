import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        Scanner lector = new Scanner(System.in);
        while (true) {
            System.out.println("Por favor ingrese un numero");
            System.out.println("Ingresa 0 para detener el programa");
            System.out.println("Ingresa 1 para crear un vehiculo");
            System.out.println("Ingresa 2 para ver la lista de todos los vehiculos creados");
            System.out.println("Ingresa 3 para ver la cantidad de vehiculos creados");
            System.out.println("Ingresa 4 para ver la lista de todos los vehiculos de color verde");
            System.out.println("Ingresa 5 para ver la lista de todos los vehiculos con modelo entre 2000 y 2021");
            System.out.println("Ingresa 6 para crear un sensor");
            System.out.println("Ingresa 7 para ver la lista de todos los sensores creados");
            System.out.println("Ingresa 8 para ver la cantidad de sensores creados");
            System.out.println("Ingresa 9 para ver la lista de sensores creados de tipo temperatura");
            System.out.println("Ingresa 666 para ver la lista de sensores creados de tipo temperatura en orden de valor");
            int instruccion = lector.nextInt();
            lector.nextLine();
            if(instruccion == 0) break;
            else if (instruccion == 1) agregarVehiculo(lector);
            else if (instruccion == 2) System.out.println(Vehiculo.toStringVehiculos());
            else if (instruccion == 3) System.out.println("Cantidad de vehiculos creados:" + Vehiculo.cantidadVehiculos());
            else if (instruccion == 4) System.out.println(Vehiculo.toStringVehiculos("verde"));
            else if (instruccion == 5) System.out.println(Vehiculo.toStringVehiculos(2000, 2021));
            else if (instruccion == 6) agregarSensor(lector);
            else if (instruccion == 7) System.out.println(Sensor.toStringSensores());
            else if (instruccion == 8) System.out.println("Cantidad de sensores creados:" + Sensor.cantidadSensores());
            else if (instruccion == 9) System.out.println(Sensor.toStringSensores("temperatura", Sensor.sensores));
            else if (instruccion == 666) System.out.println(Sensor.toStringSensoresOrdenado("temperatura"));
            else System.out.println("Ingresa un numero correcto");
        }
    }

    public static void agregarSensor(Scanner lector) {
        if (Sensor.posAnadir < Sensor.tamano) {
            System.out.println("Ingrese el tipo del sensor: ");
            String tipo = lector.nextLine();
            System.out.println("Ingrese el valor del sensor: ");
            double valor = lector.nextDouble();
            lector.nextLine();
            new Sensor(tipo, valor);
        }else {
            System.out.println("Error base de datos llena");
        }
    }

    public static void agregarVehiculo(Scanner lector) {
        if (Vehiculo.posAnadir < Vehiculo.tamano) {
            System.out.println("Ingrese el modelo del vehiculo: ");
            int modelo = lector.nextInt();
            lector.nextLine();
            System.out.println("Ingrese la marca del vehiculo: ");
            String marca = lector.nextLine();
            System.out.println("Ingrese el valor comercial del vehiculo: ");
            double valor = lector.nextDouble();
            lector.nextLine();
            System.out.println("Ingrese el color del vehiculo: ");
            String color = lector.nextLine();
            new Vehiculo(modelo, marca, valor, color);
        }else {
            System.out.println("Error base de datos llena");
        }
    }
}
