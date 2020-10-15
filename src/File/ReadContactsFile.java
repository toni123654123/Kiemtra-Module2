package File;

import sever.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadContactsFile {
    private boolean isGetData = false;
    private List<User> list;
    private File file;

    public ReadContactsFile(String url) {
        list = new ArrayList<User>();
        file = new  File(url);
    }

    public boolean exists(){

        return file.exists();
    }
    private void getData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line   = null;
            int countLine = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (countLine > 0) {
                    User contacts = new User(line);
                    list.add(contacts);
                }
                countLine++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        isGetData = true;
    }

    public List<User> getUser() {
        return null;
    }

    public void Show(){
        for (User user : list){
            System.out.println(user);
        }
    }
}
