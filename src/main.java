import ArrayTask1.GroupAnagrams;
import DoubleLinkedList.BrowserHistory;
import DoubleLinkedList.LRUCache;
import LinkedListTask2.SwapNodes;
import stack.EvaluateReverse;
import task4.ProductofArrayExceptSelf;
import task4.RemoveAllAdjacentDuplicates;

public class main {


    public static void main(String[] args){


        BrowserHistory obj = new BrowserHistory("Leetcode.com");
        obj.visit("google.com");
        obj.visit("facebook.com");
        obj.visit("youtube.com");
       String param_2 = obj.back(1);
        String param_3 = obj.back(1);
        String param_4 = obj.forward(1);
        obj.visit("LinkedIN");
        String param_5 = obj.forward(2);
        String param_6 = obj.back(2);
        String param_7 = obj.back(7);

        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        int[] arr = {1 ,2 ,3 ,4};
        productofArrayExceptSelf.productExceptSelf(arr);

        RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates = new RemoveAllAdjacentDuplicates();
        removeAllAdjacentDuplicates.removeDuplicates("abbaca");

        EvaluateReverse evaluateReverse = new EvaluateReverse();
        evaluateReverse.evalRPN(new String[]{"4","13","5","/","+"});

        System.out.println("mena");
    }
}
