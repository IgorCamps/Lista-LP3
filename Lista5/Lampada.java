package Lista5;

public class Lampada{
    private int estadoDaLampada; 

    Lampada(int estado){
        this.estadoDaLampada = estado;
    }

    //100 para acessa
    public void acende(){
        this.estadoDaLampada = 100;
    }

    //0 para apagada
    public void apaga(){
        this.estadoDaLampada = 0;
    }

    public void setLuminosidade(int estado){
        if(estado > 100){
            estado = 100;
        }else if(estado < 0){
            estado = 0;
        }
        this.estadoDaLampada = estado;
    }

    public double getEstadoDaLampada(){
        return this.estadoDaLampada;
    }

    public boolean estaLigada(){
        return this.estadoDaLampada > 0;
    }

    public void mostraEstado(){
        if(this.estadoDaLampada > 0){
            System.out.println("A lampada esta acesa.");
        }else{
            System.out.println("A lampada esta apagada.");
        }
    }
}

