public class Furgoneta extends Vehiculo{
    // atributos propios de la clase
    private boolean tieneRefrigeracion;

    //metodos
    //constructor
    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (tieneRefrigeracion) ? (distanciaKm * costoBaseKm) + 5000.0 : distanciaKm * costoBaseKm;
    }
}
