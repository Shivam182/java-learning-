package basicPrograms;
// I/O IN COMP. CODING 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws IOException{
        Reader reader = new Reader();
        int nextInt = reader.nextInt();
        System.out.print(nextInt + " this thing . ");
    }
}

class Reader {
    BufferedReader br;
    StringTokenizer st;

    public Reader(){
        br = new BufferedReader( new InputStreamReader(System.in));    
    }

    String next(){
        try{
           while(st == null || !st.hasMoreElements()){
               st = new StringTokenizer(br.readLine());
           }
        }catch(Exception e){
            e.printStackTrace();
        }

        return(st.nextToken());
    }

    int nextInt(){
        return(
            Integer.parseInt(next())
        );
    }
}