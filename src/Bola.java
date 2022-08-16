public class Bola {
    private String cor;

    public Bola(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public static void main(String[] args) {
        Bola bola1 = new Bola("Verde");
        bola1.setCor("Preto");
        System.out.println("A cor esta como " + bola1.getCor());
    }

}
