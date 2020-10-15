package sever;

import java.util.Scanner;

public class UserSever {
    Scanner scanner;
    private static UserSever instance;
    private BookPhone bookPhone;

    private UserSever(){
        scanner =new Scanner(System.in);
        bookPhone = BookPhone.getInstance();
    }
}
