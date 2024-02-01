package Task1;

import java.util.*;

public class TopKFrequentElements {

    class Node{
        int num;
        int freq;


        public Node(int num, Integer freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> hashMap =  new HashMap<>();

        Comparator<Node> lengthComparator = (n1, n2) -> n2.freq  -  n1.freq;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(lengthComparator);

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0) +1);
        }

        for (int num : hashMap.keySet()) {
            priorityQueue.add(new Node(num,hashMap.get(num)));
        }

        int[] list = new int[k];
        for (int i = 0; i < k; i++) {
            list[i] = (priorityQueue.remove().num);
        }
        return list;
    }
}
