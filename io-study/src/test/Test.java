package test;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File folder = new File("F://upload");
        if(!folder.exists()) {
            folder.mkdir();
        }

    }
}
