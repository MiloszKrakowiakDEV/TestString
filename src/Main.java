import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String ciag = scanner.nextLine();
        if(ciag.length()>=3){
            String ciag2 = ciag.substring(ciag.length()-2,ciag.length());
            ciag2 = ciag2.concat(ciag.substring(0,ciag.length()-2));
            System.out.println(ciag2);
        }
        else{
            System.out.println("Za krótki ciąg!");
        }

    }
}
