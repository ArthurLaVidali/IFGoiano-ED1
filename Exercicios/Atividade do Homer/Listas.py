lista = []

#1- Adicione Homer e Marge a lista e imprima o resultado
print("1- ")
lista.append("Homer")
lista.append("Marge")
print(lista)

#2- Esvaize a lista, e depois imprima o resultado
print(" ")
print("2- ")
lista.clear()
print(lista)

#3- Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
print(" ")
print("3- ")
lista.append("Homer")
lista.insert(0,"Bart")
lista.insert(1,"Moll")
print(lista)

#4- Esvazie a lista
print(" ")
print("4- ")
lista.clear()
print(lista)

#5- Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
print(" ")
print("5- ")
lista.append("Homer")
lista.append("Bart")
lista.insert(0,"Lisa")
print(lista)
print("Tamanho da lista: ", len(lista))

#6- Esvazie a lista e imprima
print(" ")
print("6- ")
lista.clear()
print(lista)

#7- Adicione Homer, Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
print(" ")
print("7- ")
lista.append("Homer")
lista.append("Maggie")
lista.insert(0,"Bart")
lista.insert(1,"Marge")
print(lista)
print("Lisa está na lista? ", "Lisa" in lista)

#8- Esvazie a lista
print(" ")
print("8- ")
lista.clear()
print(lista)

#9- Adicione Homer e Bart na lista depois imprima o resultado e o lamanho da lista 
print(" ")
print("9- ")
lista.append("Homer")
lista.append("Bart")
print(lista)
print("Tamanho da lista: ", len(lista))

#10- Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
print(" ")
print("10- ")
print("Marge está na lista? ", "Marge" in lista)
print("Homer está na lista? ", "Homer" in lista)
print("Bart está na lista? ", "Bart" in lista)
print("Maggie está na lista? ", "Maggie" in lista)
print(lista)
print("Tamanho da lista: ", len(lista))

#11- esvazie a lista
print(" ")
print("11- ")
lista.clear()
print(lista)

#12- Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
print(" ")
print("12- ")
lista.append("Homer")
lista.append("Bart")
lista.append("Marge")
lista.insert(1,"Maggie")
lista.insert(0,"Ned Flanders")
lista.append("Sr. Burns")
print(lista)

#13- Remova do fim da lista e imprima a lista
print(" ")
print("13- ")
lista.pop()
print(lista)

#14- Remova a posição 1, depois imprima a lista e o tamanho da lista
print(" ")
print("14- ")
lista.pop(1)
print(lista)
print("Tamanho da lista: ", len(lista))

#15- Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
print(" ")
print("15- ")
print("Marge está na lista? ", "Marge" in lista)
print("Homer está na lista? ", "Homer" in lista)
print("Bart está na lista? ", "Bart" in lista)
print("Maggie está na lista? ", "Maggie" in lista)
print(lista)
print("Tamanho da lista: ", len(lista))

#16- Remova do começo da lista, depois imprima a lista e o tamanho da lista.
print(" ")
print("16- ")
lista.pop(0)
print(lista)
print("Tamanho da lista: ", len(lista))

#17- Verifique se Marge, Homer, Bart e Maggie na lista e depois imprima o resultado e o tamanho da lista.
print(" ")
print("17- ")
print("Marge está na lista? ", "Marge" in lista)
print("Homer está na lista? ", "Homer" in lista)
print("Bart está na lista? ", "Bart" in lista)
print("Maggie está na lista? ", "Maggie" in lista)
print(lista)
print("Tamanho da lista: ", len(lista))

#18- esvazie a lista e imprima a lista
print(" ")
print("18- ")
lista.clear()
print(lista)



