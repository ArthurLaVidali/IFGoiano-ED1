import random

fila = []
pilha = []

for i in range(1000):
    fila.append(random.randint(-1000, -1))
    fila.append(random.randint(1, 1000))

# Percorre a fila
for num in fila:
    if num > 0 and num == fila[0]:
        pilha.append(num)
        fila.pop(0)
    elif num < 0 and len(pilha) > 0:
        print(pilha[-1])
        pilha.pop()

if len(pilha) > 0:
    print("Elementos restantes na pilha:")
    print(pilha)
