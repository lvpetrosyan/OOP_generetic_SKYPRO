package LoginPassword;


public class CorrectInfo {
    private static final String VALID_CHARACTE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789_";


    public static boolean validateCheck(String confirmPassword, String password, String login) {
        try {
            check(confirmPassword, password, login);
        } catch (WrongPasswordException | LoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;

    }

    public static void check(String confirmPassword, String password, String login)
            throws WrongPasswordException, LoginException{
        if (!examinate(password)) {
            throw new WrongPasswordException("Некорректный пароль");
        }
        if (!examinate(login)) {
            throw new LoginException("Некоррктный логин");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }

    public static boolean examinate(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTE.contains(String.valueOf(s.charAt(i))))
                return false;

        }
        return true;


    }
}
