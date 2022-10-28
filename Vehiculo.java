public class Vehiculo {
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo() {
        Vehiculo.vehiculos[Vehiculo.posAnadir] = this;
        Vehiculo.posAnadir++;
    }

    public Vehiculo(int modelo, String marca, double valorComercial, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = color;
        Vehiculo.vehiculos[Vehiculo.posAnadir] = this;
        Vehiculo.posAnadir++;
    }

    public Vehiculo(int modelo, String marca, double valorComercial) {
        this(modelo, marca, valorComercial, "verde");
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " Marca: " + marca + " Valor comercial: " + valorComercial + " color: " + color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String toStringVehiculos() {
        String infoVehiculo = "";
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                infoVehiculo = infoVehiculo.concat(vehiculo.toString());
                infoVehiculo = infoVehiculo.concat("\n");
            }
        }
        return infoVehiculo;
    }

    public static int cantidadVehiculos() {
        return posAnadir;
    }

    public static String toStringVehiculos(String color) {
        String infoVehiculo = "";
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo != null && vehiculo.color.equalsIgnoreCase(color)) {
                infoVehiculo = infoVehiculo.concat(vehiculo.toString());
                infoVehiculo = infoVehiculo.concat("\n");
            }
        }
        return infoVehiculo;
    }

    public static String toStringVehiculos(int limiteInferior, int limiteSuperior) {
        String infoVehiculo = "";
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo != null && vehiculo.modelo >= limiteInferior && vehiculo.modelo <= limiteSuperior) {
                infoVehiculo = infoVehiculo.concat(vehiculo.toString());
                infoVehiculo = infoVehiculo.concat("\n");
            }
        }
        return infoVehiculo;
    }
}
