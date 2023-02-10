# DigitConvX

DigitConvX is a Java class that provides conversion of digits between Bangla and English representations.

# Usage
To use DigitConvX in your project, simply include the class file in your project's classpath and import it.
Then, you can call any of the conversion methods to convert between representations.

```java
DigitConvX n=new DigitConvX();
```

Here's an example of converting an integer from English to Bangla representation:

```java
import java.util.HashMap;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    int input = 12345;
    String converted = DigitConvX.convert_to_BN(input);
    System.out.println("Converted: " + converted); //it will show output ১২৩৪৫
  }
}
```

