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

# Iniciando método factory

def option(option):
    
    if option == '0':
        print('Saindo...')
        exit()
        
    elif option == '1':
        nome = input('\nDigite o nome da pessoa: ')
        idade = input('\nDigite a idade da pessoa: ')
        id = input('\nDigite o ID da pessoa: ')
        manager.add_pessoa(nome, int(idade), int(id))
        pessoa = manager.get_pessoa(int(id))
        print('\nDados da pessoa adicionada:\n\nNome: {0}\nIdade: {1}'.format(pessoa.nome, pessoa.idade))
        menu()
    
    
    # Terminar
    elif option == '2':
        print('\nPessoas disponíveis para edição\n')
        for i in manager.pessoas:
            pessoa = manager.get_pessoa(i)
            print('ID: {0}\nNome: {1}\nIdade: {2}\n\n'.format(i, pessoa.nome, pessoa.idade))
        opt = input('Digite o ID da pessoa a ser editada: ')
        print('\nEdição de pessoas não está pronta!')
        # Terminar aqui
        menu()     
            
    elif option == '3':
        print('\nPessoas que estão cadastradas\n')
        for i in manager.pessoas:
            pessoa = manager.get_pessoa(i)
            print('ID: {0}\nNome: {1}\nIdade: {2}\n\n'.format(i, pessoa.nome, pessoa.idade))
        menu()
    
    # Terminar
    elif option == '4':
        print('\nClonagem de pessoas não está pronta!')
        menu()
        
def menu():
    if len(manager.pessoas) <= 0:
        opt = str(input('\nDigite a opção desejada:\n\n1 - Cadastrar pessoa\n0 - Sair\n\nDigite a opção desejada: '))
        option(opt)
    else:
        opt = str(input('\nDigite a opção desejada:\n\n1 - Cadastrar pessoa\n2 - Editar pessoa\n3 - Consultar pessoas\n4 - Clonar pessoa\n0 - Sair\n\nDigite a opção desejada: '))
        option(opt)

if __name__ == '__main__':
    menu()