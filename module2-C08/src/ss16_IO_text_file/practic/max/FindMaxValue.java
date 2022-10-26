package ss16_IO_text_file.practic.max;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(1);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\ss16_IO_text_file\\practic\\Max\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_IO_text_file\\practic\\Max\\result.txt", maxValue);
    }
}
