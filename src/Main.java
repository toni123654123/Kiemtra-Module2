import sever.UserSever;

public class Main {
    public static void main(String[] args) {
        while (true) {
            UserSever.getInstance().showMenu();
        }
    }

}
