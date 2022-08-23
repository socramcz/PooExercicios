import java.util.Scanner;

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
            System.out.println(">>> Canal alterado para o "+novoCanal+" <<<<");
        }
        return this.canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume += 1;
            System.out.println("\n>>> Volume aumentado para "+ volume);
        }
    }

    public void diminuirVolume(){
        if (volume > 0){
            volume -=1;
            System.out.println(">>> Volume abaixado para "+ volume);
        }
    }

    public static void main(String[] args) {
        Controle tv = new Controle(12, 50);
        System.out.println("Canal => "+ tv.canal);
        System.out.println("Volume => "+ tv.volume);

        Scanner test2 = new Scanner(System.in);
        System.out.println("\n=> Digite (1) para alterar o canal\n=> Digite (2) para alterar o volume");
        int askUser = test2.nextInt();

        if(askUser == 1) {
            System.out.println("\n=> Insira o novo canal: ");
            int mCanal = test2.nextInt();
            tv.setCanal(mCanal);
        }

        if(askUser == 2){
            System.out.println("\nVolume atual "+ tv.volume);
            System.out.println("=> Digite (1) para AUMENTAR o volume\n=> Digite (2) para DIMINUIR o volume");
            int mVolume = test2.nextInt();
            if(mVolume == 1){ tv.aumentarVolume();}
            if(mVolume == 2){ tv.diminuirVolume();}
            else { System.out.println("Comando invalido");}
        }

        else { System.out.println("Comando invalido");}

        test2.close();


        // FORMA DO "FOR" NO JAVA
        // "i++" É A MESMA COISA DE i+=1
        // for (int i = 0; i< 10; i++){
            // test1.aumentarVolume();
            // System.out.println(">>> Volume aumentado para "+ test1.volume);
        // }

    }
}
