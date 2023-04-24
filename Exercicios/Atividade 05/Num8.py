import random

class Pilha:
    def __init__(self):
        self.pilha = []
    
    def push(self, valor):
        self.pilha.append(valor)
    
    def pop(self):
        return self.pilha.pop()
    
    def vazia(self):
        return len(self.pilha) == 0


class TestaPilha:
    def __init__(self):
        self.pilha_p = Pilha()
        self.pilha_n = Pilha()
    
    def insere_na_pilha(self, valor):
        if valor > 0:
            self.pilha_p.push(valor)
        elif valor < 0:
            self.pilha_n.push(valor)
        else:
            if not self.pilha_p.vazia() and not self.pilha_n.vazia():
                print(self.pilha_p.pop(), self.pilha_n.pop())

tp = TestaPilha()
for i in range(1000):
    valor = random.randint(-100, 100)
    tp.insere_na_pilha(valor)
