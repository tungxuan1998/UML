import java.io.File;
import java.util.Scanner;

public class FirstAttempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File folder;
        if (args.length != 0) folder = new File(args[0]);
        else folder = new File(sc.nextLine());

        //PrintStuffInside(folder);
        System.out.println(folder.exists());

        Directory test = new Directory(sc.nextLine());
        // test.setSubDirectories();
        test.printContent();
    }
}
