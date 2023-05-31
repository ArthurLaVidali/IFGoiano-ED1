import random

sorteio = [1, 15, 16, 25, 32, 36]
numeros = []
ocorrencias_ordem_direta = 0
ocorrencias_ordem_inversa = 0

# Sorteio aleatório de 51 milhões de números
numeros = random.choices(range(1, 61), k=51000000)

# Convertendo a sequência de sorteio em uma tupla para facilitar a comparação
sorteio_tupla = tuple(sorteio)

# Percorrendo a lista em ordem direta
for i in range(len(numeros) - 5):
    if tuple(numeros[i:i+6]) == sorteio_tupla:
        ocorrencias_ordem_direta += 1
        print("Sequência encontrada na posição", i)

# Invertendo a lista de números
numeros.reverse()

# Percorrendo a lista em ordem inversa
for i in range(len(numeros) - 5):
    if tuple(numeros[i:i+6]) == sorteio_tupla:
        ocorrencias_ordem_inversa += 1
        print("Sequência encontrada na posição", i)

print("Número de ocorrências na ordem direta:", ocorrencias_ordem_direta)
print("Número de ocorrências na ordem inversa:", ocorrencias_ordem_inversa)
