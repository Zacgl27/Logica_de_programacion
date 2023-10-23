package principios_poo;

public class TestCasa {

    public static void main(String[] args) {

        Padre papa1 = new Padre("Perez");

        Casa casa = new Casa();

        casa.setDirCasa("Calle 54 # 49 2");

        papa1.dir = casa;

        System.out.println(papa1.dir.getDirCasa());

    }

}
