class Produto{
    constructor(nome, preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class Carrinho{
    constructor() {
        if (typeof Carrinho.instance === "object") {
            return Carrinho.instance;
          }
        this.items = [];
        Carrinho.instance = this;

        return this;
    }

    add_item(item) {
        this.items.push(item)
    }

    get_items() {
        return this.items;
    }

    get_instance() {
        if (!Carrinho.instance) {
            Carrinho()
        }
        return Carrinho.instance;
    }
}

const carrinho1 = new Carrinho();
const carrinho2 = new Carrinho();

const produto1 = new Produto('Calça', 20);
const produto2 = new Produto('Camisa', 40);
const produto3 = new Produto('Meia', 60);
const produto4 = new Produto('Boné', 80);

carrinho1.add_item(produto1);
carrinho2.add_item(produto2);

console.log(carrinho1.get_items())