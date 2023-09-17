# Crie um programa que aplica uma taxa de juros em um determinado preço digitado pelo teclado. A taxa aplicada deve ser:
# • Aumento de 10% caso o valor seja menor do que 100
# • Aumento de 20% caso o valor esteja entre 100 (inclusive) e 300
# • Aumento de 50% caso o valor esteja entre 300 (inclusive) e 1000
# • Imprima uma mensagem de erro se o valor for negativo
# • Ao final, seu programa deve imprimir o novo valor, já com a taxa aplicada.

price = float(input("Informe o preço: "))

if(price > 0):
    if(price < 100):
        price = price * 1.1
    elif(price < 300):
        price = price * 1.2 
    elif(price < 1000):
        price = price * 1.5

    print("O novo valor é R$", price)
 
else:
    print("Preço inválido")

