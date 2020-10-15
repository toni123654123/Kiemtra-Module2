package File;

import sever.BookPhone;
import sever.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class WriteContactsFile {
    private static String title = "Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ, Email";
    private File file;

    public WriteContactsFile(String url){
        file = new File(url);
    }
    public void save(){
        List<User> list = BookPhone.getInstance().getLists();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(title);
            bufferedWriter.newLine();
            for (User user: list ){
                bufferedWriter.write(user.getData());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
