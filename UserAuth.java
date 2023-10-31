package mavenproject;

public class UserAuth {
	private static final String STORED_USERNAME = "ram";
    private static final String STORED_PASSWORD = "3025";

    public static boolean authenticate(String username, String password) {
        return username.equals(STORED_USERNAME) && password.equals(STORED_PASSWORD);
    }


}
