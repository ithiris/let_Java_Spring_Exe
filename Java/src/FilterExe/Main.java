package FilterExe;

import MyFilterImplementation.MyFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {




    }

    public  static void myFilter(List<Integer> values, Predicate lamExp) {
        System.out.println("Lambda Expression result: ");
        boolean testResult = lamExp.test(values);
        System.out.println(testResult);
    }
    }

