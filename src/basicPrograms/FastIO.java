package basicPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class FastIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int n = Integer.parseInt(st.nextToken());
        // System.out.println(n+5);

        double db = Double.parseDouble(st.nextToken());
        System.out.println(db + " db ");
        String st1 = br.readLine();
        System.out.println(st1  + " st1");
    }
}
