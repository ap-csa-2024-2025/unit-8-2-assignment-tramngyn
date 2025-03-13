import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Make an array of doubles, and test your sumArray method
    double[] foo = new double[5];
    foo[0] = 2.7182;
    foo[1] = 3.21;
    foo[2] = 9.4949;
    foo[3] = 0.235;
    foo[4] = 5.5;
    System.out.println(sumArray(foo));

    System.out.println();
   
    // TODO: Make an array of Strings, and test your averageLength method
    String[] sentences = {"Hello", "How", "Are", "You"};
    System.out.println(averageLength(sentences));

    System.out.println();
   
    // TODO: Make an array of ints, and test your arrayMax method
    int[] numbers = {3, 4, 9, 6, 1, 5};
    System.out.println(arrayMax(numbers));

    System.out.println();

    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
    String wordTarget = "Hello";
    System.out.println(linearSearch(sentences, wordTarget));

  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (double num : arr) 
    {
      sum += num;
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double avg = 0.0;
    int sum = 0;
    for (String word : arr)
    {
      sum += word.length();
    }
    avg = sum/(double)(arr.length);
    return avg;
  }

  public static int arrayMax(int[] arr)
  {
    int max = arr[0];
    for (int num : arr) 
    {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (String word : arr)
    {
      if (word.equals(target)) {
        return true;
      }
    }
    return false;
  }
}
