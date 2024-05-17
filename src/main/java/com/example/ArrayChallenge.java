package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shyam CH
 */
public class ArrayChallenge {
        public static String arrayChallenge(String[] strArr) {
            List<String> nodes = new ArrayList<>(Arrays.asList(strArr));
            return preOrderTraversal(nodes, 0);
        }

        private static String preOrderTraversal(List<String> nodes, int index) {
            if (index >= nodes.size() || nodes.get(index).equals("#")) {
                return "";
            }

            String value = nodes.get(index);
            nodes.set(index, "#"); // Mark the current node as visited

            String left = preOrderTraversal(nodes, 2 * index + 1);
            String right = preOrderTraversal(nodes, 2 * index + 2);

            return value + " " + left + right;
        }

        public static void main(String[] args) {
            String[] strArr1 = {"5", "2", "6", "1", "9", "#", "8", "#", "#", "#", "#", "4", "#"};
            String[] strArr2 = {"4", "1", "5", "2", "#", "#", "#"};
            String[] strArr3 = {"2", "6", "#"};

            System.out.println(arrayChallenge(strArr1)); // Output: 52 19684
            System.out.println(arrayChallenge(strArr2)); // Output: 4125
            System.out.println(arrayChallenge(strArr3)); // Output: 26
        }
    }

