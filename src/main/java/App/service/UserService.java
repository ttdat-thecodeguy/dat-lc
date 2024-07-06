package App.service;

import App.Utils.HashUtils;
import App.model.User;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class UserService {

    public static Map<UUID, User> users = new HashMap<>();


    public UserService () throws NoSuchAlgorithmException {
        UUID id1= UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        UUID id3 = UUID.randomUUID();

        users.put(id1, new User(id1,"dat", "123"));
        users.put(id2, new User(id1,"nam", "123"));
        users.put(id3, new User(id1,"truong", "123"));

    }
    public void fetch () {
        users.forEach((k,v) -> v.toString());
    }

    public boolean register(String username, String password) throws NoSuchAlgorithmException {
        UUID id = UUID.randomUUID();
        User user = new User(id, username, password);
        users.put(id, user);
        return true;
    }

    public boolean login(String username, String password) {
        Collection<User> userList = users.values();
        Optional<User> userOptional = userList.stream().filter(x -> x.getUsername().equals(username)).findAny();
        if (userOptional.isEmpty()) return false;
        User user = userOptional.get();
        return password.equals(user.getPassword());
    }
}
