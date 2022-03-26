package com.syntax.JavaProject02;

public interface CodingTask4 {
/*
   Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also
valid password cannot contain userName
     */
}
class Registration{
    String email;
    String userName;
    String password;

    public void setEmail(String email) {
        if(email.contains("yahoo")){
            this.email=email;
            System.out.println("Your email is "+ this.email);
        }else{
            System.out.println("Invalid email.Only yahoo email allowed");
        }
    }
    public void setUserName(String userName){
    if(!userName.isEmpty() && userName.length()>6){
        this.userName=userName;
        System.out.println("Your username is "+this.userName);
    }else{
        System.out.println("Username is not valid. Please try again");
    }
}
public void setPassword(String password){
    if(!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
        this.password=password;
        System.out.println("Your password is acceptable");
    }else{
        System.out.println("Your password does not pass the criteria. Please try again");
    }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setEmail("joeschmoe@yahoo.com");
        registration.setUserName("Usernameisusername");
        registration.setPassword("trythispassword1234");

        Registration registration1=new Registration();
        registration1.setEmail("newemail@gmail.com");
        registration1.setUserName("");
        registration1.setUserName("Bob");
        registration1.setUserName("Bob123");

        registration1.setPassword("");
        registration1.setPassword("lololol");
        registration1.setPassword("bob12344507");
        registration1.setPassword("password123445667!!@#");
    }
}