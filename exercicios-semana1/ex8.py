atividade_pratica = float(input("Digite a nota da atividade prática do grau A: "))
atividade_teorica = float(input("Digite a nota da atividade teórica do grau A: "))
prova_laboratorio = float(input("Digite a nota da prova em laboratório do grau B: "))
teste_teorico = float(input("Digite a nota do teste teórico do grau B: "))
trabalho_extraclasse = float(input("Digite a nota do trabalho extraclasse do grau B: "))


nota_final_grauA = (atividade_pratica * 0.45) + (atividade_teorica * 0.55)
nota_final_grauB = (prova_laboratorio * 0.60) + (teste_teorico * 0.20) + (trabalho_extraclasse * 0.2)


nota_final = (nota_final_grauA * 0.37) + (nota_final_grauB * 0.67)

print("Nota final do aluno: ", nota_final)