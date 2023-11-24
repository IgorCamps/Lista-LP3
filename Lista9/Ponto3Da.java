package Lista9;

public class Ponto3Da {
    private double x;
    private double y;
    private double z;
    private Ponto2D ponto2D;

    public Ponto3Da(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ponto2D = new Ponto2D(x, y);
    }

    public String toString() {
        return ponto2D + ", " + z;
    }
}

class ExemploComposicao {
    public static void main(String[] args) {
        Ponto3Da pontoComposicao = new Ponto3Da(1, 2, 3);
        System.out.println("Composição: " + pontoComposicao);
    }
}
