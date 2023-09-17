# Crie um programa que pede para o usuário digitar 2 valores inteiros via
# Teclado (val1 e val2). Se nenhum dos valores for negativo, escreva os números pares
# entre o menor e o maior valor.

val1 = int(input("Digite o primeiro valor: "))
val2 = int(input("Digite o segundo valor: "))

if(val1 >= 0 and val2 >= 0):
    if(val1 > val2):
        for i in range(val2 +1, val1):
            if(i % 2 == 0):
                print(i)
    else:
        for i in range(val1 + 1,val2):
            if(i % 2 == 0):
                print(i)
else:
    print("Valor inválido")