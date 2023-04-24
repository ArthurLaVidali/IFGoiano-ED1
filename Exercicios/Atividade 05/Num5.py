import random

# Cria uma fila F e uma pilha P vazias
F = []
P = []

# Sorteia 1000 números aleatórios
for i in range(1000):
    numero = random.randint(0, 999)
    if numero not in F:
        F.append(numero)
    else:
        P.append(numero)

# Imprime a fila F e a pilha P
print("Fila F:")
print(F)
print("Pilha P:")
print(P)
