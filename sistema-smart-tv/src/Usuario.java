public class Usuario {
    public static void main(String[] args) throws Exception {
        
        /* Instanciando/Criando um Novo Objeto (uma nova SmartTV) */
        SmartTv smartTv = new SmartTv();

        /* Acessando os atributos/variaveis da Classe SmartTV */
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status (1) -> TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status (2) -> TV Ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Novo Volume: " + smartTv.volume);
        
        smartTv.aumentarVolumeDefinido(10);
        System.out.println("Novo Volume Definido: " + smartTv.volume);
        
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal escolhido foi: " + smartTv.canal);
    }
}
