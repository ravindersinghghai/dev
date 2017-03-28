/**
 * Created by Geek on 19/3/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
 * Complete the function below.
 */

    static long countX(String[] steps) {

        // pull the 2 integer values(i.e a, b) put, 1st input string however contains only 1 integer value

        // variables u and v are args a and b from String[]
        int a = 0, b = 0;
        int u = 0, v = 0;

        //int[] ints = new int[steps.length];
        if (steps.length == 1)
            a = Integer.parseInt(steps[0]);

        if (steps.length == 2) {
            a = Integer.parseInt(steps[0]);
            b = Integer.parseInt(steps[1]);
        }

        // write logic for iterating steps
        if ((u >= 1 && u <= a) && (v >= 1 && v <= b)) {
            u++;
            v++;
        }

        // Now find the total occurences of higher integer value from the already constructed 2 dimentional array
        // ...and return that value back.

        return 0L;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;

        int _steps_size = 0;
        _steps_size = Integer.parseInt(in.nextLine().trim());
        String[] _steps = new String[_steps_size];
        String _steps_item;
        for(int _steps_i = 0; _steps_i < _steps_size; _steps_i++) {
            try {
                _steps_item = in.nextLine();
            } catch (Exception e) {
                _steps_item = null;
            }
            _steps[_steps_i] = _steps_item;
        }

        res = countX(_steps);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }

}

