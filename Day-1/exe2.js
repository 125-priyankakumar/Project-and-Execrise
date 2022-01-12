function marks(m) {
    if (m < 100 && m > 90) {
        console.log("Grade is A");
    } else if (m < 90 && m > 80) {
        console.log("Grade is B");
    } else if (m < 80 && m > 70) {
        console.log("Grade is C");
    } else {
        console.log("Fail");
    }
    return m;
}
marks(95);
marks(60);