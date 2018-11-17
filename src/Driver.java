import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Driver{
    public static void main(String []arg){
        List<String> stringList = new ArrayList<String>();
        List<Integer> intList =  new ArrayList<Integer>();
        intList.add(1981);
        intList.add(1982);
        intList.add(1996);
        intList.add(1997);
        intList.add(2000);

        stringList.add("Lava Pit");
        stringList.add("Why Not?");
        stringList.add("I Got One of These");
        stringList.add("Adorable");
        stringList.add("No No Noooooooo");
        Predicate<Integer> []checkI = new Predicate[3];
        Predicate<String> []checkS = new Predicate[3];
        checkI[0] = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if(num == 1981)
                    return true;
                return false;
            }
        };
        checkI[1] = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if(num == 1997)
                    return true;
                return false;
            }
        };
        checkI[2] = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if(num == 2003)
                    return true;
                return false;
            }
        };
        checkS[0] = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s == "Lava Pit")
                    return true;
                else
                    return false;
            }
        };
        checkS[1] = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s == "Adorable")
                    return true;
                else
                    return false;
            }
        };
        checkS[2] = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s == "Where are You")
                    return true;
                else
                    return false;
            }
        };
        checkS[0] = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s == "Lava Pit")
                    return true;
                else
                    return false;
            }
        };

        for(int i = 0; i < 3; i++) {
            print(linearSearch(intList, checkI[i]), intList);
            print(linearSearch(stringList, checkS[i]), stringList);
        }
    }

    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        boolean test;
        for(int i = 0; i < list.size(); i++){
            test = check.test(list.get(i));
            if(test)
                return i;
        }
        return -1;
    }
    public static <T> void print(int index, List<T> list){
        if(index < 0)
            System.out.println("OBJECT NOT FOUND");
        else
            System.out.println("Your Object is at Position: " + index + ", Here is your Object: " + list.get(index));
    }

}