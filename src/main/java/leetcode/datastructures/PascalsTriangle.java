package leetcode.datastructures;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) {
            return list;
        }
        int row = 0;
        while(row < numRows) {
            list.add(new ArrayList<>());
            for(int i = 0; i < row; i++) {
                if(i > 0) {
                    int leftAdd = list.get(row - 1).get(i - 1);
                    int rightAdd = list.get(row - 1).get(i);
                    list.get(row).add(leftAdd + rightAdd);
                } else {
                    list.get(row).add(1);
                }
            }
            list.get(row).add(1);
            row++;
        }
        return list;
    }
}