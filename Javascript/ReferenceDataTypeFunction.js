let addition =(Number1,Number2)=>{
    if(typeof Number1!='number'|| typeof Number2!='number'){
        return ["Error",undefined]
    }
    return ["Success",Number1+Number2]
}

let subtraction =(Number1,Number2)=>{
    if(typeof Number1!='number'|| typeof Number2!='number'){
        return ["Error",undefined]
    }
    return ["Success",Number1+Number2]
}

 const randomfxn=(param,Number1,Number2)=>{
    return param(Number1,Number2)
 }

let [m,x]= randomfxn(addition,5,6)
console.log(m,x)

let functionGenerator = (FunctionName)=>{
    switch(FunctionName){
        case "addition" : return ["", addition]
        case "subtraction" : return ["", subtraction]
        default : return ["invalid", null]
    }
}

let [mess,add]=functionGenerator("addition")
let p=add(1,2)
console.log(p[1])
