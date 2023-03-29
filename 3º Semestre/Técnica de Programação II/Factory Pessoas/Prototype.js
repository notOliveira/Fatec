class Pessoa{
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
    }

    clone(){
        return Object.assign(Object.create(Object.getPrototypeOf(this)), this);
    }
}

class PessoaManager{
    constructor(){
        this.pessoas = {};
    }

    addPessoa(nome, idade, id){
        const pessoa = new Pessoa(nome, idade);
        this.pessoas[id] = pessoa;
    }

    getPessoa(id){
        return this.pessoas[id].clone();
    }   
    
}

const manager = new PessoaManager()

// Adicionando pessoas

manager.addPessoa('Pessoa 1', 10, 1);
manager.addPessoa('Pessoa 2', 20, 2);
manager.addPessoa('Pessoa 3', 30, 3);

// Clonando pessoas

const pessoa1 = manager.getPessoa(1);
const pessoa2 = manager.getPessoa(2);
const pessoa3 = manager.getPessoa(3);

// Modificar as pessoas clonadas

pessoa1.nome = 'Pessoa alterada 1'
pessoa2.nome = 'Pessoa alterada 2'
pessoa3.nome = 'Pessoa alterada 3'

// Imprimindo informações

console.log('Pessoas criadas\n');
console.log(manager.getPessoa(1));
console.log(manager.getPessoa(2));
console.log(manager.getPessoa(3));
console.log('\nPessoas clonadas\n');
console.log(pessoa1);
console.log(pessoa2);
console.log(pessoa3);