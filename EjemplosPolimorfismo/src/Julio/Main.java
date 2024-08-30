package Julio;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de ProcesadorDePagos
        ProcesadorDePago procesador = new ProcesadorDePago();

        // Pagos de diferentes tipos
        Pago pagoConTarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/25", "123");
        Pago pagoConPayPal = new PayPal("usuario@correo.com");

        // Procesamos los pagos
        procesador.procesar(pagoConTarjeta); // Se realiza el downcasting a TarjetaDeCredito
        procesador.procesar(pagoConPayPal);  // Se realiza el downcasting a PayPal
    }


}