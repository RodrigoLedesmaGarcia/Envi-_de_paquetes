package LedesmaGarciaRodrigo_EnvioPaquetes;

// Rodrigo Ledesma Garcia. https://rodrigoledesmagarcia.com.mx/

public class Paquetes {
    private int numeropaquete;
    private String id;
    private double peso;
    private int prioridad;

    public Paquetes() {
    }

    public Paquetes(int numeropaquete, String id, double peso, int prioridad) {
        this.numeropaquete = numeropaquete;
        this.id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeropaquete() {
        return numeropaquete;
    }

    public void setNumeropaquete(int numeropaquete) {
        this.numeropaquete = numeropaquete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String mostarDatosPaquete() {
        return "------------------- INFORMACION DEL PAQUETE -------------------"+
                "\nNumero del paqute: "+numeropaquete+
                "\nId del paquete: "+id+
                "\nPeso del paquete: "+peso+
                "\nPrioridad: "+prioridad+
                "\n ";
    }
}
