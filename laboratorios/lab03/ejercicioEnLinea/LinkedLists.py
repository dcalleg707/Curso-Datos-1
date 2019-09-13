# codigo extraido de: https://stackabuse.com/linked-lists-in-detail-with-python-examples-single-linked-lists/
class Node:
    def __init__(self, data):
        self.item = data
        self.ref = None

class LinkedList:
    def __init__(self):
        self.start_node = None

    def insert_at_start(self, data):
        new_node = Node(data)
        new_node.ref = self.start_node
        self.start_node = new_node

    def insert_at_end(self, data):
        new_node = Node(data)
        if self.start_node is None:
            self.start_node = new_node
            return
        n = self.start_node
        while n.ref is not None:
            n = n.ref
        n.ref = new_node


# código hecho por nosotros

    def insert_node_at_end(self, nodo):
        if self.start_node is None:
            self.start_node = nodo
            return
        n = self.start_node
        while n.ref is not None:
            n = n.ref
        n.ref = nodo

    def ConditinonedUnion(self, lista):
        if self.start_node is not None:
            self.insert_node_at_end(lista.start_node)
            lista.start_node = self.start_node


def printer(lista):
    current = lista.start_node
    sol = ""
    while current:
        sol += current.item
        current = current.ref
    print(sol)


def teclado(frase):
    aux = LinkedList()
    sol = LinkedList()
    st = False
    for i in range(len(frase)):

        if frase[i] == "[":
            st = True
            aux.ConditinonedUnion(sol)
            aux = LinkedList()
            continue
        if frase[i] == "]":
            st = False
            continue
        if st:
            aux.insert_at_end(frase[i])
        else:
            aux.ConditinonedUnion(sol)
            aux = LinkedList()
            sol.insert_at_end(frase[i])
    aux.ConditinonedUnion(sol)
    return(sol)


printer(teclado(input()))
