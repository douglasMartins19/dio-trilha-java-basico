public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //funçao para mudar, aumentar ou diminuir canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    //função para aumentar e diminuir volume
    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume -1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //função para ligar e desligar TV
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
