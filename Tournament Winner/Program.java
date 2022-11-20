import java.util.*;

class Program {
  
  // O(n) time | O(k) space ; where n is number of competitions and 
  //  k is number of number of teams

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {


    HashMap<String,Integer> scores = new HashMap<String,Integer>();
    String currentBestTeam = "";
    scores.put(currentBestTeam,0);

    for (int idx = 0; idx < competitions.size(); idx++)
      {
        ArrayList<String> competition = competitions.get(idx);
        String homeTeam = competition.get(0);
        String awayTeam = competition.get(1);
        int result = results.get(idx);

        String winningTeam = (result==1)?homeTeam:awayTeam;

        if(!scores.containsKey(winningTeam)){
          scores.put(winningTeam,0);
        }
        scores.put(winningTeam,scores.get(winningTeam)+3);
        if(scores.get(winningTeam) > scores.get(currentBestTeam)){
          currentBestTeam = winningTeam;
        }
      }
    return currentBestTeam;
  }

}
