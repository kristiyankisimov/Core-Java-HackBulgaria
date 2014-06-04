package com.hackbulgaria.corejava;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        return Math.abs(number) % 2 == 1;
    }

    @Override
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int min(int... array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    @Override
    public int kthMin(int k, int[] array) {
        Arrays.sort(array);
        if (k - 1 < array.length) {
            return array[k - 1];
        }
        return -1;
    }

    @Override
    public float getAverage(int[] array) {
        float average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public int getGCD(int upperBound) {
        int gcd = upperBound;
        for (int i = 2; i < upperBound; i++) {
            int a = gcd, b = i;
            while (a != b) {
                if (a < b) {
                    b -= a;
                } else {
                    a -= b;
                }
            }
            gcd = a;
        }
        return gcd;
    }

    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        int k = 1;
        for (int i = upperBound; i > 0; i--) {
            int g = gcd(k, i);
            k = k / g * i;
        }
        return k;
    }

    public boolean isPalindromeN(long n) {
        long k = n;
        long n1 = 0;
        while (k != 0) {
            n1 = n1 * 10 + k % 10;
            k = k / 10;
        }
        return n1 == n;
    }

    @Override
    public long getLargestPalindrome(long N) {
        for (long i = N; i >= 1; i--) {
            if (isPalindromeN(i)) {
                return i;
            }
        }
        return 1;
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] h = new int[256];
        for (int i = 0; i < 256; i++) {
            h[i] = 0;
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                h[image[i][j]] += 1;
            }
        }
        return h;
    }

    @Override
    public long doubleFac(int n) {
        if (n < 2) {
            return 1;
        }

        long result = 1, buffer = 1;
        for (int i = 2; i <= n; i++) {
            buffer *= i;
        }
        for (int i = 2; i <= buffer; i++) {
            result *= i;
        }

        return result;
    }

    @Override
    public long kthFac(int k, int n) {
        long help = n, result = 1;
        for (int i = 0; i < k; i++) {
            result = 1;
            for (int j = 2; j <= help; j++) {
                result *= j;
            }
            help = result;
        }
        return result;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        Arrays.sort(array);
        int count = 1;
        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            if (k == array[i]) {
                count++;
            } else {
                if (count % 2 == 1) {
                    return k;
                } else {
                    k = array[i];
                    count = 1;
                }
            }
        }
        return -10;
    }

    @Override
    public long pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a * a, b / 2);
        } else {
            return a * pow(a * a, b / 2);
        }

    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        long scalar = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            scalar += a[i] * b[i];
        }
        return scalar;
    }

    @Override
    public int maxSpan(int[] array) {
        int span = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (array[i] == array[j]) {
                    if (span < j - i + 1) {
                        span = j - i + 1;
                    }
                }
            }
        }
        return span;
    }

    @Override
    public boolean canBalance(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum1 == sum) {
                return true;
            } else {
                sum1 += array[i];
                sum -= array[i];
            }
        }
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        // int[][] result = new int[newHeight][newWidth];

        return null;
    }

    @Override
    public String reverseMe(String argument) {
        StringBuffer str = new StringBuffer(argument);
        return new String(str.reverse());
    }

    @Override
    public String copyEveryChar(String input, int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < k; j++) {
                builder.append(input.charAt(i));
            }
        }
        return new String(builder);
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        String[] strings = arg.split(" ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reverseMe(strings[i]);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
            if (i != strings.length - 1) {
                builder.append(" ");
            }
        }

        return new String(builder);
    }

    @Override
    public boolean isPalindrome(String argument) {
        StringBuilder builder = new StringBuilder(argument);
        return builder.reverse().toString().equals(argument);
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return isPalindrome(String.valueOf(number));
    }

    @Override
    public int getPalindromeLength(String input) {
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                index = i;
                break;
            }
        }

        int count = 0;
        int b = index - 1;
        int a = index + 1;
        while (b >= 0 && a < input.length() && input.charAt(a) == input.charAt(b)) {
            count++;
            b--;
            a++;
        }
        return count;

    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        return haystack.split(needle, -1).length - 1;
    }

    @Override
    public String decodeURL(String input) {
        return input.replaceAll("%20", "").replaceAll("%3A", ":").replaceAll("%2F", "/").replaceAll("%3D", "?");
    }

    @Override
    public int sumOfNumbers(String input) {
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(input);
        int sumOfNumbers = 0;
        while (m.find()) {
            sumOfNumbers += Integer.parseInt(m.group());
        }
        return sumOfNumbers;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String c = new String(a);
        String d = new String(b);
        return c.equals(d);
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
