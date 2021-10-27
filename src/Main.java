import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParameterizedInterface howManyK = ((text) -> {
            String txt = text.toString();
            char[] txtTab = txt.toCharArray();
            int counter = 0;
            for (char character : txtTab) {
                if (character == 'k' || character == 'K') {
                    counter++;
                }
            }
            return counter;
        });

        ParameterizedInterface tab0ToN = ((number) -> {
            int n = (int) number;
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                numbers.add(i);
            }

            return numbers;
        });

        System.out.println(howManyK.checkIt("karmelk"));
        Integer number = 5;
        List<Integer> arrayList = (List<Integer>) tab0ToN.checkIt((Integer) 12);

        for (int num : arrayList) {
            System.out.println(num);
        }
    }
}
