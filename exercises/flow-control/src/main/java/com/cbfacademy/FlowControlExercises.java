package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        
        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(number.toString());
            }
        }
        return result;
    }

    public String whichMonth(int number) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        if (number >= 1 && number <= 12) {
            return months[number - 1];
        } else {
            return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
       List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

            int sumOfEvens = 0;
            int sumOfOdds = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    sumOfEvens += number;
                } else {
                    sumOfOdds += number;
                
                }
            }
                
    
        Map<String, Integer> resultsMap = new HashMap<>();
        resultMap.put("SumOfEvens", sumOfEvens);
        resultMap.put("SumOfOdds", sumOfOdds);

        return resultMap;
    }

    public static void main(String[] args) {
        NumberSums numberSums = new NumberSums();
        Map<String, Integer> results = numberSums.sumOfOddsAndSumOfEvens();
        System.out.println("Sum of Evens; " + results.get("SumOfEvens"));
        System.out.println("Sum of Odds; " + results.get("SumOfOdds"));
    }


    public List<Integer> reverse(ArrayList<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>(numbers);
        Collections.reverse(reversedNumbers);
        return reversedNumbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
