import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    int totalSpeed = 0;
    int ridersCount =  redShirtSpeeds.length;

    if (fastest == true)
    {
       for(int i = 0; i<ridersCount; i++  ){
          totalSpeed += Math.max(redShirtSpeeds[i],blueShirtSpeeds[ridersCount-i-1]); 
       }    
    } else {
       for(int i = 0; i<ridersCount; i++  ){
          totalSpeed += Math.max(redShirtSpeeds[i],blueShirtSpeeds[i]); 
       } 
    }
    
    
     return totalSpeed;
  }
}
