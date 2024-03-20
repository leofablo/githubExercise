import java.time.LocalDate;
import java.time.Period;


public class Main {
    static int calculateArea(int width, int height)
    {
        return height * width;
    }

    static int findDiameter(int radius){
        return radius * 2;
    }

//    static int findAngels(int angel1, int angel2){
//        int totalAngel = 180;
//        return totalAngel - (angel1 + angel2);
//
//    }

//    static int findDiffentDate(LocalDate date1, LocalDate date2){
//        Period period = Period.between(date1, date2);
//        return period.getDays();
//    }

    static String getInnitial(String name){
        StringBuilder result = new StringBuilder("");
        String[] split = name.split(" ");
        for(String value : split){
            result.append(value.substring(0,1).toUpperCase());
        }
        return result.toString();

    }
    public static void main(String[] args) {
        int resultCalculateArea = calculateArea(3, 4);
        int resultFindDiameter = findDiameter(5);
//        int resultFindAngels = findAngels(80,65);
        String getInnitialResult = getInnitial("Joe Doe");

//        LocalDate date1 = LocalDate.of(2024, 3, 19);
//        LocalDate date2 = LocalDate.of(2024, 3, 21);
//        int resultFindDiffentDate = findDiffentDate(date1, date2);

        System.out.println(resultCalculateArea);
        System.out.println(resultFindDiameter);
//        System.out.println(resultFindAngels);
//        System.out.println(resultFindDiffentDate);
        System.out.println(getInnitialResult);

    }
}