package PooNivel1.Pratica;

public class MotocicletaAVenda extends VeiculoAVenda{
    protected String Motocicleta;


    public MotocicletaAVenda(String tipo, String ano, Double preçoDeVenda, String Motocicleta) {
        super(tipo, ano, preçoDeVenda);
        this.Motocicleta = Motocicleta;
    }

    public String getMotocicleta() {
        return "\nAutomovel: "+Motocicleta;
    }

    public void setMotocicleta(String motocicleta) {
        Motocicleta = motocicleta;
    }
}
