import math

medidos = [5,6, 5, 5, 5, 5, 5, 5, 5, 5]
media = 0

for i in  range(10):
    media += medidos[i]

media/=10

print(media)

diferencaQuad = []

variacao = 0
for i in  range(10):
    dif = medidos[i] - media
    diferencaQuad.append (math.pow(dif, 2))
    variacao += diferencaQuad[i]; 

variacao/=10


result =  math.sqrt(variacao)

print("Variacao: " + str(variacao))
print("Media: " + str(media))
print("Desvio: " + str(result))


if(result > (media * 0.1) ):
    print("O multimetro esta com problemas.")
else:
    print("O multimetro não esta com problemas.")


