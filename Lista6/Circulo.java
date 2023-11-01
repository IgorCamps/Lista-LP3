import Lista5.Ponto2D;

public class Circulo {
    private double coordX;
    private double coordY;
    private double raio;

    public Circulo() {
        this(0, 0, 1);
    }

    public Circulo(double raio) {
        this(0, 0, raio);
    }

    public Circulo(double coordX, double coordY) {
        this(coordX, coordY, 1);
    }

    public Circulo(double coordX, double coordY, double raio) {
        validateCirculo(raio);
        this.coordX = coordX;
        this.coordY = coordY;
        this.raio = raio;
    }

    private boolean validateCirculo(double raio) {
        if (raio > 0)
            return true;
        throw new IllegalArgumentException("Raio inválido.");
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public void setRaio(double raio) {
        validateCirculo(raio);
        this.raio = raio;
    }

    public double getCoordX() {
        return this.coordX;
    }

    public double getCoordY() {
        return this.coordY;
    }

    public double getRaio() {
        return this.raio;
    }

    public void printCirculo() {
        System.out.println("(" + this.coordX + ", " + this.coordY + ", " + this.raio + ")");
    }

    public boolean isInsidePoint(Ponto2D point) {
        Ponto2D center = new Ponto2D(coordX, coordY);
        return point.distancia(center) <= this.raio;
    }

    public double surfaceArea() {
        return Math.PI * this.raio * this.raio;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * this.raio * this.raio * this.raio;
    }

    public boolean isLargerThan(Circulo circle) {
        return this.surfaceArea() > circle.surfaceArea();
    }

    public static void main(String[] args) {
        Circulo circle1 = new Circulo(0, 0, 3);
        Circulo circle2 = new Circulo(0, 0, 1);
        circle1.printCirculo();

        Ponto2D point = new Ponto2D(1, 1);
        System.out.println(circle1.isInsidePoint(point));
        System.out.println(circle1.surfaceArea());
        System.out.println(circle1.volume());
        System.out.println(circle1.isLargerThan(circle2));
    }
}
