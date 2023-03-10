//interface da fabrica abstrata
class AnimalFactory{
    createAnimal(){
        throw new Error ("O metodo creatAnimal deve ser implementado");
    }
}

//fabrica concretas
class DogFactory extends AnimalFactory{
    createAnimal(){
        return new Dog();
    }
}

class CatFactory extends AnimalFactory{
    createAnimal(){
        return new Cat();
    }
}

//interface do produto abstrato
class Animal{
    makeSound(){
        throw new Error("O metodo makeSound deve ser implementado")
    }
}

//produtos abstratos
class Dog extends Animal{
    makeSound(){
        return "Woof!";
    }
}

class Cat extends Animal{
    makeSound(){
        return "Meow!";
    }
}

// Criação de Fabrica concreta de cachorro e do cachorro
const dogFactory = new DogFactory();
const dog = dogFactory.createAnimal();
console.log(dog.makeSound()); //"Woof"

// Criação de fábrica concreta de gato e do gato
const catFactory = new CatFactory();
const cat = catFactory.createAnimal()
console.log(cat.makeSound()); // "Meow"
