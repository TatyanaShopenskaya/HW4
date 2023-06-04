package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Gender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите Фамилию, имя, отчество, возраст, пол или q для выхода");
        System.out.println("--------------------------------------------------------------");
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> secondname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> middlename = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        while (true) {
            String in = input.nextLine();
            if (in.toLowerCase().equals("q")) break;
            String[] str = in.split((" "));
            id.add(age.size());
            secondname.add(str[0]);
            name.add(str[1]);            //charAt(0) - вывод только первой буквы.
            middlename.add(str[2]);
            age.add(Integer.valueOf(str[3]));
            gender.add(str[4].toUpperCase().contains("М"));    //тpу - фолс    // в вывод - (gender.get(i) ? "M" : "Ж"));

            //gender.add(str[4].toUpperCase());
            //gender.add(str[4].toUpperCase() == "М" ? true : false);

            //System.out.println(gender);    //true, false, true, true, false
        }

        boolean[] list = new boolean[]{true, false, true, true, false};
        Boolean[] result = new Boolean[age.size()];
        for (int i = 0; i < age.size(); i++) {
            result[i] = list[i];
            int index = i;
        }

            Arrays.sort(result);
            System.out.println(Arrays.toString(result));
        }
    }

