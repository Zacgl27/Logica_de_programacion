package gestor;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        Registro registro = new Registro();

        registro.perfil = new Usuario();

        registro.perfil.printData();

        registro.registerData();

    }

}
