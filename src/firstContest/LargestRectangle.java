package firstContest;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LargestRectangle {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);


        int n = scanner.nextInt();
        int[] arr = new int[n];
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
            list.add((long) x);
        }

        Stack<Integer> index = new Stack<>();
        Stack<Integer> height = new Stack<>();

        index.push(0);
        height.push(arr[0]);

        int area = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > height.peek())
            {
                height.push(arr[i]);
                index.push(i);
            }else if (arr[i] < height.peek()){

                int x = 0;
                while (!height.isEmpty() && arr[i] < height.peek()){
                    area = Math.max(area,height.peek() * (i - index.peek()));
                    height.pop();
                    x = index.pop();
                }
                index.push(x);
                height.push(arr[i]);
            }
        }


        while (!height.isEmpty()){
            area = Math.max(area,height.pop() * (n - index.pop()));
        }

        System.out.println(area);

        out.close();
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {

            try {
                br = new BufferedReader(new FileReader("sub.in"));
            } catch (FileNotFoundException ex) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public String nextLine() {
            String str = "";

            try {
                str = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            return str;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = br.readLine();
            } catch (Exception e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            }
            if (next == null) {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
}
