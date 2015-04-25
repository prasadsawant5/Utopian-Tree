import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n, height = 1, cycles;
        
        n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i ++) {
            
            cycles = Integer.parseInt(br.readLine());
            
            if (cycles == 0) {
                height = 1;
            } else {
                for (int j = 0; j < cycles; j++) {
                    if (j % 2 == 0) {
                        height += height; 
                    } else {
                        height += 1;
                    }
                }
            }
            System.out.println(height);
            height = 1;
        }
    }
}
