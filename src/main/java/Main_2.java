import java.util.*;
import java.util.stream.*;

public class Main_2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Привет" , "балбес", "!", "Ты", "зря", "родился", "!");

//        list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//        list = (List<String>) list.stream().filter(str -> str.length() > 4);

//        for (String item: list) {
//            System.out.println(item);
//        }

//        list.stream().filter(str -> str.length() > 4).forEach(s -> System.out.println(s));
        list.stream().filter(str -> str.length() > 4).forEach(System.out::println); // аналог строки 16

        System.out.println("\nВыводим результат работы фильтра по длине элементов списка и ");
        System.out.println("по наличию в элементе буквы \"о\":");
        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("о")).forEach(System.out::println); //// аналог строки 16

        System.out.println("\nПример работы метода map():");
        Arrays.asList(1, 2, 3, 4, 5).stream().map(chislo -> chislo * chislo).forEach(System.out::println);

        System.out.println("\nДобавляем в map() объекты других типов (в данном случае String):");
        Arrays.asList(1, 10, 0, 7, 5).stream().map(chislo -> "число: " + chislo + ". квадрат числа - " + chislo * chislo).forEach(System.out::println);

        System.out.println("\nРабота метода sorted():");
        Arrays.asList(1, 10, 0, 7, 5).stream().sorted().forEach(System.out::println);

        System.out.println("\nРабота метода distinct() - удаление дубликатов:");
        Arrays.asList(1, 10, 0, 5, 7, 5).stream().distinct().forEach(System.out::println);


        System.out.println("\nРабота метода findFirst() - возвращает первый элемент:");
        System.out.println(Arrays.asList(1, 10, 0, 5, 7, 5).stream().distinct().findFirst().get());
        System.out.println(Arrays.asList(1, 10, 0, 5, 7, 5).stream().sorted().distinct().findFirst().get());
    }

}
