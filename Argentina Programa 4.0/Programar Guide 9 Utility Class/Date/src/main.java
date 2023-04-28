import Service.FechaService;

import java.util.Date;


public class main {


    public static void main(String[] args) {
        FechaService SC = new FechaService();
        Date FechaNac = SC.fechaNacimiento();
        Date FechaAct = SC.fechaActual();
        SC.diferencia(FechaAct,FechaNac);
        SC.diferencia2(FechaAct,FechaNac);
    }
}
