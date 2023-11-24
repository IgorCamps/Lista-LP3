package Lista9;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean inAxisX() {
        return y == 0;
    }

    public boolean inAxisY() {
        return x == 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY();
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double distance(Ponto2D ponto) {
        return distance(ponto.x, ponto.y);
    }

    public static void main(String[] args) {
        Ponto2D pontoA = new Ponto2D(); 
        Ponto2D pontoB = new Ponto2D(3, 4); 
        Ponto2D pontoC = new Ponto2D(pontoB); 

        System.out.println("Ponto A: " + pontoA);
        System.out.println("Ponto B: " + pontoB);
        System.out.println("Ponto C: " + pontoC);

        System.out.println("Está no eixo X? " + pontoB.inAxisX());
        System.out.println("Está no eixo Y? " + pontoB.inAxisY());
        System.out.println("Está sobre os eixos? " + pontoB.inAxis());
        System.out.println("Está na origem? " + pontoA.isOrigin());

        double distancia = pontoB.distance(0, 0);
        System.out.println("Distância até a origem: " + distancia);
    }
}
