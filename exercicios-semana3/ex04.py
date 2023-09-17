# Crie um programa que recebe três valores inteiros pelo teclado e imprime qual dos três é menor.

a = int(input())
b = int(input())
c = int(input())


aux = a 

if(aux < b):
    aux = b
if(aux < c):
    aux = c

print("Maior é:", aux)
