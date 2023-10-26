import java.util.Scanner;

public class LampadaGeneralizada {

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

    //Método para saber a porcentagem
    public void operacaoPorcentagem(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um valor de 0 - 100: ");
        int valor = scanner.nextInt();

        if(valor == 0){
            operacaoApaga();
        }else if(valor == 100){
            operacaoAcende(); 
        }else{
            operacaoMeiaLuz();     
        }
    }

    // Método para mostrar o estado da lâmpada
    public void operacaoMostraEstado() {
        if (estadoDaLampada.equals("aceso")) {
            System.out.println("A lâmpada está acesa");
        }else if(estadoDaLampada.equals("apagado")) {
            System.out.println("A lâmpada está apagada");
        }else{
             System.out.println("A lâmpada está com meia-luz");
        }
    }

    // Construtor da classe
    public LampadaGeneralizada() {
        estadoDaLampada = "apagado"; // Inicialmente, a lâmpada está apagada
    }

    public static void main(String[] args) {
        LampadaGeneralizada lampada = new LampadaGeneralizada(); // Criar uma instância da lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado inicial da lâmpada
        lampada.operacaoAcende(); // Acender a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após acender
        lampada.operacaoApaga(); // Apagar a lâmpada
        lampada.operacaoMostraEstado(); // Mostrar o estado após apagar
        lampada.operacaoMeiaLuz();
        lampada.operacaoMostraEstado();
        lampada.operacaoPorcentagem();
        lampada.operacaoMostraEstado();
    }
}
