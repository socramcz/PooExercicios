package PooNivel1.Pratica;

public class VeiculoAVenda {
    protected String tipo, ano;
    protected Double preçoDeVenda;

    public VeiculoAVenda(String tipo, String ano, Double preçoDeVenda) {
        this.tipo = tipo;
        this.ano = ano;
        this.preçoDeVenda = preçoDeVenda;
    }

    public String getTipo() {
        return "\nTipo do veiculo: "+tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAno() {
        return "Ano do Veiculo: "+ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getPreçoDeVenda() {
        return preçoDeVenda;
    }

    public void setPreçoDeVenda(Double preçoDeVenda) {
        this.preçoDeVenda = preçoDeVenda;
    }
}
