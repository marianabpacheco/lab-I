# . Crie um programa que pergunta para o usuário (via Teclado) quantos
# números ele irá digitar e armazena em uma variável chamada quant. Logo após, faça
# com que o usuário digite quant números inteiros, e para cada número digitado imprima
# na tela se o número é negativo, positivo ou zero.


quant = int(input("Digite o número de vezes: "))
i = 0

while(i < quant):
    number = int(input("Digite um número: "))
    if(number < 0):
        print("Número negativo")
    elif(number > 0):
        print("Número positivo")
    else: 
        print("Zero")
    i += 1