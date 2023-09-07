package LedesmaGarciaRodrigo_EnvioPaquetes;

// Rodrigo Ledesma Garcia. https://rodrigoledesmagarcia.com.mx/

public class Sucursal {
    private int numerosucursal;
    private String direccion;
    private String ciudad;



    public Sucursal(int numerosucursal, String direccion, String ciudad) {
        this.numerosucursal = numerosucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumerosucursal() {
        return numerosucursal;
    }

    public void setNumerosucursal(int numerosucursal) {
        this.numerosucursal = numerosucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double calcularPrecio(Paquetes p) {
        double precio;
        precio = p.getPeso();
        if (p.getPrioridad() == 1){
            precio += 10;
        }if (p.getPrioridad()==2){
            precio+= 20;

        }
        return  precio;
    }

    public String verDatosSucursal() {
        return "------------------- INFORMACION DE LA SUCURSAL -------------------"+
                "\nNumero de la sucursal: "+numerosucursal+
                "\nDireccion de la sucursal: "+direccion+
                "\nCiudad de la sucursal: "+ciudad+
                "\n ";
    }
}
