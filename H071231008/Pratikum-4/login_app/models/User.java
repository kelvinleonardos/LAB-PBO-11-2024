package login_app.models;

public class User {
    private String password;
    public User(String password) {
        this.password = password;
    }
    private String username;
    

    public String getPassword(String key) {
        if(key == password){
        return password;}
        else{return "false";}
    }
    public void setPassword(String key,String password) {
        if(key == password){
            this.password = password;
        }
        else{System.out.println("WRONG KEY");}
        
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
