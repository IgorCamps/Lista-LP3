public class LampadaTresEstados {

    private String estadoDaLampada; // Variável para armazenar o estado da lâmpada

    // Método para acender a lâmpada
    public void operacaoAcende() {
        estadoDaLampada = "aceso";
    }

    // Método para apagar a lâmpada
    public void operacaoApaga() {
        estadoDaLampada = "apagado";
    }

    //Método para meia-luz
    public void operacaoMeiaLuz(){
        estadoDaLampada = "meia-luz";
    }

    // Método para mostrar o estado da lâmpada
    public void operacaoMostraEstado() {
        if (estadoDaLampada.equals("aceso")) {
            System.out.println("A lâmpada está acesa");
        }else if(estadoDaLampada.equals("apagado")) {
            System.out.println("A lâmpada está apagada");
        }else{
             System.out.println("A lâmpada com meia-luz");
        }
    }

    // Construtor da classe
    public LampadaTresEstados() {
        estadoDaLampada = "apagado"; // Inicialmente, a lâmpada está apagada
    }

    public static void main(String[] args) {
        LampadaTresEstados lampada = new LampadaTresEstados(); // Criar uma instância da lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado inicial da lâmpada
        lampada.operacaoAcende(); // Acender a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após acender
        lampada.operacaoApaga(); // Apagar a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após apagar
        lampada.operacaoMeiaLuz();
        lampada.operacaoMostraEstado();
    }
}
