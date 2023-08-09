class EmployeeDhruv{
    constructor(fname,lname,eId,salaryPM,designation,department,contactNo,personalEmail,workEmail,DOB,DOJ,DOR,
        personalAddress,personalCity,personalCountry,officeAddress,officeCity,officeCountry, 
        age,fullName, annualSalary,totalCampusExperience){
            this.firstName=fname;
            this.lastName=lname;
            this.eId=eId;
            this.salaryPM=salaryPM;
            this.designation=designation;
            this.department=department;
            this.contactNo=contactNo;
            this.personalEmail=personalEmail;
            this.workEmail=workEmail;
            this.DOB=DOB;
            this.personalAddress=personalAddress;
            this.personalCity=personalCity;
            this.personalCountry=personalCountry;
            this.officeAddress=officeAddress;
            this.officeCity=officeCity;
            this.officeCountry=officeCountry;

            this.DOJ=DOJ;
            this.DOR=DOR;

            this.fullName=fullName;
            this.age=age;
            this.annualSalary=annualSalary;
            this.totalCampusExperience=totalCampusExperience;
        }

        static newEmployee(fname,lname,eId,salaryPM,designation,department,contactNo,personalEmail,workEmail,DOB,DOJ,DOR,
            personalAddress,personalCity,personalCountry,officeAddress,officeCity,officeCountry){

                if(typeof fname!='string'){
                    return "Invalid first name";
                }
                if(typeof lname!='string'){
                    return "Invalid last name";
                }
                if(typeof eId!='number'){
                    return "Invalid Employee ID";
                }
                if(typeof salaryPM!='number'){
                    return "Invalid salary per month";
                }
                if(typeof designation!='string'){
                    return "Invalid designation";
                }
                if(typeof department!='string'){
                    return "Invalid department";
                }
                if(typeof contactNo!='number'){
                    return "Invalid contact number";
                }
                if(typeof personalEmail!='string'){
                    return "Invalid personal email";
                }
                if(typeof workEmail!='string'){
                    return "Invalid workEmail";
                }
                let dob=new Date(DOB);
                if(typeof dob=='Invalid Date'){
                    return "Invalid Date";
                }
                let doj=new Date(DOJ);
                if(typeof doj=='Invalid Date'){
                    return "Invalid Date";
                }
                let dor=new Date(DOR);
                if(typeof dor=='Invalid Date'){
                    return "Invalid Date";
                }
                console.log(dob);
                console.log(doj);
                console.log(dor);

                if(typeof personalAddress!='string'){
                    return "Invalid personal address";
                }
                if(typeof personalCity!='string'){
                    return "Invalid personal city";
                }
                if(typeof personalCountry!='string'){
                    return "Invalid personal country";
                }
                if(typeof officeAddress!='string'){
                    return "Invalid office address";
                }
                if(typeof officeCity!='string'){
                    return "Invalid office city";
                }
                if(typeof officeCountry!='string'){
                    return "Invalid office country";
                }
// age,fullName, annualSalary,DOJ,DOR,totalCampusExperience
                let age=Employee.calcAge(DOB);
                let fullName=Employee.calcFullName(fname,lname);
                let annualSalary=Employee.calcAnnnualSalary(salaryPM);
                let totalCampusExperience=Employee.calcTotalCampusExperience(DOR,DOJ);

                return new Employee(fname,lname,eId,salaryPM,designation,department,contactNo,personalEmail,workEmail,dob,
                    DOJ,DOR,personalAddress,personalCity,personalCountry,officeAddress,officeCity,officeCountry, 
                    age,fullName,annualSalary,doj,dor,totalCampusExperience);
            }

            static calcFullName(fname,lname){
                return fname+" "+lname;
            }

            static calcAnnnualSalary(salaryPM){
                return 12*salaryPM;
            }

            static calcDOJ(DOJ){
                let d=new Date(DOJ);
                return d.getFullYear();
            }
            static calcDOR(DOR){
                let d=new Date(DOR);
                return d.getFullYear();
            }

            static calcTotalCampusExperience(DOJ,DOR){
                // let doj=new Date(DOJ);
                // let dor=new Date(DOR);
                //return dor.getFullYear()-doj.getFullYear();
                return (Employee.calcDOR(DOR)-Employee.calcDOJ(DOJ));
            }

            static calcAge(DOB){
                let d=new Date(DOB);
                return new Date().getFullYear() - d.getFullYear();
            }

            setManager(obj) {
                // console.log("inside setmanager");
                // console.log(obj);
                // console.log(obj.constructor);
                if (obj.constructor == Employee) {
                    this.reportingOfficer = obj
                }
                else {
                    console.log("Invalid Manager Input");
                    return "Invalid Manager Input"
                }
            }

            pushSubordinates(obj) {
                if (obj.constructor == Employee) {
                    this.subordinates.push(obj)
                }
                else{
                    console.log("Invalid Subordinate");
                    return "Invalid Subordinate"
                }
        
            }

}
//fname,lname,eId,salaryPM,designation,department,contactNo,personalEmail,workEmail,DOB,
//personalAddress,personalCity,personalCountry,officeAddress,officeCity,officeCountry
let e1 = Employee.newEmployee("Dhruv","Karotra",1,20000,"Trainee","Cash Management",9999988888,"dk@gmail.com",
                                "dk@aurionpro.com","2001-02-05","2022-02-05","2024-02-05","here_address","Navi Mumbai","India",
                                "here office address","Navi Mumbai","India");
let manager = Employee.newEmployee("Manager", "man", 321, 50, "Engg", "Manager", 8989898989, "manager@gmail.com", "manager@aurionpro.com", "01/01/1990", "xdassx", "thane", "india", "aurionpro","7/7/2020")
let subordinate1 = Employee.newEmployee("subordinate1", "Tan", 123, 20, "Engg", "Support", 9898989898, "subordinate1@gmail.com", "subordinate1@aurionpro.com", "1/1/2000", "Near South pole,Antartica-609609", "Polar Bear District", "Antartica", "aurionpro","7/7/2020")
let subordinate2 = Employee.newEmployee("subordinate2", "Tan", 123, 20, "Engg", "Support", 9898989898, "subordinate2@gmail.com", "subordinate2@aurionpro.com", "1/1/2000", "Near South pole,Antartica-609609", "Polar Bear District", "Antartica", "aurionpro","7/7/2020")
let subordinate3 = Employee.newEmployee("subordinate3", "Tan", 123, 20, "Engg", "Support", 9898989898, "subordinate3@gmail.com", "subordinate3@aurionpro.com", "1/1/2000", "Near South pole,Antartica-609609", "Polar Bear District", "Antartica", "aurionpro","7/7/2020")
                                
console.log(e1);
console.log(Employee.calcAge("2022-02-05"));
console.log(Employee.calcDOJ("2022-02-05"));
console.log(Employee.calcDOR("2022-02-05"));