var stu = [{ id: 101, name: 'raj', cmarks: 45, pmarks: 55, mmarks: 67 },
    { id: 102, name: 'rajesh', cmarks: 65, pmarks: 85, mmarks: 77 },
    { id: 103, name: 'suraj', cmarks: 43, pmarks: 55, mmarks: 60 },
    { id: 104, name: 'tom', cmarks: 71, pmarks: 65, mmarks: 70 }
];
var a = []

function cal() {
    for (i = 0; i < 4; i++) {
        a[i] = stu[i].cmarks + stu[i].pmarks + stu[i].mmarks;
        a[i] = a[i] / 3;
        if (a[i] > a[i - 1]) {
            return i;
        }
    }
}
t = Math.max(cal());
console.log(stu[t].name);