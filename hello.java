import java.util.Scanner;

public class hello{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] names = new String[5];

      for(int i=0; i<names.length; i++){
        System.out.print("Enter name of Student"+(i+1)+":");
        names[i] = sc.nextLine();
      }
      
      int i=0;
      while(i<names.length){
        System.out.println("Name of Student "+(i+1)+" is :"+names[i]);
        i++;
      }
      sc.close();
    }
}