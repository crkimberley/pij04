/**
 * @author crkimberley on 11/08/2016.
 */
int power(int base, int exponent) {
    int result = 1
    for (int i=0; i<exponent; i++) {
        result = base * result
    }
    return result
}

int power2(int exponent) {
    return power(2, exponent)
}

int binary2decimal(String binaryString) {
    int decimalNumber = 0
    for (int i=0; i<binaryString.length(); i++) {
        decimalNumber = decimalNumber + Integer.parseInt(binaryString.charAt(i)) * power2(binaryString.length() - i - 1)
    }
}

String decimal2binary(int decimalNumber) {
    String result = ""
    while (decimalNumber != 0) {
        result = decimalNumber % 2 + result
        decimalNumber = decimalNumber / 2
    }
    return result
}