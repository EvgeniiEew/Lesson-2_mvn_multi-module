package by.home.user;

public class Passport {
    private String number = "1";
    private User user;


    public String getNumberUser() {
        return this.number.concat(user.getId());
    }
}
