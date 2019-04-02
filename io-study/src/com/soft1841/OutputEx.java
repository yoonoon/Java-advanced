package com.soft1841;

import java.io.File;
import java.io.IOException;

public class OutputEx {
    public static void main(String[] args) throws IOException {
        String str = "I Love Jave";
        File file = new File("F:\\out.txt");
        if (!file.exists()){
            file.createNewFile();
        }

    }
}
