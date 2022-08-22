import java.util.ArrayList;
import java.util.List;

public class MacacoPrime {
    private String nome;
    private List<String> estomago;

    public MacacoPrime(String nome){
        this.nome = nome;
        estomago = new ArrayList<String>();
    }

    public void comer(String comida){
        estomago.add(comida);
    }

    public void digerir(){
        estomago.remove(0);
    }

    public void verEstomago(){
        System.out.println(estomago.toString());
    }

    public static void main(String[] args) {
        MacacoPrime grood = new MacacoPrime("Grood");

        System.out.println("\nO ESTOMAGO TA COM...");
        grood.comer("Banana");
        grood.verEstomago();
        grood.comer("Lapis");
        grood.verEstomago();
        grood.comer("Maca");
        grood.verEstomago();
        grood.comer("Borracha");
        grood.verEstomago();
        grood.comer("Pedra");
        grood.verEstomago();

        System.out.println("\nDIGERINDO AGORA...");
        grood.digerir();
        grood.verEstomago();
        grood.digerir();
        grood.verEstomago();
        grood.digerir();
        grood.verEstomago();
        grood.digerir();
        grood.verEstomago();
        grood.digerir();
        grood.verEstomago();
    }
}
