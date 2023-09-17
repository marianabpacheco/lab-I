#  Crie um programa que pede para o usuário digitar 20 números com ponto
# flutuante pelo teclado. Ao final, seu programa deve imprimir todos os números
# digitados. Dica: armazene-os em uma string e concatene os valores digitados. No final,
# imprima a string.


i = 1
numbers = []

while(i <= 20):
    n = float(input("Digite um número com ponto flutuante: "))
    numbers.append(n)
    i += 1

for i in numbers:
    print(i)