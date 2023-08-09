class Student{
    constructor(rollno,firstName,lastName,marks,grade){
        this.rollNo=rollno;
        this.fname=firstName;
        this.lname=lastName;
        this.marks=marks;
        this.avgmarks=0;
        this.grade=[];
    }
        
        calGrade(){
            for(let i=0;i<this.marks.length;i++){
                if(this.marks>80){
                    grade[i].push('A');
                }else if(this.marks>40 && this.marks<80){
                    grade[i].push('B');
                }else{
                    grade[i].push('C');
                }
            }
        }

        avgMarks(){
            console.log(this.marks);
            let sum=0;
            for(let i=0;i<this.marks.length;i++){
                sum+=this.marks[i];
            }
            return sum/this.marks.length;
        }


    getFullName(){
        return this.fname+" "+this.lname;
    }
}
console.log("Before Swapping  : ");
let s1=new Student(1,"Susminder","Minder",[100,50]);
console.log("s1 : Full Name :",s1.getFullName());
console.log("s1 : Average",s1.avgMarks());
console.log("s1",s1.grade());

// let s2=new Student(1,"Dhruv","Karotra",[0,50]);
// console.log("s2",s2.avgmarks());

// console.log("After Swapping  : ");
// let temp=s1;
// s1=s2;
// s2=temp;
// console.log("s1",s1.avgmarks());
// console.log("s2",s2.avgmarks());


