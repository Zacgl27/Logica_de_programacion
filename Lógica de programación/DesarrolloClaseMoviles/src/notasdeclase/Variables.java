package notasdeclase;

public class Variables {

    public static void main(String[] args) {

        // Tipos de datos: String, float, char, byte, boolean, int, double.
        //Las variables se declaran y se inicializan
        String nombre; //Declarar una variable
        nombre = "Zac"; //Inicializar una variable

        int id = 1025643138; //Declarar e inicializar una variable

        //Scope o ambito de las variables corresponde a si esta puede ser alcanzada por todas las estructuras que componen la clase o
        // si solo funciona para una estructura determinada

        String global = "Soy global";

        if(global.equals("Soy global")){
            System.out.println("Es una variable global");

            String local = "Pero yo no";

            System.out.println(local);
        }else{
            System.out.println("No es global");
        }

        //Las variables del mismo tipo se pueden castear sin perdida de informacion
        //las que son de dsitinto tipo, hay perdida de info

        byte numByte = 120;
        short numShort = (short)numByte;

        System.out.println(numShort);

        //Parseo se da entre strings y datos numericos

        String numDouble = "4.56";
        double numDecimal = Double.parseDouble(numDouble);

        System.out.println(numDecimal);

    }

}
