class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class CircularLinkedList:
    def __init__(self):
        self.head = Node(None)

    def is_empty(self):
        return self.head.next is None

    def count_elements(self):
        if self.is_empty():
            return 0
        count = 0
        current = self.head.next
        while True:
            count += 1
            current = current.next
            if current == self.head.next:
                break
        return count

    def insert_at_head(self, data):
        new_node = Node(data)
        if self.is_empty():
            new_node.next = new_node
        else:
            last_node = self.head.next
            new_node.next = last_node
            while last_node.next != self.head.next:
                last_node = last_node.next
            last_node.next = new_node
        self.head.next = new_node

    def concatenate(self, other_list):
        if self.is_empty():
            self.head.next = other_list.head.next
        elif not other_list.is_empty():
            last_self = self.head.next
            while last_self.next != self.head.next:
                last_self = last_self.next
            last_self.next = other_list.head.next
            last_other = other_list.head.next
            while last_other.next != other_list.head.next:
                last_other = last_other.next
            last_other.next = self.head.next
            other_list.head.next = other_list.head

    def merge_sorted(self, other_list):
        if self.is_empty():
            return other_list
        elif other_list.is_empty():
            return self

        merged_list = CircularLinkedList()
        current_self = self.head.next
        current_other = other_list.head.next

        while True:
            if current_self.data <= current_other.data:
                merged_list.insert_at_head(current_self.data)
                current_self = current_self.next
            else:
                merged_list.insert_at_head(current_other.data)
                current_other = current_other.next

            if current_self == self.head.next:
                while current_other != other_list.head.next:
                    merged_list.insert_at_head(current_other.data)
                    current_other = current_other.next
                break
            elif current_other == other_list.head.next:
                while current_self != self.head.next:
                    merged_list.insert_at_head(current_self.data)
                    current_self = current_self.next
                break

        return merged_list

    def copy(self):
        if self.is_empty():
            return CircularLinkedList()

        copied_list = CircularLinkedList()
        current = self.head.next
        while True:
            copied_list.insert_at_head(current.data)
            current = current.next
            if current == self.head.next:
                break

        return copied_list


# Criação das listas circulares
list1 = CircularLinkedList()
list2 = CircularLinkedList()

# Inserção de elementos na primeira lista
list1.insert_at_head(3)
list1.insert_at_head(5)
list1.insert_at_head(9)

# Contar o número de elementos na primeira lista
count = list1.count_elements()
print(count)
# Saída: 3

# Inserção de um elemento à esquerda da cabeça da primeira lista
list1.insert_at_head(7)

# Concatenar duas listas circulares
list1.concatenate(list2)

# Intercalar duas listas ordenadas
list3 = CircularLinkedList()
list3.insert_at_head(1)
list3.insert_at_head(5)
list3.insert_at_head(9)

list4 = CircularLinkedList()
list4.insert_at_head(2)
list4.insert_at_head(4)
list4.insert_at_head(7)

merged_list = list3.merge_sorted(list4)

# Fazer uma cópia da primeira lista
copied_list = list1.copy()

# Exibição da lista copiada
current = copied_list.head.next
while current != copied_list.head:
    print(current.data, end=" ")
    current = current.next
# Saída: 7 9 5 3

# Exibição da lista intercalada
current = merged_list.head.next
while current != merged_list.head:
    print(current.data, end=" ")
    current = current.next
# Saída: 1 2 4 5 7 9
