import javax.xml.transform.Source;

class Solution {
    public static char mostFrequentChar(String s) {
      // initialize babbby
      char mostFrequent = s.charAt(0);
      int maxCount = 0;

      // iterate through each character dude
      for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        int currentCharCount = 1;

        // counter loopiedo doobie boobie do
        for (int j = i + 1; j < s.length(); j++) {
          if (s.charAt(j) == currentChar) {
            currentCharCount++;
          }
        }

        // now let's modify the max count broskisisisisisis
        if (currentCharCount > maxCount) {
          mostFrequent = currentChar;
          maxCount = currentCharCount;
        }
      }
      return mostFrequent;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("mississippi"));
      System.out.println(Solution.mostFrequentChar("eleventennine")); 
    }

  }
