import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    Arrays.sort(queries);
    int totalWaitTime = 0;
    for (int i = 0 ; i < queries.length; i++)
      {
        int duration = queries[i];
        int queriesleft = queries.length -(i+1);
        totalWaitTime += duration * queriesleft;
      }
    return totalWaitTime;
  }
}
