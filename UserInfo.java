public class UserInfo {

    private String name;
    private int age;
    private String email;
    private boolean isActive;


    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }

    public boolean getIsActive() {
        return isActive;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Active: " + isActive);

    }


    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Razan", 23, "razan@gmail.com", true);
        UserInfo user2 = new UserInfo("Reem", 15, "reem@gmail.com", false);
        UserInfo user3 = new UserInfo("Mohammed", 14, "mohammed@gmail.com", true);

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();


        user1.setName("RAZAN");
        user1.setActive(false);

        System.out.println("Updated user1 info:");
        user1.displayInfo();
    }
}
