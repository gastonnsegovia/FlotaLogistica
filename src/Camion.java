public class Camion extends Vehiculo{
    // atributos propios de la clase
    private double capacidadToneladas;

    //metodos
    //constructor
    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = (capacidadToneladas < 0) ? capacidadToneladas = 0 : capacidadToneladas;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * (1 + capacidadToneladas * 0.05);
    }
}
