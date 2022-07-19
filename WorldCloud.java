import java.util.LinkedHashMap; 
import java.util.Map;
import java.util.Scanner;

class WordCloud{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().trim().split(" ");
        String word  = sc.nextLine();
        
        while(!word.contains("fim")) {
        	System.out.println(getFrequency(word, countFrequency(words)));
        	word = sc.nextLine();
        }
    }

    static Map<String, Integer> countFrequency(String[] words) {
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (String word : words) {
            if(frequency.containsKey(word)) {
                int count = frequency.get(word);
                frequency.put(word, count + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        
        return frequency;
    }
    
    static Integer getFrequency(String word, Map<String, Integer> frequency ) {
    	return frequency.get(word);
    }   
}
