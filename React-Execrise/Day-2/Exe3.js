//Id Sort
items = [{"id":101,"name":"raj"},{"id":121,"name":"rajesh"},{"id":114,"name":"tom"},{"id":130,"name":"suraj"}]
function Sort(func) {
    return function(a, b) {
        return (a[func] < b[func]) ? -1 : (a[func] - b[func]) ? 1 : 0;
    }
 }
 
 items.sort(Sort('name')).sort(Sort('id'));
 items.sort(Sort('id')).sort(Sort('name')); 
 console.log(items);  

 //Name Sort
 items = [{"id":101,"name":"raj"},{"id":121,"name":"rajesh"},{"id":114,"name":"tom"},{"id":130,"name":"suraj"}]
function Sort(func) {
    return function(a, b) {
        return (a[func] < b[func]) ? -1 : (a[func] >b[func]) ? 1 : 0;
    }
 }
 
 items.sort(Sort('name')).sort(Sort('id'));
 items.sort(Sort('id')).sort(Sort('name')); 
 console.log(items);  