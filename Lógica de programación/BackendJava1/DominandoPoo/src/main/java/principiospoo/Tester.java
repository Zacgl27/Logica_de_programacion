package principiospoo;

public class Tester {

    public static void main(String[] args) {

        Padre padre = new Padre();

        String nombrePadreQueMandaDato = "Juan";

        padre.setNombrePadre(nombrePadreQueMandaDato);

        System.out.println(padre.getNombrePadre());

    }

}
