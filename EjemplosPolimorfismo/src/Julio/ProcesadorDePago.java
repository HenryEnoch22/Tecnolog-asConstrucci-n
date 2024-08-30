package Julio;

public class ProcesadorDePago {

    public void procesar(Pago pago) {
        pago.procesarPago();

        // Casteo hacia abajo (Downcasting) para acceder a funcionalidades específicas
        if (pago instanceof TarjetaDeCredito) {
            TarjetaDeCredito tarjeta = (TarjetaDeCredito) pago;
            tarjeta.verificarLimiteCredito();
        } else if (pago instanceof PayPal) {
            PayPal paypal = (PayPal) pago;
            paypal.enviarRecibo();
        }
    }
}