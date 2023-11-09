package Lista8;

import Lista7.Ponto2D;

public class SegmentoRetaA {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;

    public SegmentoRetaA(Ponto2D P1, Ponto2D P2) {
        pontoInicial = P1;
        pontoFinal = P2;
    }

    public double dimensao() {
        return pontoInicial.distancia(pontoFinal);
    }

    public void imprimirSegmentoReta() {
        System.out.println("Segmento de Reta:");
        System.out.print("Ponto Inicial: ");
        pontoInicial.imprimirPonto();
        System.out.print("Ponto Final: ");
        pontoFinal.imprimirPonto();
        System.out.println("Dimensão: " + dimensao());
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(1, 2);
        Ponto2D ponto2 = new Ponto2D(4, 6);

        SegmentoRetaA segmento = new SegmentoRetaA(ponto1, ponto2);
        segmento.imprimirSegmentoReta();
    }
}
