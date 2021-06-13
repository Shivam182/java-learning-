package basicPrograms;

// Working program using Reader Class
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AS {
    static class Reader {

        // 1 << 16 is bitwise operation , and it means 65536 {huge number} so better is
        // to interact it with bitwise operators
        final private int BUFFER_SIZE = 1 << 16;

        // data input stream lets an application read primitive Java data types from an
        // underlying input stream in a machine-independent way
        private DataInputStream din;

        // byte buffer as byte has range of -127 to 128 so it requires very little
        // memory as compared to ints
        private byte[] buffer;

        private int bufferPointer, bytesRead;

        // the constructor of the Reader class
        public Reader() {
            // dataInputStr contains .in menas user input it will be reading
            din = new DataInputStream(System.in);

            // buffer of size 1 <<16 i,e ==> 65536
            buffer = new byte[BUFFER_SIZE];

            // bufferPointer points to the current buffer element and bytes read is number
            // of byte elements in buffer array { i should be 1 less than pointer index }
            // initially both are on start zero
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {

            // line length
            byte[] buf = new byte[64];

            // cnt is for initializing the index of buf array for filling it
            // c --> points to below in while loop and there it takes data from read method
            // {
            // c points to buffer[bufferPointer++] integer means , it first gets the data
            // and
            // in next turn it gets data of ++ index , and keeps taking one by one till it
            // reaches to give -1
            // }
            int cnt = 0, c;

            // while data is there to be read as given by user input
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                // keep adding in the byte array of line . {add what : add the value of c given
                // by buffer[] array in read method }
                buf[cnt++] = (byte) c;
            }

            // returns a string containing one complete line of 64 decoded into characters
            // bytes
            /**
             * params: bytes: The bytes to be decoded into characters offset: The index of
             * the first byte to decode length: The number of bytes to decode
             */
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();

            // it runs never
            while (c <= ' ') {
                System.out.println(" work inside o ");
                c = read();
            }

            // checks if input is negative
            boolean neg = (c == '-');
            if (neg) {
                c = read();
                System.out.println(c + " neg");
            }

            // this might be the algorithm to convert byte to int 
            // also saw the c++ code for same thing and got the expression in line 103 to be same exact !! 
            do {
                System.out.println(" in3");
                // minus 0 is done to get int val 
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;

        }

        // long retruning method is exact same as int just replace int ret with long ret 
        // for double one more block is added for decimal . 

        private void fillBuffer() throws IOException {

            // bytesRead : is the integer returned by read method od datainputstr reader ,
            // above we saw in constructor that din is obj of that class that makes the user
            // to write data uses .in in its param see constructor of reader class
            // so now the read method is just reading the input given by user using its read
            // method
            // 1st param : buffer : means where should this method store data that it reads
            // 2nd param : from which index to start adding data i,e zero
            // 3rd param : max length to be read , not to see anything after that
            // bytesread : is the total number of bytes read into the buffer { or total
            // bytes sent into the buffer its an integer val returned auto by read method }
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);

            // if no bytes read means no data given by user then store in buffer array at 0
            // index val = -1
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            // this will return -1 if no data read as no data will get stored by fillbuffer
            // in this buffer array
            return buffer[bufferPointer++];
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Reader s = new Reader();

        int n = s.nextInt();
        System.out.println(n);
        // Thread.sleep(1000);
        // System.out.println(i2+ " ");
        /**
         * IMPORTANT : IF DOING ANY REAL TIME OPERATION LIKE NOT STATIC WHICH IS ALREADY
         * STORED IN CODE OR MEMORY FOR EXAMPLE , IF TAKING USER INPUT AND DIRECTLY
         * PRINTING IT or passing it instantly, ALSO U R PRINTING SOMETHING WITH PLUS
         * SIGN IN SYSOUT METHOD , then u might or might not get your print though its
         * stored in the print becuase it takes place very fast Note : this also happens
         * if u r taking input and directly passin it to any other method then that
         * method may be taking only half or even no input
         */
        // System.out.println(i + "n");
    }
}
