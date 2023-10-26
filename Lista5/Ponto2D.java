package Lista5;

import java.lang.Math;

public class Ponto2D {
    private double x, y;
    private boolean imutavel = false;

    Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        this.imutavel = true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(!imutavel){
            this.x = x;
        }else{
            System.out.println("Este valor é Imutavel");
        }
        
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(!imutavel){
            this.y = y;
        }else{
            System.out.println("Este valor é imutavel");
        }
    }

    public void imprimirPonto() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

    public boolean isEixoX() {
        return y == 0;
    }

    public boolean isEixoY() {
        return x == 0;
    }

    public boolean isEixos() {
        return isEixoX() || isEixoY();
    }

    public int quadrante() {
        if (isEixos()) {
            return 0;
        }else if (x > 0 && y > 0) {
            return 1;
        }else if (x < 0 && y > 0) {
            return 2;
        }else if (x < 0 && y < 0) {
            return 3;
        }else {
            return 4;
        }
    }

    public float distancia(Ponto2D outroPonto) {
        double dx = this.x - outroPonto.getX();
        double dy = this.y - outroPonto.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
