package Login_app.models;

public class Profile {
    String fullName, hoby, nickname;
    int age;


    public Profile(){

    }

    public Profile(String fullName, int age, String hoby, String nickName){
        this.fullName = fullName;
        this.age = age;
        this.hoby = hoby;
        this.nickname = nickName;
    }

    public String getFullName() {
        //         String [] pisah = fullName.split(" ");
        // for (int i = 0; i < pisah.length; i++) {
        //     pisah[i] = Character.toUpperCase(pisah[i].charAt(0)) + pisah[i].substring(1);
        // }
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickName) {
        this.nickname = nickName;
    }
}