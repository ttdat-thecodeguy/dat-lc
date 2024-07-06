package App.model;

import App.Utils.HashUtils;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String password;

    private Long credit = 1000l;

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
    public User(UUID id, String username, String password) throws NoSuchAlgorithmException {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
