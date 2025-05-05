import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Carlos");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }


    }
}