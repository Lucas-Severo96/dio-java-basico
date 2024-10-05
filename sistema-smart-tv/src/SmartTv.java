public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    /**
     * Método que recebe um volume como parâmetro
     * e retorna a soma do volume inicial com o volume passado 
     * no parâmetro
     * 
     */
    public double aumentarVolumeDefinido(double volume2){
        volume += volume2;
        return volume;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


}
