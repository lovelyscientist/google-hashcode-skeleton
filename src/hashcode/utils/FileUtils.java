package hashcode.utils;

import hashcode.data.InputData;
import hashcode.data.OutputData;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileUtils {
    public static void writeToFile(String fileName, OutputData outputData) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(outputData.getTempField1());
            outputData.getTempTable().forEach(row -> {
                row.forEach(cell -> out.print(cell + " "));
                out.println();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static InputData readFromFile(String fileName) {
        InputData inputData = new InputData();
        List<List<String>> table = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(currentLine -> {
                if (inputData.getTempField1() == 0) {
                    String[] splitLine = currentLine.split(" ");
                    inputData.setTempField1(Integer.parseInt(splitLine[0]));
                    inputData.setTempField2(Integer.parseInt(splitLine[1]));
                    inputData.setTempField3(Integer.parseInt(splitLine[2]));
                    inputData.setTempField4(Integer.parseInt(splitLine[3]));
                } else {
                    table.add(new ArrayList<>());
                    int currentTableRowIndex = table.size() - 1;
                    Arrays.stream(currentLine.split("")).forEach(table.get(currentTableRowIndex)::add);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        inputData.setTestTable(table);
        return inputData;
    }

}
