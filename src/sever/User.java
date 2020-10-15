package sever;

public class User {
    private String phone;
    private String group;
    private String name;
    private String sex;
    private String adderss;
    private String email;

    public User(String line) {
        String[] data = line.split(",");
        this.phone = data[0];
        this.group = data[1];
        this.name = data[2];
        this.sex = data[3];
        this.adderss = data[4];
        this.email = data[5];
    }
    public String getData(){
        return phone + "," + group + "," + name + "," + sex + "," + adderss + "," + email;
    }

    public User(String phone, String group, String name, String sex, String adderss, String email) {
        this.phone = phone;
        this.group = group;
        this.name = name;
        this.sex = sex;
        this.adderss = adderss;
        this.email = email;
    }
    public void update(String phone, String group, String name, String sex, String adderss, String email){
        this.phone = phone;
        this.group = group;
        this.name = name;
        this.name = sex;
        this.adderss = adderss;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserSever{" +
                "phone='" + phone + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", adderss='" + adderss + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
