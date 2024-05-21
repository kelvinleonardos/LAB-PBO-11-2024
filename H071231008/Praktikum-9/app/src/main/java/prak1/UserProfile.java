package prak1;

public class UserProfile {
    private String name;
    private String hobby;
    private String gender;
    private String email;
    private String jurusan;
    private int age;

    // Constructor
    public UserProfile(String name, String hobby, String gender, String email, String jurusan, int age) {
        this.name = name;
        this.hobby = hobby;
        this.gender = gender;
        this.email = email;
        this.jurusan = jurusan;
        this.age = age;
    }

    // Default constructor
    public UserProfile() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", age=" + age +
                '}';
    }
}

