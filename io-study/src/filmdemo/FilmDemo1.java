package filmdemo;

import java.io.File;
import java.io.IOException;

public class FilmDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/README.md");
        //判定如果if不存在，则创建新文件
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
