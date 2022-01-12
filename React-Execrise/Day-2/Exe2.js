arr1 = [10,20,30,40,50,45,67];
arr2 = [34,23,56,57,89,22,11];
a=[]
b=[]
function evenodd(a){
  res=0
  x=[]
  for(let i of a){
    if(i%2==0){
       x.push(i)
        }
   }
    return x;
  }
function sumarray(d,e){
c=[];
for(i =0;i<Math.min(d.length,e.length);i++){
c.push(d[i]+e[i])
}
  return c;
 }
arr3=evenodd(arr1)
arr4=evenodd(arr2)
sumarray(arr3,arr4)