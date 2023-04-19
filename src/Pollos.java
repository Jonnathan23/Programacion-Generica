import java.util.ArrayList;

public class Pollos {
    private static int cod = 300;
    static ArrayList<Pollos> pollosLista = new ArrayList<>();

    double peso;
    int codigo;

    private Pollos(double peso, int codigo){
        this.peso = peso;
        this.codigo = codigo;
    }

    public static void registrarP(double peso) {
        cod += 1;
        var pollo = new Pollos(peso, cod);
        pollosLista.add(pollo);
        // System.out.println("Naranja Registrada");

    }

    public static void mostrarP(){
        var dim = pollosLista.size();
        System.out.println("\nPollos: ");
        for(int i=0; i<dim; i++){

            System.out.println("Codigo:" + pollosLista.get(i).codigo+
            "; Peso: " + pollosLista.get(i).peso +" Kg");
            
        }
    }


}
