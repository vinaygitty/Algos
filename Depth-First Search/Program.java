import java.util.*;

class Program {

  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    // time -  O(v+e) - v vertices and e -edges as we are looping through all egdes in for loop for each vertex.
    // Space - O(v) 
    public List<String> depthFirstSearch(List<String> array) {
      array.add(this.name);
      for(int i = 0; i < children.size(); i++){
        children.get(i).depthFirstSearch(array);
      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
