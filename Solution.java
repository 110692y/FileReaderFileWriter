import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("c:/java/new.txt", true);
        for (int i=0;i<1;i++)
        fw.write(" ");
        fw.close();

        FileReader fr = new FileReader("c:/java/new.txt");
        Scanner sc = new Scanner(fr);
        int i = 0;
        while (sc.hasNext()){
            System.out.println("String # " + i + ": " + sc.nextLine());
            i++;}
        fr.close();
    }
}
