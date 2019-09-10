def bar(queue):
  while len(queue) > 0:
    print("atendiendo a: " + queue.pop(0) )
bar(["Juan", "Maria", "Pedro"])