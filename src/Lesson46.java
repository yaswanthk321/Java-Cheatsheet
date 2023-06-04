import java.io.*;
import java.util.*;

public class Lesson46 {
    public static void main(String[] args) throws IOException {
        System.out.println(" enter the number");

        // BufferedReader bf = null;

        // try with resources it will close it manually
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(Integer.parseInt(bf.readLine()));
        }

        // try with finally we have to close it manually
        // try {
        // bf = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println(Integer.parseInt(bf.readLine()));
        // } catch (IOException e) {
        // e.printStackTrace();
        // } finally {
        // try {
        // bf.close();
        // } catch (IOException e) {
        //
        // e.printStackTrace();
        // }
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.nextInt());
    }
}
