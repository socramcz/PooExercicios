public class Controle {
    private int canal;
    private int volume;

    public Controle(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }

    public int setCanal(int novoCanal){
        if (novoCanal >= 0 && novoCanal <= 100){
            this.canal = novoCanal;
        }
        return this.canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume += 1;
        }
    }

    public void diminuirVolume(){
        if (volume > 0){
                volume -=1;
        }
    }

    public static void main(String[] args) {
        Controle test1 = new Controle(12, 50);
        System.out.println("Canal => "+ test1.canal);
        System.out.println("Volume => "+ test1.volume);
        test1.aumentarVolume();
        System.out.println("\n>>> Volume aumentado para "+ test1.volume);
        test1.diminuirVolume();
        System.out.println(">>> Volume abaixado para "+ test1.volume);

        // FORMA DO "FOR" NO JAVA
        // "i++" É A MESMA COISA DE i+=1
        for (int i = 0; i< 10; i++){
            test1.aumentarVolume();
            System.out.println(">>> Volume aumentado para "+ test1.volume);
        }

        test1.diminuirVolume();
        System.out.println(">>> Volume abaixado para "+ test1.volume);
        System.out.println("\n>>> Canal trocado para "+ test1.setCanal(70));
    }
}
