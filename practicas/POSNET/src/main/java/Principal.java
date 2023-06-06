public class Principal {
    public static void main(String[] args) {

        Posnet posnet = new Posnet();
        Persona p = new Persona("33445546","Juan","Perez", "1124567854", "juanperez@fakemail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("BBVA","111456574563", 15000, EntidadFinanciera.VISA, p);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);

    }
}
