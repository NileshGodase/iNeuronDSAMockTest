import java.util.*;

public class FirstUniqueCharacter
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
		String word = sc.next();
    
		System.out.println(getFirstUniqChar(word));;
	}
	
	
	public static int getFirstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
	
}
