package login_app.models;

public class Profile{
    private String fullName;
    private int age;
    private String hobby;
    private String nickname;

    public Profile(){
        
    }

    public Profile(String fullName, int age, String hobby,String nickname){
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickname = nickname;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    



}
