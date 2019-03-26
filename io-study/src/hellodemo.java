import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class hellodemo {
    public static void main(String[] args) throws IOException {
        File folder = new File("F://file");
        if(!folder.exists()){
            folder.mkdir();
        }
        File file = new File(folder + "/" + "hello.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
