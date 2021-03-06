package by.it.krasutski.jd01_14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {

    public static void main(String[] args) {
        int words = 0, marks = 0;
        Pattern pattern = Pattern.compile("[.,:]");
        Matcher matcher;
        String string, text[];
        String path = System.getProperty("user.dir") + "/src/by/it/krasutski/jd01_14/";
        try (BufferedReader br = new BufferedReader(
                new FileReader(
                        new File(path, "text.txt")))
             ;
             BufferedWriter bw = new BufferedWriter(
                     new FileWriter(
                             new File(path, "resultTaskB.txt")))
        ) {
            while ((string = br.readLine()) != null) {
                text = string.split(" - | ");
                words += text.length;
                matcher = pattern.matcher(string);
                while (matcher.find())
                    marks++;
            }
            System.out.println("words=" + words + ", punctuation marks=" + marks);
            bw.write("words=" + words + ", punctuation marks=" + marks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
