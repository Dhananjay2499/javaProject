//Enum outside Class
enum Season {WINTER, SPRING, SUMMER, FALL}

public class enumExample {
    //Enum outside main()
    public  enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV, DEC}

    public static void main(String[] arg) {
        enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

//Access content in an Enum
        Days d = Days.FRIDAY;
        System.out.println(d);

//Access the Enum within main()
        for (Days dys : Days.values()) {
            System.out.print(dys + " ");
        }
        System.out.println();

//Access the Enum outside main()
        for (Month m : Month.values()) {
            System.out.print(m + " ");
        }
        System.out.println();

//Access the Enum outside Class
        for (Season s : Season.values()) {
            System.out.print(s + " ");
        }
    }
}

