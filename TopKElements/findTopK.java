import java.util.*;

class findTopK {

    // Brute-Force Solution
    // time complexity of this solution is O(n * k)

    public static ArrayList<Integer> findTopKf1(ArrayList<Integer> input, int k) {
        ArrayList<Integer> array = new ArrayList<>(input);
        ArrayList<Integer> topKList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int maxIndex = 0;

            for (int j = 1; j < array.size(); j++) {
                if (array.get(j) > array.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            topKList.add(array.remove(maxIndex));
        }

        return topKList;
    }

    // Using Priority Queues
    // Time complexity : O(n * log k) 
    public static ArrayList<Integer> findTopKf2(ArrayList<Integer> input, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        input.forEach(number -> {
            maxHeap.add(number);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        });

        ArrayList<Integer> topKList = new ArrayList<>(maxHeap);
        Collections.reverse(topKList);

        return topKList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);
        l1.add(1, 8);
        l1.add(2, 1);
        l1.add(3, 18);
        l1.add(4, 11);
        l1.add(5, 28);
        l1.add(6, 31);
        l1.add(7, 48);

        ArrayList<Integer> results = findTopKf1(l1, 4);

        System.out.println(results);

        results = findTopKf2(l1, 4);

        System.out.println(results);
    }

}
