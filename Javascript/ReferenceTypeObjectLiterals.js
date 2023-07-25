// add, subtrsct,mul div of variable number of inputs
// create generator fn which return above 4 using switch         default returns error message that fn is not available

let VariableNumbersAddition=(...numbers)=>{
    let numbersSum=0;
    for(let i=0;i<numbers.length;i++){
        if(typeof numbers[i]=='number'){
            numbersSum+=numbers[i];
        }
        else{
            return "Invalid Input";
        }
    }
    return numbersSum;
}

let VariableNumbersSubtraction=(...numbers)=>{
    let numbersSubtraction=numbers[0];
    for(let i=1;i<numbers.length;i++){
        if(typeof numbers[i]=='number'){
            numbersSubtraction-=numbers[i];
        }
        else{
            return "Invalid Input";
        }
    }
    return numbersSubtraction;
}

let VariableNumbersMultiplication=(...numbers)=>{
    let numbersMultiplication=1;
    for(let i=0;i<numbers.length;i++){
        if(typeof numbers[i]=='number'){
            numbersMultiplication*=numbers[i];
        }
        else{
            return "Invalid Input";
        }
    }
    return numbersMultiplication;
}

let VariableNumbersDivision=(...numbers)=>{
    let numbersDivision=numbers[0];
    for(let i=0;i<numbers.length;i++){
        if(typeof numbers[i]=='number'){
            numbersDivision/=numbers[i];
        }
        else{
            return "Invalid Input";
        }
    }
    return numbersDivision;
}

let defaultFunction=(...numbers)=>{
    return "Invalid function from user";
}

let functionGenerator = (functionName)=>{
    switch(functionName){
        case "addition" : return VariableNumbersAddition;
        case "subtraction" : return VariableNumbersSubtraction;
        case "multiplication" : return VariableNumbersMultiplication;
        case "division" : return VariableNumbersDivision;
        default : return defaultFunction;
    }
}

let add=functionGenerator("addition");
let x=add(1,2,3,4);
console.log(x);

let subtract=functionGenerator("subtraction");
let y=subtract(1,2,3,4);
console.log(y);

let multiplication=functionGenerator("multiplication");
let z=multiplication(1,2,3,4);
console.log(z);

let division=functionGenerator("addition");
let p=division(1,2,3,4);
console.log(p);






