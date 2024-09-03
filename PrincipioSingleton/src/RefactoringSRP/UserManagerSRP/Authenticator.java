package RefactoringSRP.UserManagerSRP;

public class Authenticator {
    public boolean authenticate(UserManager userManager,String username, String password) {
        User user = userManager.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Autenticacion completada :)");
            return true;
        } else {
            System.out.println("Autenticacion incorrecta");
            return false;
        }
    }

}
