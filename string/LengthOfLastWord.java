package string;

public class LengthOfLastWord {
    // Reverse Traversal Approach..........
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                count++;
            }else{
                if(count > 0){
                    return count;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(s));

    }
}
