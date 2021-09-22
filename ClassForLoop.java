public class ClassForLoop {
   public static void main(String[] args) {
    int first = 7;
    int second = 12;
    int sum = 0;
   
    for (int i = first; i <= second; i++){
        sum = sum + i;
    }
    System.out.println("The sum is: " + sum);
   }
} 
