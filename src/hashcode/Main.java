package hashcode;

import hashcode.data.InputData;
import hashcode.data.OutputData;
import hashcode.solution.Solver;
import hashcode.utils.FileUtils;

import static hashcode.config.PathConfig.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputData inputData = FileUtils.readFromFile(SMALL_INPUT_FILE_PATH);
        OutputData outputData = Solver.solve(inputData);
        FileUtils.writeToFile(OUTPUT_DATA_SET_SMALL_TXT, outputData);
    }
}
