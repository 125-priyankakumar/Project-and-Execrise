var a = [11, 23, 12, 24, 56, 3, 4, 78, 55];
b = [];
c = [];
for (i = 0; i < a.length; i++) {
    if (a[i] % 2 !== 0) {
        b.push(a[i]);
    } else {
        c.push(a[i]);
    }
}
console.log("even numbers=", b);
console.log("odd numbers=", c);