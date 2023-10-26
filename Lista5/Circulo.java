package Lista5;

public class Circulo{
    private float posX, posY, radius;
    
    Circulo(float posX, float posY, float radius){
        this.posX = posX;
        this.posY = posY;
        if(validaCirculo(radius))
            this.radius = radius;
        else{ 
            this.radius = 1F;
            System.out.println("Raio inválido");
        }
    }

    public void setPosX(float posX) {
         this.posX = posX;
    }
    public void setPosY(float posY) {
        this.posY = posY;
    }
    public void setRadius(float radius) {
        if(validaCirculo(radius))
            this.radius = radius;
        else{
            System.out.println("Valor inválido");
        }
    }

    public float getRadius() {
        return radius;
    }
    public float getPosX() {
        return posX;
    }
    public float getPosY() {
        return posY;
    }

    public float area(){
        return (radius * radius * 3.14F);
    }
    public float perimetro(){
        return (2 * radius * 3.14F);
    }

    public boolean ehMaiorQue(Circulo rnd){
        return this.area() > rnd.area();
    }
    public boolean ehPontoInterno(Ponto2D ponto){
        Ponto2D aux = new Ponto2D(this.posX, this.posY);
        return ponto.distancia(aux) < radius;
    }
    private boolean validaCirculo(float radius){
        return (radius > 0);
    }
}
