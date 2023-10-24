public class quest1{
    public static void main(String [] args){
        int i;
        System.out.println("Multimetro quebrado?");

        double [] medidos = {5,6, 5, 5, 5, 5, 5, 5, 5, 5};
        double media=0;

        for(i = 0; i < 10; i++){
            media += medidos[i];
        }
        
        media/=10;

        double []diferencaQuad = new double[10];
        double variacao = 0;

        for(i = 0; i < 10; i++){
            diferencaQuad[i] = ( medidos[i] - media) * ( medidos[i] - media);
            variacao += diferencaQuad[i];           
        }

        variacao/=10;
        double result = Math.sqrt(variacao);

        System.out.println("Variacao: " + variacao);
        System.out.println("Media: " + media);
        System.out.println("Desvio: " + result);

        if(result > (media * 0.1) ){
            System.out.println("O multimetro esta com problemas.");
        }
        else{
            System.out.println("O multimetro não esta com problemas.");
        }     
    }
}