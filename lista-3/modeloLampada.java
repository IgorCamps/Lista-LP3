public class modeloLampada {

    private String estadoDaLampada; // Variável para armazenar o estado da lâmpada

    // Método para acender a lâmpada
    public void operacaoAcende() {
        estadoDaLampada = "aceso";
    }

    // Método para apagar a lâmpada
    public void operacaoApaga() {
        estadoDaLampada = "apagado";
    }

    // Método para mostrar o estado da lâmpada
    public void operacaoMostraEstado() {
        if (estadoDaLampada.equals("aceso")) {
            System.out.println("A lâmpada está acesa");
        } else {
            System.out.println("A lâmpada está apagada");
        }
    }

    // Construtor da classe
    public modeloLampada() {
        estadoDaLampada = "apagado"; // Inicialmente, a lâmpada está apagada
    }

    public static void main(String[] args) {
        modeloLampada lampada = new modeloLampada(); // Criar uma instância da lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado inicial da lâmpada
        lampada.operacaoAcende(); // Acender a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após acender
        lampada.operacaoApaga(); // Apagar a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após apagar
    }
}
