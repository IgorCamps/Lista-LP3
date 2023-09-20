import random

print("JOGO DO CRAPS")

rDado1 = random.randint(1,6)
rDado2 = random.randint(1,6)

somaD = rDado1 + rDado2

print("Dado 1: " + str(rDado1) + " Dado 2: " + str(rDado2))

lancamento = 0

if(somaD == 7 or somaD == 11):
   print("Parabéns, você ganhou!")
   lancamento = 1

elif(somaD ==2 or somaD == 3 or somaD == 12):
    print("CRAPS! Você perdeu")
    lancamento = 1
else:
    ponto = somaD
    print("Iniciando estágio 2")

while(lancamento==0):
     dado1 = random.randint(1,6)
     dado2 = random.randint(1,6)

     somaD = dado1 + dado2

     print("Dado 1: " + str(rDado1) + " Dado 2: " + str(rDado2) + " Ponto: " + str(somaD) )

     if(somaD == 7 ):
        print("CRAPS! Você perdeu")
        lancamento = 1
     elif(somaD == ponto):
        print("Parabéns, você ganhou!")
        lancamento = 1
     

    