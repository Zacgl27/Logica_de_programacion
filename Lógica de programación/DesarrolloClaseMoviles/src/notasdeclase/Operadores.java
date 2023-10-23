package notasdeclase;

public class Operadores {

    public static void main(String[] args) {

        //Podemos hacer operaciones entre variables y dentro de la variable

        int sumaInterna = 4 + 5;
        int operacion = (4 + 3 * 5)*(10-2/2)/4+3;

        System.out.println(sumaInterna);
        System.out.println(operacion);

        boolean compNum = 4>5;
        boolean comComp = 3>2 || 4!=5;

        int edad = 18;
        //edad = edad + 1;
        edad+=1;

        System.out.println(compNum);
        System.out.println(comComp);

    }

}
