package JavaPractice;
//387. First Unique Character in a String

public class firstUniqueChar {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<=1) return i;
        }
        return -1;
    }
}
