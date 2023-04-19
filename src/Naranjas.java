import java.util.ArrayList;

public class Naranjas extends Frutas {
    private static int cod = 100;
    static ArrayList<Naranjas> naranjasLista = new ArrayList<>();

    String variedad;

    private Naranjas(String volumen, int codigo, String variedad) {
        super(volumen, codigo);
        this.variedad = variedad;

    }

    public static void registrarN(String volumen, String variedad) {
        cod += 1;
        var naranja = new Naranjas(volumen, cod, variedad);
        naranjasLista.add(naranja);
        // System.out.println("Naranja Registrada");

    }

    public static void mostrarN(){
        var dim = naranjasLista.size();
        System.out.println("\nNaranjas: ");
        for(int i=0; i<dim; i++){
            System.out.println("Codigo:" + naranjasLista.get(i).codigo+
            "; Tamaño: " + naranjasLista.get(i).volumen + 
            "; Variedad: " + naranjasLista.get(i).variedad);
        }
    }

}
