package Robots;

public class Torneo {
    static void main(String[] args) {
        Robot robot1=new Robot("mazinger","cupra");
        Robot robot2=new Robot("Optimus","ford");
        robot1.mostrarEstadistica();
        robot2.mostrarEstadistica();

        while (robot1.estaVivo() && robot2.estaVivo()){
            robot1.atacar(robot2);
            robot2.atacar(robot1);
            System.out.println("Vida de " + robot1.getNombre() + ": " + robot1.getVida());
            System.out.println("Vida de " + robot2.getNombre() + ": " + robot2.getVida());
        }

        if (robot1.getVida()<=0){
            System.out.println("Ganador: " + robot2.getNombre());
        }else{
            System.out.println("Ganador: " + robot1.getNombre());
        }
    }
}