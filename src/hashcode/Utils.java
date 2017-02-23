/**
 * Created by xxx on 23.02.17.
 */
package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formatter;
import java.util.List;

public class Utils {
    public static void writeToFile(String fileName, String outputData) throws IOException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(outputData);
        }
    }

    public static String readFromFile(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        StringBuilder stringBuilder = new StringBuilder();

        lines.forEach(line -> stringBuilder.append(line).append("\n"));

        return stringBuilder.toString();
    }

}
