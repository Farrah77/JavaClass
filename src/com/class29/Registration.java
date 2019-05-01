package com.class29;

public class Registration {

    private String email, userName, password;
    
    public void setEmail(String email) {
        if (email.contains("gmail")) {
            this.email=email;
        }
    }
    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length()>6) {
            this.userName=userName;
        }
    }
    public void setPassword(String password) {
        if (!password.isEmpty() && password.length()>6 && (!password.contains(userName))) {
            this.password=password;
        }
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    
}