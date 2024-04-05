package firstContest;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);


        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;

        }

        int[] arrSol = new int[n];

        int ans = 1;
        for (int i = 0; i < n; i++) {

            arrSol[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]){
                    arrSol[i] = Math.max(arrSol[i],arrSol[j] + 1);
                    ans = Math.max(ans,arrSol[i]);
                }
            }
        }

        System.out.println(ans);
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
