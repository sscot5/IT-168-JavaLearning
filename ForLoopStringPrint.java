//print all of the vowels in a string in the order in which they appear

public class ForLoopStringPrint {
    public static void main(String[] args) {
        String str = "Stephanie";
        int length = str.length();

        for (int i = 0; i < length; i++){
            char ch = str.charAt(i);
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch);
            }
        }

        for (int i = 1; i <= 3; i++){ // this loop executes 3 times
            for (int j = 1; j <= 4; j++){ // this loop executes 4 times
                System.out.println(j); // prints 12 lines --> (3 * 4)
            }
        }
    } 
}
