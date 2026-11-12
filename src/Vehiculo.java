public class Vehiculo {
    //Atributos
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    //Metodos
    //Constructor

    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = (patente == null || patente.isBlank()) ? patente = "000000" : patente;
        this.marca = (marca == null || marca.isBlank()) ? marca = "Sin marca" : marca;
        this.costoBaseKm = (costoBaseKm < 0) ? costoBaseKm = 0 : costoBaseKm;
    }
    public double calcularCostoViaje (double distanciaKm){
        return distanciaKm * costoBaseKm;
    }
    public double calcularCostoViaje (double distanciaKm, double peajes){
        return peajes + (distanciaKm * costoBaseKm);
    }
    public void mostrarFicha (){
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Costo base por km: " + costoBaseKm);
    }
}
