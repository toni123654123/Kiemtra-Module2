package sever;

import java.util.ArrayList;
import java.util.List;

public class BookPhone {
    private static BookPhone instance;
    private List<User> list;

    private BookPhone() {
        list = new ArrayList<User>();
    }

    public static BookPhone getInstance() {
        if (instance == null) {
            instance = new BookPhone();
        }
        return instance;
    }

    public User seachPhone(String phone) {
        for (User user : list) {
            if (user.getPhone().equals(phone)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        list.add(user);
    }

    public void addAllUser(User user) {
        this.list.addAll(list);
    }

    public void remoteUser(User user) {
        list.remove(user);
    }
    public void remoteUser(String phone){
    }
    public void show(){
        for (User user:list){
            System.out.println(user);
        }
    }
    public void show(List<User> lists){
        for (User user: lists){
            System.out.println(user);
        }
    }

    public int size() {
        return list.size();

    }

    public List<User> getLists()
    {
        return list;

    }
    public List<User> search(String query){
        List<User> searchs = new ArrayList<User>();
        for (User contacts: list){
            int checkPhone   = contacts.getPhone().compareTo(query);
            int checkGroup   = contacts.getGroup().compareTo(query);
            int checkName    = contacts.getName().compareTo(query);
            int checkAddress = contacts.getAdderss().compareTo(query);
            int checkEmail   = contacts.getEmail().compareTo(query);

            if (checkPhone > -10 && checkPhone < 10){
                searchs.add(contacts);
            }else if(checkGroup > -10 && checkGroup < 10){
                searchs.add(contacts);
            }else if(checkName > -10 && checkName < 10){
                searchs.add(contacts);
            }else if(checkAddress > -10 && checkAddress < 10){
                searchs.add(contacts);
            }else if(checkEmail > -10 && checkEmail < 10){
                searchs.add(contacts);
            }
        }

        return searchs;
    }
}
