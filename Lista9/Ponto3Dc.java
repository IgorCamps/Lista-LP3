package Lista9;

public class Ponto3Dc extends Ponto2D {
    private double z;

    public Ponto3Dc(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return super.toString() + ", " + z;
    }
}

class ExemploHeranca {
    public static void main(String[] args) {
        Ponto3Dc pontoHeranca = new Ponto3Dc(9, 10, 11);
        System.out.println("Herança: " + pontoHeranca);
    }
}
