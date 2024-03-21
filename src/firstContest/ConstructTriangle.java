package firstContest;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConstructTriangle {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);




        int r = scanner.nextInt();

        for(int i=1;i<=r;i++)
        {

            long c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println();
        }


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
