package login_app.models;

public class Profile {
    String fillname, hobbey, nickname;
    int age;
    public String getFullname() {
        return fillname;
    }
    public void setFullname(String fillname) {
        this.fillname = fillname;
    }
    public String getHobby() {
        return hobbey;
    }
    public void setHobby(String hobbey) {
        this.hobbey = hobbey;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }   
}
