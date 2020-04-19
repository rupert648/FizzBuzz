
import java.util.HashMap; // import the HashMap class
import java.util.Map;

class Main {

    public static void main(String[] args) {

        Map<Integer, String> numbWord = new HashMap<Integer, String>();

        numbWord.put(3, "Fizz");
        numbWord.put(7, "Buzz");

        for (int i = 1; i < 101; i++) {
            String output = ""; //we want to make this as editable in the future as possible

            for (Map.Entry<Integer,String> entry : numbWord.entrySet()) {
                if ( i % entry.getKey() == 0) {
                    output += entry.getValue();
                }
            }

            if (output == "") { output = Integer.toString(i);}
            System.out.println(output);
        }

    }
}