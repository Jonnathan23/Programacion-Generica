import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        var opcion = 0;
        Map<Integer, String> variedades = new HashMap<>(); // * { Arreglo asociativo
        variedades.put(1, "Navel");
        variedades.put(2, "Tarocco");
        variedades.put(3, "Sanguinello");
        variedades.put(4, "Moro");                          //* }

        var menu = "1._ Registrar Mandarina\n" +
                "2._ Registrar Naranja\n" +
                "3._ Registar Pollos\n" +
                "4._ Calcular";

        System.out.println("\n    --- BIENVENIDO ---  \n¿Qué desea hacer?");
        System.out.println(menu);

        // Registro de mandarinas
        Mandarinas.registrarM("Grande", 78);
        Mandarinas.registrarM("Pequeña", 34);
        Mandarinas.registrarM("Mediana", 66);
        Mandarinas.registrarM("Extra Grande", 93);

        Mandarinas.mostrarM();

        // Registro de naranjas
        System.out.println("\nRegistrar naranjas segun las variedades");
        for (int x = 1; x < 5; x++) {
            System.out.println(x + "._ " + variedades.get(x));
        }
        System.out.println("Escoja la variedad");
        opcion = entrada.nextInt();
        Naranjas.registrarN("Grande", variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN("Pequeña", variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN("Mediana", variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN("Extra Grande", variedades.get(opcion));

        Naranjas.mostrarN();
        System.out.println(" ");

        // Registro de pollos

    }

}
