package AvilaExpress;

public class ControldorFlota {

    public static void main(String[] args) {

        NaveEspacial[] nave = new NaveEspacial[3];
        nave[0] = new NaveEspacial("Winset35", 150);
        nave[1] = new NaveEspacial("Cacastrafa-67", 2);
        nave[2] = new NaveEspacial("Alpargatas 2.0", 1000);

        nave[0].viajar(30);
        nave[1].viajar(60);

        for (NaveEspacial naveEspacial : nave) {
            naveEspacial.mostrarEstado();

        }

        nave[0].repostar();

        int combustible1=nave[0].getCombustible();
        int combustible2=nave[1].getCombustible();
        int combustible3=nave[2].getCombustible();

        int mayor;
        if (combustible1>combustible2 & combustible1>combustible3){
            mayor=0;
        } else if (combustible2>combustible1 & combustible2>combustible3) {
            mayor=1;
        }else {
            mayor=2;
        }
        System.out.println("La nave con mas combustible es: ");
        nave[mayor].mostrarEstado();

    }

}
