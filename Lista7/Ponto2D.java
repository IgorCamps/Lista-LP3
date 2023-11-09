package Lista7;
import java.util.Scanner;

public class Ponto2D {
    private int x;
    private int y;

    public Ponto2D() {
        this(0, 0);
    }

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimirPonto() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public boolean estaNoEixoX() {
        return x == 0;
    }

    public boolean estaNoEixoY() {
        return y == 0;
    }

    public boolean estaEmEixos() {
        return (x == 0 || y == 0);
    }

    public int quadrante() {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public float distancia(Ponto2D outroPonto) {
        float distancia = (float) Math.sqrt(Math.pow(outroPonto.getX() - x, 2) + Math.pow(outroPonto.getY() - y, 2));
        return distancia;
    }

    public float distancia() {
        return distancia(new Ponto2D());
    }

    public float distancia(float x, float y) {
        return distancia(new Ponto2D((int) x, (int) y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada X do primeiro ponto: ");
        int x1 = scanner.nextInt();
        System.out.print("Digite a coordenada Y do primeiro ponto: ");
        int y1 = scanner.nextInt();
        Ponto2D ponto1 = new Ponto2D(x1, y1);

        System.out.print("Digite a coordenada X do segundo ponto: ");
        int x2 = scanner.nextInt();
        System.out.print("Digite a coordenada Y do segundo ponto: ");
        int y2 = scanner.nextInt();
        Ponto2D ponto2 = new Ponto2D(x2, y2);

        System.out.println("Ponto 1:");
        ponto1.imprimirPonto();
        System.out.println("Ponto 2:");
        ponto2.imprimirPonto();

        System.out.println("Distância entre os pontos: " + ponto1.distancia(ponto2));
        System.out.println("Distância entre o Ponto 1 e a origem: " + ponto1.distancia());
        System.out.println("Distância entre o Ponto 1 e um ponto personalizado: " + ponto1.distancia(3.0f, 4.0f));
        System.out.println("Ponto 1 está no eixo X? " + ponto1.estaNoEixoX());
        System.out.println("Ponto 1 está no eixo Y? " + ponto1.estaNoEixoY());
        System.out.println("Ponto 1 está em algum eixo? " + ponto1.estaEmEixos());
        System.out.println("Quadrante do Ponto 1: " + ponto1.quadrante());

        scanner.close();
    }
}
