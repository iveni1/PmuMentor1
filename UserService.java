import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class UserService {
    protected Map<String, User> users = new HashMap<>();

    public void createUser(String username, String password, String email) {
        users.put(username, new User(username, password, email));
    }
        
    public boolean login(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
  }
    public void updateProfile(String username, String newEmail) {
        User user = users.get(username);
        if (user != null) {
            user.setEmail(newEmail);
        }
        public void deleteUser(String username) {
        users.remove(username);
    }
}
