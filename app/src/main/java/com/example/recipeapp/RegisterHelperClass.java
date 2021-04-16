package com.example.recipeapp;
//Register Helper class

public class RegisterHelperClass {
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;
    private String phoneNo;

    public RegisterHelperClass(String fullName, String email, String password, String confirmPassword, String phoneNo){
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.phoneNo = phoneNo;
    }
    //Getter
    public String getFullName(){
        return this.fullName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public String getConfirmPassword(){
        return this.confirmPassword;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }

    //Setters
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
}
