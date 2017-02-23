/**
 * Created by xxx on 23.02.17.
 */
package hashcode;

import static hashcode.PathConfig.*;
import hashcode.Utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        testMethod(EXAMPLE_INPUT_FILE_PATH, OUTPUT_DATA_SET_EXAMPLE_TXT);
        testMethod(SMALL_INPUT_FILE_PATH, OUTPUT_DATA_SET_SMALL_TXT);
        testMethod(MEDIUM_INPUT_FILE_PATH, OUTPUT_DATA_SET_MEDIUM_TXT);
    }

    public static void testMethod(String inputFile, String outputFile) throws IOException {
        if (inputFile == EXAMPLE_INPUT_FILE_PATH) {
            System.out.println(Utils.readFromFile(inputFile));
            Utils.writeToFile(inputFile, "hello kitty");
        }

        System.out.println(new File(inputFile).getName());
        System.out.println(new File(outputFile).getName());
    }
}
