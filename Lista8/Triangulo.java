package Lista8;
import Lista7.Ponto2D;

public class Triangulo {
    private Ponto2D pontoA;
    private Ponto2D pontoB;
    private Ponto2D pontoC;

    public Triangulo(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC) {
        if (!saoPontosAlinhados(pontoA, pontoB, pontoC)) {
            this.pontoA = pontoA;
            this.pontoB = pontoB;
            this.pontoC = pontoC;
        } else {
            System.out.println("Os pontos estão alinhados e não formam um triângulo.");
        }
    }

    public void imprimeTriangulo() {
        System.out.println("Triângulo:");
        System.out.print("Vértice A: ");
        pontoA.imprimirPonto();
        System.out.print("Vértice B: ");
        pontoB.imprimirPonto();
        System.out.print("Vértice C: ");
        pontoC.imprimirPonto();
    }

    public boolean isTrianguloRetangulo() {
        double ladoA = pontoA.distancia(pontoB);
        double ladoB = pontoB.distancia(pontoC);
        double ladoC = pontoC.distancia(pontoA);

        double[] lados = {ladoA, ladoB, ladoC};
        double maxLado = lados[0];

        for (double lado : lados) {
            if (lado > maxLado) {
                maxLado = lado;
            }
        }

        if (maxLado == ladoA) {
            return Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2);
        } else if (maxLado == ladoB) {
            return Math.pow(ladoB, 2) == Math.pow(ladoA, 2) + Math.pow(ladoC, 2);
        } else {
            return Math.pow(ladoC, 2) == Math.pow(ladoA, 2) + Math.pow(ladoB, 2);
        }
    }

    public boolean isTrianguloIsosceles() {
        double ladoA = pontoA.distancia(pontoB);
        double ladoB = pontoB.distancia(pontoC);
        double ladoC = pontoC.distancia(pontoA);

        return ladoA == ladoB || ladoB == ladoC || ladoC == ladoA;
    }

    public boolean isTrianguloEquilatero() {
        double ladoA = pontoA.distancia(pontoB);
        double ladoB = pontoB.distancia(pontoC);
        double ladoC = pontoC.distancia(pontoA);

        return ladoA == ladoB && ladoB == ladoC;
    }

    private boolean saoPontosAlinhados(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC) {
        return (pontoA.getX() * (pontoB.getY() - pontoC.getY()) +
                pontoB.getX() * (pontoC.getY() - pontoA.getY()) +
                pontoC.getX() * (pontoA.getY() - pontoB.getY())) == 0;
    }

    public static void main(String[] args) {
        Ponto2D pontoA = new Ponto2D(1, 2);
        Ponto2D pontoB = new Ponto2D(4, 6);
        Ponto2D pontoC = new Ponto2D(5, 4);

        Triangulo triangulo = new Triangulo(pontoA, pontoB, pontoC);
        triangulo.imprimeTriangulo();

        if (triangulo.isTrianguloRetangulo()) {
            System.out.println("O triângulo é retângulo.");
        } else if (triangulo.isTrianguloIsosceles()) {
            System.out.println("O triângulo é isósceles.");
        } else if (triangulo.isTrianguloEquilatero()) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo não se enquadra em nenhuma das categorias.");
        }
    }
}
