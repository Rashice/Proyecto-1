public class Sensor {
    public static int tamano = 8;
    public static Sensor[] sensores = new Sensor[tamano];
    public static int posAnadir = 0;

    private String tipo;
    private double valor;

    public Sensor(){
        Sensor.sensores[Sensor.posAnadir] = this;
        Sensor.posAnadir++;
    }
    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        Sensor.sensores[Sensor.posAnadir] = this;
        Sensor.posAnadir++;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Tipo: " + tipo + " Valor: " + valor;
    }

    public static String toStringSensores(){
        String infoSensor = "";
        for (Sensor sensor : sensores) {
            if (sensor != null) {
                infoSensor = infoSensor.concat(sensor.toString());
                infoSensor = infoSensor.concat("\n");
            }
        }
        return infoSensor;
    }
    public static String toStringSensores(String tipo, Sensor[] sensores){
        String infoSensor = "";
        for (Sensor sensor : sensores) {
            if (sensor != null && sensor.tipo.equalsIgnoreCase(tipo)) {
                infoSensor = infoSensor.concat(sensor.toString());
                infoSensor = infoSensor.concat("\n");
            }
        }
        return infoSensor;
    }
    public static String toStringSensoresOrdenado(String tipo){
        Sensor[] sensoresOrdenado = sensores.clone();
        int tallest;
        Sensor temp;
        for(int a = 0; a < posAnadir - 1; a++) {
            tallest = a;
            for(int b = a + 1; b < posAnadir; b++)
                if(sensoresOrdenado[b].getValor() < sensoresOrdenado[tallest].getValor())
                    tallest = b;
            temp = sensoresOrdenado[a];
            sensoresOrdenado[a] = sensoresOrdenado[tallest];
            sensoresOrdenado[tallest] = temp;
        }
        return toStringSensores(tipo, sensoresOrdenado);
    }
    public static int cantidadSensores(){
        return posAnadir;
    }
}
