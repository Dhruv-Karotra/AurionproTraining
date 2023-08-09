class User{
    constructor(id,name,role){
        this.id=id;
        this.name=name;
        this.role=role;
    }

    static users=[];

    static createUser(id,name,role){
        if(typeof id!='number'){
            return "Invalid user id";
        }
        if(typeof name!='string'){
            return "Invalid user name";
        }
        if(typeof role!='string'){
            return "Invalid user role";
        }
        if(role!="admin" && role!="user"){
            return "Invalid user role, please enter a valid role!";
        }

        const newUser=new User(id,name,role);
        this.users.push(newUser);
        //return new User(id,name,role);
    }

    static readUser(userId){
        return this.users.find((user)=>user.id==userId);
    }

    static updateUser(userId,updatedName,updatedRole){
        const updateUser=this.readUser(userId);
        if(userToUpdate){
            updateUser.name=updatedName;
            updateUser.role=updatedRole;
            return updateUser;
        }
        return null;
    }

    static deleteUser(userId){
        const idOfUserToDelete=this.users.find((user)=>user.id==userId);
        this.users.splice(idOfUserToDelete,1);
        return true;
    }


}

let e1=User.createUser(1,"Dhruv","admin");
console.log(e1);
// class Contact{
// }

// class ContactDetails{
//     constructor(phone,email){
//         this.phone=phone;
//         this.email=email;
//     }
// }