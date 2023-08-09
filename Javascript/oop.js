class student{  
    ageCount()  
    {  
        return new Date().getFullYear() - this.DOB.getFullYear()  
    }  
    
    gradeAssign()  
    {  
        let grade=[];
        for(let i=0;i<this.marks.length;i++)  
        {  
            if(this.marks[i]>70)  
            {  
                grade.push("A")  
            }  
            if(this.marks[i]<70 && this.marks[i]>35)  
            {  
                grade.push("B")  
            }  
            if(this.marks[i]<35)  
            {  
                grade.push("C")  
            }  
        }  
        return grade;  
    }  
    avgFinalGrade()  
    {  
        if(this.avgmarks>70)  
            {  
                return "A"  
            }  
        if(this.avgmarks<70 && this.avgmarks>35)  
            {  
                return "B"  
            }  
        if(this.avgmarks<35)  
            {  
                return "C"  
            }  
    }  
    getFullName()  
    {  
        return this.firstName + " " +this.lastName; 
    }  
    
}  
  
  
// const date =new Date("2002-01-09")  
let s1 = new student("Dhruv","Karotra","43",[100,60,100],"2001-02-05")  
let s2 = new student("Susminder","Minder","44",[50,60,50],"2001-03-04")  

// console.log("s1 : Full Name :",s1.getFullName());
// console.log("s1 : Average : ",s1.avgMarks());
// console.log("s1",s1.gradeAssign());
// console.log("s1 :",s1.ageCount());

console.log(s1);
  
temp=s1;
s1=s2;  
s2=temp;  

console.log("After Swapping")
  
// console.log("s1 : Full Name :",s1.getFullName());
// console.log("s1 : Average : ",s1.avgMarks());
// console.log("s1",s1.gradeAssign());
// console.log("s1 :",s1.ageCount());
// console.log(s1.DOB);