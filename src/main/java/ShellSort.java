import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShellSort {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4, 2, 5, 1, 3, 10, 8, 6));
        shell_sort(list);
        System.out.println(list);
    }
    
    public static void shell_sort(List<Integer> array) {
        for (int s = array.size() / 2; s > 0; s /= 2) {
            for (int i = s; i < array.size(); ++i) {
                for (int j = i - s; j >= 0 && array.get(j) > array.get(j + s); j -= s) {
                    Collections.swap(array, j, j + s);
                }
            }
        }
    }
}
