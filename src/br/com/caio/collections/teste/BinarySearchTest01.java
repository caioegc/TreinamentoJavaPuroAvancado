package br.com.caio.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(10);
        nums.add(515);
        nums.add(1818);
        nums.add(1);

        Collections.sort(nums);
        System.out.println(Collections.binarySearch(nums, 0));
    }
}
