#Vamos importar re para pegarmos a equação digitada pelo usuário para separar-mos os itens, str com str e float com float
import re  #Re = Expressões regulares

#equacao = input(str("Digite uma equação na notação Infixa (sem espaço): "))

def analisar_equacao(equacao):
    # remove espaços em branco
    equacao = equacao.replace(" ", "")
    
    # expressões regulares para identificar números e variáveis
    num_regex = re.compile(r'\d+(\.\d+)?')
    var_regex = re.compile(r'[a-zA-Z]+')
    
    # lista para armazenar os elementos da equação
    elementos = []
    
    # variável para armazenar o número ou variável atual
    temp = ''
    
    # percorre a equação caractere por caractere
    for char in equacao:
        if char.isdigit() or char == '.':
            # se o caractere é um dígito ou ponto decimal, adiciona ao número atual
            temp += char
        elif var_regex.match(char):
            # se o caractere é uma letra, adiciona à variável atual
            temp += char
        else:
            # se o caractere é um operador ou parêntese, adiciona o número ou variável atual à lista de elementos
            if temp != '':
                elementos.append(float(temp) if num_regex.match(temp) else temp)
                temp = ''
            elementos.append(char)
    
    # adiciona o último número ou variável à lista de elementos, se houver
    if temp != '':
        elementos.append(float(temp) if num_regex.match(temp) else temp)
    
    return elementos

#Transforma a equação Infixa para Pós-Fixa
def infix_para_posfixado(elementos):
    # dicionário de precedência de operadores
    precedencia = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}
    
    # lista para armazenar os elementos posfixados
    posfixado = []
    
    # pilha para armazenar os operadores
    operadores = []
    
    # percorre cada elemento da equação
    for elemento in elementos:
        if isinstance(elemento, float) or isinstance(elemento, str) and elemento.isalpha():
            # se o elemento é um número ou variável, adiciona diretamente ao posfixado
            posfixado.append(elemento)
        elif elemento == '(':
            # se o elemento é um parêntese esquerdo, adiciona à pilha de operadores
            operadores.append(elemento)
        elif elemento == ')':
            # se o elemento é um parêntese direito, desempilha todos os operadores até o parêntese esquerdo
            while operadores[-1] != '(':
                posfixado.append(operadores.pop())
            operadores.pop() # remove o parêntese esquerdo da pilha
        elif elemento in precedencia:
            # se o elemento é um operador, desempilha operadores com maior ou igual precedência e adiciona ao posfixado
            while operadores and operadores[-1] != '(' and precedencia[elemento] <= precedencia[operadores[-1]]:
                posfixado.append(operadores.pop())
            operadores.append(elemento)
    
    # desempilha todos os operadores restantes e adiciona ao posfixado
    while operadores:
        posfixado.append(operadores.pop())
    
    return posfixado

# teste
#equacao_teste = '(1 + 2) * 3'
#elementos = analisar_equacao(equacao_teste)
#posfixado = infix_para_posfixado(elementos)
#print(posfixado)

#Transforma a equação Pós-fixa para pré-fixa, invertando a ordem da lista.
def infix_para_prefixado(elementos):
    # inverte a lista de elementos
    elementos_reverso = list(reversed(elementos))
    
    # dicionário de precedência de operadores
    precedencia = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}
    
    # lista para armazenar os elementos prefixados
    prefixado = []
    
    # pilha para armazenar os operadores
    operadores = []
    
    # percorre cada elemento da equação invertida
    for elemento in elementos_reverso:
        if isinstance(elemento, float) or isinstance(elemento, str) and elemento.isalpha():
            # se o elemento é um número ou variável, adiciona diretamente ao prefixado
            prefixado.append(elemento)
        elif elemento == ')':
            # se o elemento é um parêntese direito, adiciona à pilha de operadores
            operadores.append(elemento)
        elif elemento == '(':
            # se o elemento é um parêntese esquerdo, desempilha todos os operadores até o parêntese direito
            while operadores[-1] != ')':
                prefixado.append(operadores.pop())
            operadores.pop() # remove o parêntese direito da pilha
        elif elemento in precedencia:
            # se o elemento é um operador, desempilha operadores com maior ou igual precedência e adiciona ao prefixado
            while operadores and operadores[-1] != ')' and precedencia[elemento] < precedencia[operadores[-1]]:
                prefixado.append(operadores.pop())
            operadores.append(elemento)
    
    # desempilha todos os operadores restantes e adiciona ao prefixado
    while operadores:
        prefixado.append(operadores.pop())
    
    # inverte a lista de elementos prefixados
    prefixado_reverso = list(reversed(prefixado))
    
    return prefixado_reverso

# teste
#equacao_teste = '3 + 4 * 2 / (1 - 5) ^ 2 ^ 3'
#elementos = analisar_equacao(equacao_teste)
#prefixado = infix_para_prefixado(elementos)
#print(prefixado)

def avaliar_prefixado(prefixado):
    # pilha para armazenar os operandos
    operandos = []
    
    # percorre cada elemento da equação prefixada
    for elemento in prefixado:
        if isinstance(elemento, float) or isinstance(elemento, str) and elemento.isalpha():
            # se o elemento é um número ou variável, empilha diretamente na pilha de operandos
            operandos.append(elemento)
        elif elemento in ['+', '-', '*', '/', '^']:
            # se o elemento é um operador, desempilha os dois operandos superiores e realiza a operação
            operando2 = float(operandos.pop())
            operando1 = float(operandos.pop())
            if elemento == '+':
                resultado = operando1 + operando2
            elif elemento == '-':
                resultado = operando1 - operando2
            elif elemento == '*':
                resultado = operando1 * operando2
            elif elemento == '/':
                resultado = operando1 / operando2
            elif elemento == '^':
                resultado = operando1 ** operando2
            # empilha o resultado da operação na pilha de operandos
            operandos.append(resultado)
    
    # o resultado final é o único elemento restante na pilha de operandos
    resultado_final = operandos.pop()
    
    return resultado_final

# teste
#equacao_teste = '3 + 4 * 2 / (1 - 5) ^ 2 ^ 3'
#elementos = analisar_equacao(equacao_teste)
#prefixado = infix_para_prefixado(elementos)
#resultado = avaliar_prefixado(prefixado)
#print(resultado)

def avaliar_posfixado(posfixado):
    # pilha para armazenar os operandos
    operandos = []
    
    # percorre cada elemento da equação posfixada
    for elemento in posfixado:
        if isinstance(elemento, float) or isinstance(elemento, str) and elemento.isalpha():
            # se o elemento é um número ou variável, empilha diretamente na pilha de operandos
            operandos.append(elemento)
        elif elemento in ['+', '-', '*', '/', '^']:
            # se o elemento é um operador, desempilha os dois operandos superiores e realiza a operação
            operando2 = float(operandos.pop())
            operando1 = float(operandos.pop())
            if elemento == '+':
                resultado = operando1 + operando2
            elif elemento == '-':
                resultado = operando1 - operando2
            elif elemento == '*':
                resultado = operando1 * operando2
            elif elemento == '/':
                resultado = operando1 / operando2
            elif elemento == '^':
                resultado = operando1 ** operando2
            # empilha o resultado da operação na pilha de operandos
            operandos.append(resultado)
    
    # o resultado final é o único elemento restante na pilha de operandos
    resultado_final = operandos.pop()
    
    return resultado_final

# teste
#equacao_teste = '3 + 4 * 2 / (1 - 5) ^ 2 ^ 3'
#lementos = analisar_equacao(equacao_teste)
#posfixado = infix_para_posfixado(elementos)
#resultado = avaliar_posfixado(posfixado)
#print(resultado)

# pede que o usuário digite a equação em notação infixa
equacao = input('Digite a equação em notação infixa: ')

# analisa a equação e converte para notação pós-fixa e pré-fixa
elementos = analisar_equacao(equacao)
posfixado = infix_para_posfixado(elementos)
prefixado = infix_para_prefixado(elementos)


# apresenta a equação em notação pós-fixa
print('Equação em notação pós-fixa:')
for elemento in posfixado:
    print(elemento, end=' ')
print()

# apresenta a equação em notação pré-fixa
print('Equação em notação pré-fixa:')
for elemento in prefixado:
    print(elemento, end=' ')
print()

#Apresenta o resultado
resultado = avaliar_posfixado(posfixado)
print('Resultado:', resultado)
