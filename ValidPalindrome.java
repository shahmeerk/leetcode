public class ValidPalindrome  {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        char[] array = s.toCharArray();

        for(int i = 0, j = array.length - 1; i < array.length/2; i++, j--){
            if(array[i] != array[j]){
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("a bba"));
    }
}
