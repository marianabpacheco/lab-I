# Crie um programa que exibe um menu de calculadora na tela. O menu exibido deve ser o seguinte:
# • Digite 1 para somar dois valores
# • Digite 2 para subtrair dois valores
# • Digite 3 para multiplicar dois valores
# • Digite 4 para dividir dois valores
# • Digite 5 para realizar uma potência entre dois valores
# • Digite qualquer outro número para sair
# De acordo com a opção informada pelo usuário, solicite os valores necessários para o usuário e imprima na tela o resultado da operação realizada.

import math


print("Digite 1 para somar dois valores")
print("Digite 2 para subtrair dois valores")
print("Digite 3 para multiplicar dois valores")
print("Digite 4 para dividir dois valores")
print("Digite 5 para realizar uma potência entre dois valores")
print("Digite qualquer outro número para sair")

option = int(input("Digite a opção: "))

result = 0

while(option >= 1 and option <= 5):
    a = int(input("Digite o primeiro número: "))
    b = int(input("Digite o segundo número: "))
    if(option == 1):
        result = a + b
    elif(option == 2):
        result = a - b
    elif(option == 3):
        result = a * b
    elif(option == 4):
        result = a / b
    elif(option == 5):
        result = a ** b

    print("Resultado:",result)
    option = int(input("Digite a opção: "))
else:
    print("Programa encerrado")