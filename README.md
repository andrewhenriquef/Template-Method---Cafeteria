# Template-Method---Cafeteria
Encapsula algoritmos

O Padrão Template Method define os passos de um algoritmo e permite
a uma subclasse definir a implementação de um ou mais passos.

Métodos template promovem reuso de código: 

    Detecta-se o comportamento comum, o qual permanece na superclasse

    Diferencia-se o comportamento específico nas subclasses

Princípio de Hollywood: “não nos chame, nós chamaremos você!”

    Ao invés de chamar os métodos da superclasse nas subclasses, os métodos das 
    subclasses são chamados no método template da superclasse