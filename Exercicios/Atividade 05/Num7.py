class Fila:
    def __init__(self):
        self.fila = [None] * 20
        self.inicio = 0
        self.fim = -1
    
    def inserir(self, valor):
        self.fim += 1
        self.fila[self.fim] = valor
    
    def remover(self):
        valor = self.fila[self.inicio]
        self.fila[self.inicio] = None
        self.inicio += 1
        return valor
    
    def vazia(self):
        return self.inicio > self.fim
    
    def cheia(self):
        return self.fim == 19


class Pilha:
    def __init__(self):
        self.pilha = []
    
    def push(self, valor):
        self.pilha.append(valor)
    
    def pop(self):
        return self.pilha.pop()


fila = Fila()
for i in range(1, 21):
    fila.inserir(i)

pilha = Pilha()
while not fila.vazia():
    pilha.push(fila.remover())

while pilha:
    fila.inserir(pilha.pop())

# Imprime a fila invertida
while not fila.vazia():
    print(fila.remover(), end=" ")
