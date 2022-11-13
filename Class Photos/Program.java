import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {    
      
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    boolean redFirstrow = false;

    if (redShirtHeights.get(0) < blueShirtHeights.get(0)){
       redFirstrow = true;
    }

    if (redFirstrow == true)
    {
      for (int i =0 ; i<redShirtHeights.size(); i++){
        if (redShirtHeights.get(i) >= blueShirtHeights.get(i))
          {
           return false;
          }
      }
    }
    else
    {
      for (int i =0 ; i<redShirtHeights.size(); i++){
        if (redShirtHeights.get(i) <= blueShirtHeights.get(i))
          {
           return false;
          }
      }      
    }
    
    
    return true;
  }
}
