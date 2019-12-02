package Model;

public class Admin extends Orang {
    private String user;
    private String password;

    public Admin(String user, String password, String nama, String keyID) {
        super(nama, keyID);
        this.user = user;
        this.password = password;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
    
}
