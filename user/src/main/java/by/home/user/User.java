package by.home.user;


import by.home.library.Lib;

public class User {
    private String  id;
    private String firstName;
    private String lastName;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNameCatalogs(Lib lib) {
        return lib.getNameOfElectronicCatalogs();
    }

}
