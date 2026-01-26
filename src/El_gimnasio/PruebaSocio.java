package El_gimnasio;

public class PruebaSocio {

    public static void main(String[] args) {

        Socio s1 = new Socio("Ana");
        Socio s2 = new Socio("Luis");
        Socio s3 = new Socio("Marta");

        s1.Id();
        s2.Id();
        s3.Id();
        s1.Id();

        Socio.TotalSocios();

    }

}
