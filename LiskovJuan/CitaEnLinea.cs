public class CitaEnLinea : Cita{
    public override void ConfirmarCita()
    {
        Console.WriteLine($"Cita eb libea confirmada por el cliente: {Cliente} para el servicio {Servicio} en la fecha {FechaHora}");
    }
}