class Student{
    constructor(fname,lname,roll,marks,DOB,avgMarks,grades,finalGrade,age)  
    {  
        this.firstName=fname;  
        this.lastName=lname;  
        this.rollNo=roll;  
        this.marks=marks;  
        this.avgMarks=avgMarks;  
        this.grades=grades;  
        this.finalGrade=finalGrade;  
        this.DOB=DOB;  
        this.age=age;
    } 

    static newStudent(fname,lname,roll,marks,DOB){

        if(typeof fname!='string'){
            return "Invalid first name";
        }
        if(typeof lname!='string'){
            return "Invalid last name";
        }
        if(typeof roll!='number'){
            return "Invalid roll number";
        }
        for(let i=0;i<marks.length;i++){
            if(typeof marks[i]!='number'){
                return "Invalid marks";
            }
        }
        let dob=new Date(DOB);
        if(typeof dob=='Invalid Date'){
            return "Invalid Date";
        }

        let avgMarks= Student.calcAvgMarks(marks);
        let grades= Student.calcGradeAssign(marks);
        let finalGrade= Student.calcAvgFinalGrade(avgMarks);
        let age= Student.calcAge(DOB);

        return new Student(fname,lname,roll,marks,dob,avgMarks,grades,finalGrade,age);
    }

    static calcAvgMarks(marks){  
        let sum=0;
        for(let i=0;i<marks.length;i++)  
        {  
            sum+=marks[i];
        }  
        return sum/marks.length;    
    }  

    static calcGradeAssign(marks)  
    {  
        let grade=[];
        for(let i=0;i<marks.length;i++)  
        {  
            if(marks[i]>70)  
            {  
                grade.push("A"); 
            }  
            if(marks[i]<70 && marks[i]>35)  
            {  
                grade.push("B");
            }  
            if(marks[i]<35)  
            {  
                grade.push("C"); 
            }  
        }  
        return grade;  
    }  

    static calcAvgFinalGrade(avgMarks)  
    {  
        if(avgMarks>70)  
            {  
                return "A";
            }  
        if(avgMarks<70 && avgMarks>35)  
            {  
                return "B"; 
            }  
        if(avgMarks<35)  
            {  
                return "C"; 
            }  
    }  

    static calcAge(DOB)  
    {  
        let d= new Date(DOB)
        return new Date().getFullYear() - d.getFullYear();
    }  

    
}

let s1 = Student.newStudent("Dhruv","Karotra",43,[100,60,100],"2001-02-05");
console.log(s1);