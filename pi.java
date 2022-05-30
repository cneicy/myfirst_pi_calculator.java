import java.util.Scanner;
public class pi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of decimal places for pi:");
        String str1 = scan.next();
        if(str1.equals("0")){
            System.out.println("3");
        }
        if(str1.equals("1")){
            System.out.println("3.1");
        }
        if(str1.equals("2")){
            System.out.println("3.14");
        }
        if(str1.equals("3")){
            System.out.println("3.141");
        }
        if(str1.equals("4")){
            System.out.println("3.1415");
        }
        if(str1.equals("5")){
            System.out.println("3.14159");
        }
        if(str1.equals("6")){
            System.out.println("3.141592");
        }
        if(str1.equals("7")){
            System.out.println("3.1415926");
        }
        if(str1.equals("8")){
            System.out.println("3.14159265");
        }
        if(str1.equals("9")){
            System.out.println("3.141592653");
        }
        if(str1.equals("10")){
            System.out.println("3.1415926535");
        }
        if(str1.equals("11")){
            System.out.println("3.14159265358");
        }
        if(str1.equals("12")){
            System.out.println("3.141592653589");
        }
        if(str1.equals("13")){
            System.out.println("3.1415926535897");
        }
        if(str1.equals("14")){
            System.out.println("3.14159265358979");
        }
    }
}
