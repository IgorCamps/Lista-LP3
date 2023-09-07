import java.util.Random;

public class quest2{
    public static void main(String [] args){
      
    System.out.println("Jogo do Craps.");
    int  ponto=0,dado1, dado2, somaD, lancamento = 0;

    Random rDado1 = new Random();
    Random rDado2 = new Random();
      
    dado1 = 1 + rDado1.nextInt(6);
    dado2 =1 + rDado2.nextInt(6);

    somaD = dado1 + dado2;

    System.out.println("Dado 1: " + dado1 + " Dado2: " + dado2 + "\nPonto: " + somaD);
    
    

    if(somaD == 7 || somaD == 11){
      System.out.println("Parabéns, você ganhou!");
      lancamento = 1;
    }else if(somaD ==2 || somaD == 3 || somaD == 12){
        System.out.println("CRAPS! Você perdeu");
        lancamento = 1;
    }else{
        ponto = somaD;
        System.out.println("Iniciando estágio 2");
    }
      
    while(lancamento==0){
     dado1 = 1 + rDado1.nextInt(6);
     dado2 =1 + rDado2.nextInt(6);
     somaD = dado1 + dado2;

     System.out.println("Dado 1: " + dado1 + " Dado2: " + dado2 + "\nPonto: " + somaD);

     if(somaD == 7 ){
        System.out.println("CRAPS! Você perdeu");
        lancamento = 1;
     }
     else if(somaD == ponto){
        System.out.println("Parabéns, você ganhou!");
        lancamento = 1;
     }

    }
 
}
}