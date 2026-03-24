package Tema5.UT5_Ejercicios10;

public class LogCamara extends Log {
    String resolucion;
    public LogCamara(int id, String ip, String loc, String res) {
        super(id, ip, loc);
        this.resolucion = res;
    }
}
