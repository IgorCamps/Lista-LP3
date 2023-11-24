package Lista9;

public class Ponto3Db {
    private double x;
    private double y;
    private double z;
    private Ponto2D ponto2D;

    public Ponto3Db(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        // ponto2D é opcional
    }

    public void setPonto2D(double x, double y) {
        this.ponto2D = new Ponto2D(x, y);
    }

    public String toString() {
        if (ponto2D != null) {
            return ponto2D + ", " + z;
        } else {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }
}

class ExemploAgregacao {
    public static void main(String[] args) {
        Ponto3Db pontoAgregacao = new Ponto3Db(4, 5, 6);
        pontoAgregacao.setPonto2D(7, 8);
        System.out.println("Agregação: " + pontoAgregacao);
    }
}
