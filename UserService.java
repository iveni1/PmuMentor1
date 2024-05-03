import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class UserService {
    protected Map<String, User> users = new HashMap<>();

    public void createUser(String username, String password, String email) {
        users.put(username, new User(username, password, email));
  }
}
