// identifier name should start in alphabet,$,_
// variable name should be as descriptive as possible
// naming conventions : camel case - It is used to declare variable, functions, methods
//                    : pascal case - It is used to define classes. File names. First letter of s=each name capital
//                    : snake case - It is used to define database names, relation names, column names
//                    : kebab case - Every word seperated by a dash(-). This is used to give folder names
const a=5
console.log("Number =",a)
//a=10   gives error as constant is immutable

var b   // var is not scope specific
console.log("Name :",b)
b='Dhruv'
console.log("Name :",b)

let c='Susminder'   // let is scope specific
console.log("Second Name :",c)

{
    var b='Kalaa'    //here the value of b is changed permanently
    console.log(b)
    let c='Jigna'    // here the value of c is changed only inside the scope, c is a new variable now
    console.log(c)
}
console.log(b)       // output is kalaa as value changed permanently
console.log(c)       //value of c is retained outside the scope, ie value now is Susminder

console.log(a, typeof a)
console.log(b, typeof b)
console.log(c, typeof c)

let number, num=9
let String, name ="Rajesh"
let boolean, isName=true
console.log(num, typeof num)
console.log(name, typeof name)

// array is reference datatype. So array values can be of multiple primitive datatypes.
// array datatype points towards an address
// array values can be changed even if it is initialized with const. because we only change values but not the address at which array points
let arrayOne=[1,2,3,4]
let arrayTwo=[1,2,3,4]
let isEqual=false;
if(arrayOne==arrayTwo){
    isEqual=true
}else{
    isEqual=false;
}
console.log(isEqual);
console.log(arrayOne[0]);
console.log(arrayTwo[0]);
arrayOne=arrayTwo
arrayTwo[0]=100
console.log(arrayOne[0]);
console.log(arrayTwo[0]);

function addition(num1,num2){
    if(num1!=typeof(number) || num2!=typeof(number)){
        return ["Error",undefined]
    }
    return [null,num1+num2]
}
let[message,x]=addition('dhruv',5)
// let x=addition('Dhruv',5)

//
// let addition =(num1,num2)=>{ }
// let randomfxn=(param)=>{param()}
//randomfxn(sub)
//randomfxn(addition)