const myFunction=(callBackFunction)=>{
    console.log("Hiiii");
    let num=10;
    callBackFunction(num);
};

myFunction(function(value){
    console.log(value);
});

let alphabets=["a","b","e","f","d"];
alphabets.forEach((a,index)=>{
    console.log(a,index);
});


// const ul=document.querySelector("ul");
// console.log(ul);

// let html=``;
// alphabets.forEach((a,index)=>{
//     html +=`<li>${alphabets}</li>`;
// });

// ul.innerHTML=html;
// console.log(html);

let student={
    id:101,
    name:"Dhruv",
    percentage : 10,
    hobbies : ["Playing","Eating","Sleeping"],
    login : function(){
        console.log("Student logged in");
    },
    logout : function(){
        console.log("Student logged out");
    },
    printHobbies : function(){
        console.log(this.hobbies);
    }
};

console.log(student['id']);
student.login();
student.printHobbies();
console.log(this);

let students=[
    {
        id : 101,
        firstName : "Dhruv",
        lastName : "Karotra",
        email : "abc@gmail.com",
    },
    {
        id : 102,
        firstName : "Ujjwal",
        lastName : "Jha",
        email : "abcde@gmail.com",
    },
    {
        id : 103,
        firstName : "Jigna",
        lastName : "Karotra",
        email : "abcdefg@gmail.com",
    }];

    function createTable() {
        let tableBody = document.querySelector("#studentTable tbody");
        let tableHTML = "";
    
        students.forEach(student => {
            tableHTML += `<tr>
                            <td>${student.id}</td>
                            <td>${student.firstName}</td>
                            <td>${student.lastName}</td>
                            <td>${student.email}</td>
                          </tr>`;
        });
        tableBody.innerHTML = tableHTML;
    }
    createTable();
    
    
    
    
    
    