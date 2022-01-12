class calculator3 {
    constructor(a, b) {
        this.a = a;
        this.b = b;

    }

    addition() {
        console.log(this.a + this.b);
    }

    subtraction() {

        console.log(this.a - this.b);
    }
    multiplication() {
        console.log(this.a * this.b);
    }
    division() {
        console.log(this.a / this.b);
    }

}
st1 = new calculator3(20, 2);
st1.addition();
st1.subtraction();
st1.multiplication();
st1.division();