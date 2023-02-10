import java.util.HashMap;
import java.util.Map;

public class DigitConvX {
  private static Map<Character, Character> digitMapBN;
  private static Map<Character, Character> digitMapEN;

  static {
    digitMapBN = new HashMap<>();
    digitMapBN.put('০', '0');
    digitMapBN.put('১', '1');
    digitMapBN.put('২', '2');
    digitMapBN.put('৩', '3');
    digitMapBN.put('৪', '4');
    digitMapBN.put('৫', '5');
    digitMapBN.put('৬', '6');
    digitMapBN.put('৭', '7');
    digitMapBN.put('৮', '8');
    digitMapBN.put('৯', '9');

    digitMapEN = new HashMap<>();
    digitMapEN.put('0', '০');
    digitMapEN.put('1', '১');
    digitMapEN.put('2', '২');
    digitMapEN.put('3', '৩');
    digitMapEN.put('4', '৪');
    digitMapEN.put('5', '৫');
    digitMapEN.put('6', '৬');
    digitMapEN.put('7', '৭');
    digitMapEN.put('8', '৮');
    digitMapEN.put('9', '৯');
  }

  public static String convert_to_BN(String input) {
    char[] chars = input.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (char c : chars) {
      if (digitMapEN.containsKey(c)) {
        sb.append(digitMapEN.get(c));
      } else {
        sb.append(c);
      }
    }

    return sb.toString();
  }

  public static String convert_to_BN(float input) {
    return convert_to_BN(String.valueOf(input));
  }

  public static String convert_to_BN(double input) {
    return convert_to_BN(String.valueOf(input));
  }

  public static String convert_to_BN(int input) {
    return convert_to_BN(String.valueOf(input));
  }

  public static String convert_to_BN(Object input) {
    return convert_to_BN(String.valueOf(input));
  }

  public static String convert_to_EN(String input) {
    char[] chars = input.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (char c : chars) {
      if (digitMapBN.containsKey(c)) {
        sb.append(digitMapBN.get(c));
      } else {
        sb.append(c);
      }
    }

    return sb.toString();
  }
public static String convert_to_EN(float input) {
return convert_to_EN(String.valueOf(input));
}

public static String convert_to_EN(double input) {
return convert_to_EN(String.valueOf(input));
}

public static String convert_to_EN(int input) {
return convert_to_EN(String.valueOf(input));
}
public static String convert_to_EN(Object input) {
return convert_to_EN(String.valueOf(input));
}
}
