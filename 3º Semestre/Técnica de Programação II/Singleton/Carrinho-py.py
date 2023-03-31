class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

class Carrinho:
    instance = None
    
    def __init__(self):
        if Carrinho.instance is None:
            Carrinho.instance = self
            self.items = []
        else:
            raise Exception('Esta classe é um Singleton!')
    
    @staticmethod
    def get_instance():
        if not Carrinho.instance:
            Carrinho()
        return Carrinho.instance
    
    def add_item(self, item):
        self.items.append(item)
    
    def get_items(self):
        return self.items

# Criando carrinhos
carrinho1 = Carrinho.get_instance()
carrinho2 = Carrinho.get_instance()

# Adicionando produtos aos carrinhos
produto1 = Produto('Camisa', 20.00)
produto2 = Produto('Calça', 1000.00)
produto3 = Produto('Meia', 50.00)
produto4 = Produto('Tênis', 200.00)

carrinho1.add_item(produto1)
carrinho1.add_item(produto2)
carrinho1.add_item(produto3)

carrinho2.add_item(produto4)

for item in carrinho1.get_items():
    print(item.nome, ' - ', item.preco)