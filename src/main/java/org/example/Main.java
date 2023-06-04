//+1.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы.
// Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
//+2.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
// Фамилии, имена, отчества, возрас и пол в отдельных списках.
//+3.Отсортировать по возрасту используя дополнительный список индексов.
//        4.Отсортировать по полу используя дополнительный список индексов.
//        5.*Сортировка по полу и возрасту.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите Фамилию, имя, отчество, возраст, пол или q для выхода");
        System.out.println("--------------------------------------------------------------");
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> secondname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> middlename = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        while (true) {
            String in = input.nextLine();
            if (in.toLowerCase().equals("q")) break;
            String[] str = in.split((" "));
            id.add(age.size());
            secondname.add(str[0]);
            name.add(str[1]);            //charAt(0) - вывод только первой буквы.
            middlename.add(str[2]);
            age.add(Integer.valueOf(str[3]));
            //gender.add(str[4].toUpperCase().contains("М"));    //ту - фолс    // в вывод - (gender.get(i) ? "M" : "Ж"));
            gender.add(str[4].toUpperCase());
            //gender.add(str[4].toUpperCase() == "М" ? true : false);
        }


        for (int i = 0; i < name.size() - 1; i++) {          //пузырьковая сортировка, чтобы отсортировать по возрасту
            int max = age.get(id.get(i));
            int index = i;
            for (int j = i + 1; j < name.size(); j++) {
                if (age.get(id.get(j)) < max) {
                    index = j;
                    max = age.get(id.get(j));

                }
            }

            if (index != i) {
                int tmp = id.get(i);                      //поменяли местами через тмп
                id.set(i, id.get(index));
                id.set(index, tmp);
            }
        }


        for (int i = 0; i < age.size(); i++) {
            System.out.println(secondname.get(id.get(i)) + " " + name.get(id.get(i)).toUpperCase().charAt(0) + "." + " " + middlename.get(id.get(i)).toUpperCase().charAt(0) + "." + " " + age.get(id.get(i)) + " " + (gender.get(id.get(i))));
                    }
        System.out.println("--------------------------------------------------------------");
                }
        }







