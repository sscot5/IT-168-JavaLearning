public class ForLoops {
    public static void main(String[] args) {
        String[] stringArr = new String[] { "this", "has", "double", "quotes" };

        for (int i = 0; i < stringArr.length; i++)
        {
            log(stringArr[i]);
        }
    }

    public static void log(String msg) {
        System.out.println(msg);
    }
}
