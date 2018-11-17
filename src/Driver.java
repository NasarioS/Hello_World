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
        checkI[0]  = (num)-> num == 1981;
        checkI[1] = (num)-> num == 1997;
        checkI[2] = (num)-> num == 2005;
        checkS[0] = (s)-> s == "Lava Pit";
        checkS[1] = (s) -> s == "Adorable";
        checkS[2] = (s) -> s == "Where are You";


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