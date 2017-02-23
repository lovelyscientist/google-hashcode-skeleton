package hashcode.solution;

import hashcode.data.InputData;
import hashcode.data.OutputData;

import java.util.ArrayList;
import java.util.List;

public class Solver {

    public static OutputData solve(InputData inputData) {
        OutputData outputData = new OutputData();

        List<List<Integer>> testTable = new ArrayList<>();

//        testTable.add(new ArrayList<>());
//        testTable.get(0).add(1);
//        testTable.get(0).add(2);
//        testTable.get(0).add(3);
//        testTable.get(0).add(4);
//        testTable.add(new ArrayList<>());
//        testTable.get(1).add(5);
//        testTable.get(1).add(6);
//        testTable.get(1).add(7);
//        testTable.get(1).add(8);
//        testTable.add(new ArrayList<>());
//        testTable.get(2).add(9);
//        testTable.get(2).add(0);
//        testTable.get(2).add(1);
//        testTable.get(2).add(2);

        outputData.setTempTable(testTable);
        outputData.setTempField1(testTable.size());

        return outputData;
    }

}
