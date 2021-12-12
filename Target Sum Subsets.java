import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception
  {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    printTargetSumSubsets(arr, 0, "", 0, target);
  }

  // set is the subset
  // sos is sum of subset
  // tar is target
  public static void printTargetSumSubsets(int[] arr, int idx, String output, int currSum, int targetSum)
  {
    if (idx == arr.length)
    {
      if (currSum == targetSum)
      {
        System.out.println(output + ".");
      }
      return;
    }

    if (currSum > targetSum)
      return;

    int ele = arr[idx];
    printTargetSumSubsets(arr, idx + 1, output + ele + ", ", currSum + ele, targetSum);

    printTargetSumSubsets(arr, idx + 1, output, currSum, targetSum);


  }

}
