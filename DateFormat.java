public class DateFormat {
    public static void main(String[] args) {
        String date = "mm/dd/yyyy";
        String[] arrOfDate = date.split("/", 3); // ["mm", "dd", "yyyy"]
        // for (String a : arrOfDate) {
        //     System.out.println(a);
        // }

        String year = "yyyy";
        System.out.println(year.equals(arrOfDate[2]));
        // year === arrOfDate[2]
    }
    
}
