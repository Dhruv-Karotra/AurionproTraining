const obj={
    xyz : function(a,b){return (a+b)}(2,3),      // invoked with parameters(2,3), so a=2,b=3  so 5 is returned

    abc : (a,b)=>{                               // not invoked(i.e not called with parameters), so whole function is printed as output
        return (a+b)} , 
    
    mno: function(a,b){                          // invoked with parameter(a,b) a=2,b=3
        return (function(c,d){                   // inovked with parameter(c,dc=a,d=b
            return c*d;                          // 6
        }(a,b))
    }(2,3),

    pqr: function(a,b){                          
        return (function(c,d){                   
            return c*d;                          
        }(a,b))
    },

    abd: function(a,b){                          
        return (function(c,d){                   
            return c*d;                          
        })
    }(2,3)

}
    

console.log(obj.xyz)
console.log(obj.abc)
console.log(obj.mno)
console.log(obj.pqr)
console.log(obj.abd)



