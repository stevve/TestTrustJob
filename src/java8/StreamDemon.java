package java8;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemon {
    public static void main(String[] args) {

        //数组转换成为流
        // Stream.of(array)

        //集合转换为流 collet.stream
        List<String> palyers = Arrays.asList("aaa", "yaoming", "kobe","aliy");
        List<String> sorted = palyers.stream().filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);


    }

}
