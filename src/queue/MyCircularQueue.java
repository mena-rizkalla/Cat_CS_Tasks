package queue;

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
public class MyCircularQueue {

    int[] arr;
    int front ;
    int rear ;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (!isFull()){
            rear = (rear+1)%arr.length;
            arr[rear] = value;
            return true;
        }else {
            return false;
        }
    }

    public boolean deQueue() {
        if (!isEmpty()){
            if ((front) == rear){
                front = 0;
                rear = -1;
            }else {
                front = (front + 1) % arr.length;
            }
            return true;
        }else {
            return false;
        }
    }

    public int Front() {
        if (rear == -1)
            return -1;
        return arr[front];
    }

    public int Rear() {
        if (rear == -1)
            return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return rear == -1 ;
    }

    public boolean isFull() {
        return (rear+1)% arr.length == front && rear != -1;
    }
}
