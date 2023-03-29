import copy

class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        
    def __str__(self):
        return f'nome: {self.nome}, idade: {self.idade}'
    
    def clone (self):
        return copy.copy(self)

class PessoaManager:
    
    def __init__(self):
        self.pessoas = {}
        
    def add_pessoa(self, nome, idade, id):
        pessoa = Pessoa(nome, idade)
        self.pessoas[id] = pessoa
        
    def get_pessoa(self, id):
        return self.pessoas[id].clone()
    
manager = PessoaManager()

manager.add_pessoa('Humpty', 10, 1)
manager.add_pessoa('Canalha', 20, 2)
manager.add_pessoa('Ovni', 30, 3)
manager.add_pessoa('Humpty dnv', 10, 4)
        
# Clonar

pessoa1 = manager.get_pessoa(1)
pessoa2 = manager.get_pessoa(2)
            
# Modificar informações

pessoa1.idade = 18
pessoa2.nome = "Gustavo Humpty"
pessoa2.idade = 80


# Imprimir resultados

print(manager.get_pessoa(1))
print(manager.get_pessoa(2))
print(manager.get_pessoa(3))
print(manager.get_pessoa(4))
print(pessoa1)
print(pessoa2)