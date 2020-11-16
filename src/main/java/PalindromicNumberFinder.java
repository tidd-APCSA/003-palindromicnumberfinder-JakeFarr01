public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int number = num + 1;
      while(!(testPalindromicNum(number))) {
        number++;
      }
      return number;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String numString = Integer.toString(num);
      if(numString.equals(reverseNum(num))) {
        return true;
      }
      return false;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String numString = Integer.toString(num);
      String reversed = "";
      for(int i = numString.length() - 1; i >= 0; i--) {
        reversed += numString.charAt(i);
      }
      return reversed;
    }

    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
