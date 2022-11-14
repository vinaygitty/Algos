

import java.util.*;

class Program {
  
  // O(2^n) Time | O(n) Space
  public static int getNthFib(int n) {
    if (n == 2 ){
      return 1;
    } else if ( n ==1 ){
      return 0;
    } else {
      return getNthFib(n-1) + getNthFib(n-2);
    }
  }
  
  // Alternate approach - optimized for time and space
  
  // O(n) Time | O(1) Space
   public static int getNthFib2(int n) {
   int[] lastTwo = {0,1};
   int counter = 3;

   while (counter <= n){
     int nextFib  = lastTwo[0]+lastTwo[1];
     lastTwo[0] = lastTwo[1];
     lastTwo[1] = nextFib;
     counter++;
   }
    return n > 1 ? lastTwo[1] : lastTwo[0];
  }
  
  
  
}
