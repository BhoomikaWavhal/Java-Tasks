import java.util.Scanner;

public class SpacesToUnderscores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str, nstr;
            System.out.print("Enter string: ");
            str = sc.nextLine();
            nstr = str.replace(" ", "_");
            System.out.print("Modified string will be: " + nstr);
        }
}

