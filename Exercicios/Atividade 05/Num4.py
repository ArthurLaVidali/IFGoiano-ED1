import random

F1 = []
for i in range(100):
    F1.append(random.randint(0, 99))

def inverter_fila(F1):
    F2 = []
    while len(F1) > 0:
        F2.append(F1.pop())
    return F2

F2 = inverter_fila(F1)

print("F1 invertida:")
print(F1)

print("F2:")
print(F2)
