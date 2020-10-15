package sever;

import java.util.Scanner;

public class UserSever {
    Scanner scanner;
    private static UserSever instance;
    private BookPhone bookPhone;
    private Validation validation;

    private UserSever() {
        scanner = new Scanner(System.in);
        bookPhone = BookPhone.getInstance();
    }

    public static UserSever getInstance() {
        if (instance == null) {
            instance = new UserSever();
        }
        return instance;
    }

    public void Showmenu() {
        System.out.println("\n------ CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ------");
        System.out.println("Chọn chức năng (theo số) để tiếp tục:");
        System.out.println("1: Xem danh sách.");
        System.out.println("2: Thêm mới.");
        System.out.println("3: Cập nhật.");
        System.out.println("4: Xóa.");
        System.out.println("5: Tìm kiếm.");
        System.out.println("6: Đọc từ File.");
        System.out.println("7: Ghi vào File.");
        System.out.println("8: Thoát.");
        System.out.print("Chọn chức năng: ");
        onSelect(scanner.nextLine());

    }

    public void showMenu() {
        System.out.println("\n------------Danh bạ hiện tại-------------");
        if (bookPhone.size() == 0){
            System.out.println("Danh bạ trống");
        }else {
            bookPhone.show();
        }
    }
    private void addMenu(){
        System.out.println("\n---------Thêm mới-----------");
        String phone = null;
        String gruop = null;
        String name = null;
        String sex = null;
        String address = null;
        String email = null;
        boolean vail = false;
        while (vail == false){
            System.out.println("Số điện thoại: ");
            phone =scanner.nextLine();
            phone = phone.trim();
            if (phone.length() >1 && validation.equals(phone) && validation.validCheck(phone)){
                vail = true;
            }else {
                System.out.println("Số điên thoại không hợp lệ");
            }
        }while (vail == false){
            System.out.println("Nhóm");
            gruop = scanner.nextLine();
            gruop = gruop.trim();
            if (gruop.length()>1 && validation.validCheck(gruop)){
                vail=true;
            }else {
                System.out.println("Nhóm không hợp lệ");
            }
        }while (vail == false){
            System.out.println("Tên");
            name = scanner.nextLine();
            name = name.trim();
            if (name.length()>1 && validation.validCheck(name)){
                vail=true;
            }else {
                System.out.println("Tên không hợp lệ");
            }
        }while (vail == false){
            System.out.println("Giới tính");
            sex= scanner.nextLine();
            sex = sex.trim();
            if (sex.length()>1 && validation.validCheck(sex)){
                vail=true;
            }else {
                System.out.println("Phi giới tính");
            }
        }



    }

    private void onSelect(String select) {
        switch (select) {
            case "1":
                showMenu();
                break;
            case "2":
                addMenu();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
        }

    }
}
