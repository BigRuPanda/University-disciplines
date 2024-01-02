package lab21;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class zadanie4 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Rexroth\\IdeaProjects\\laba4\\src\\lab21");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        for (int i = 0; i < 5; i++) {
            System.out.println(lst.get(i));
        }
    }
}