class Pilha:
    def __init__(self):
        self.itens = []

    def vazia(self):
        return len(self.itens) == 0

    def empilhar(self, item):
        self.itens.append(item)

    def desempilhar(self):
        if not self.vazia():
            return self.itens.pop()
        else:
            return None

    def remover_item(self, c):
        auxiliar = Pilha()
        while not self.vazia():
            item = self.desempilhar()
            if item != c:
                auxiliar.empilhar(item)
            else:
                break
        
        while not auxiliar.vazia():
            self.empilhar(auxiliar.desempilhar())
