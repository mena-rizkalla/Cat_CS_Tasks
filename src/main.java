import ArrayTask1.GroupAnagrams;
import DoubleLinkedList.BrowserHistory;
import DoubleLinkedList.LRUCache;
import LinkedListTask2.SwapNodes;
import task4.ProductofArrayExceptSelf;

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

        System.out.println("mena");
    }
}
