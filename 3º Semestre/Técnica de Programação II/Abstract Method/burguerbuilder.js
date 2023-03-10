class BurguerBuilder {
    constructor() {
        this.burguer = {};
    }

    addBread(bread) {
        this.burguer.bread = bread;
        return this;
    }

    addCheese(cheese) {
        this.burguer.cheese = cheese;
        return this;
    }

    addMeat(meat) {
        this.burguer.meat = meat;
        return this;
    }

    addVegetables(vegetables) {
        this.burguer.vegetables = vegetables;
        return this;
    }

    build() {
        return this.burguer;
    }
}

const cheeseBurguer = new BurguerBuilder()
.addBread('Pão australiano')
.addCheese('Cheedar')
.addMeat('Carne mal-passada')
.addVegetables(['Picles', 'Salada', 'Tomate'])
.build();

console.log(cheeseBurguer);
