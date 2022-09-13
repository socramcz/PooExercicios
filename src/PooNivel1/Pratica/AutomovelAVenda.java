package PooNivel1.Pratica;

public class AutomovelAVenda extends VeiculoAVenda{
    protected String Automovel;

    public AutomovelAVenda(String tipo, String ano, Double preçoDeVenda, String Automovel) {
        super(tipo, ano, preçoDeVenda);
        this.Automovel = Automovel;
    }

    public String getAutomovel() {
        return "\nAutomovel: "+Automovel;
    }

    public void setAutomovel(String automovel) {
        Automovel = automovel;
    }
}
