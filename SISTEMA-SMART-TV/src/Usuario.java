public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //aumentando, diminuindo e mudando de canal na TV
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        //aumentando e diminuindo volume da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        //checklist para saber se tv está ligada, qual o canal atual e qual o volume atual
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        //status para TV desligada ou ligada
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
    }
}
