import java.util.Scanner;

public class hello{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      String name1,name2;
      System.out.print("Enter name of Student :");
      name1 = sc.nextLine();

      System.out.print("Enter name of Student :");
      name2 = sc.nextLine();

      System.out.println("Name1 :"+name1+"\n"+"Name2 :"+name2);
      sc.close();
    }
}