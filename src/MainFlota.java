public class MainFlota {
    public static void main(String[] args) {
        double acumuladorCostos = 0.0;
        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = new Camion("ABC123", "Volvo", 150.0, 18.0);
        flota[1] = new Furgoneta("DEF456", "Mercedes", 150.0, true);
        flota[2] = new MotoEnvios("GHI789", "Honda", 150.0);

        System.out.println("--- FICHA DE VEHICULOS ---");
        for (Vehiculo v : flota) {
            v.mostrarFicha();
            System.out.println("Costo viaje 150 km: " + v.calcularCostoViaje(150.0));
            System.out.println();
            acumuladorCostos += v.calcularCostoViaje(150.0);
        }
        System.out.println("Costo total de la flota para 150 km: " + acumuladorCostos);
    }
}
