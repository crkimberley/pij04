import static java.lang.Math.pow

/**
 * @author crkimberley on 13/08/2016.
 */
Scanner input = new Scanner(System.in)
while (true) {
    print "Enter number - hex or decimal - for conversion. Start hex numbers with 0x. (q to quit): "
    String numberString = input.next()
    if (numberString == "q") {
        break
    }
    if (numberString.length() > 2 && numberString.substring(0, 2) == "0x") {
        println "Converted to decimal = " + hex2decimal(numberString.substring(2))
    } else {
        println "Converted to hex = " + decimal2hex(Integer.parseInt(numberString))
    }
}

int hex2decimal(String hexString) {
    int decimalNumber = 0
    int numberOfHexDigits = hexString.length()
    for (int i=0; i<numberOfHexDigits; i++) {
        int hexDigit = hexDigit2decimal((hexString.charAt(i)) as String)
        int powerOf16 = numberOfHexDigits - i - 1
        int decimalValueOfHexDigit = hexDigit * pow(16, powerOf16)
        decimalNumber = decimalNumber + decimalValueOfHexDigit
    }
    return decimalNumber
}

int hexDigit2decimal(String hexDigitString) {
    if (hexDigitString >= "0" && hexDigitString <= "9") {
        return Integer.parseInt(hexDigitString)
    } else if (hexDigitString == "a") {
        return 10
    } else if (hexDigitString == "b") {
        return 11
    } else if (hexDigitString == "c") {
        return 12
    } else if (hexDigitString == "d") {
        return 13
    } else if (hexDigitString == "e") {
        return 14
    } else if (hexDigitString == "f") {
        return 15
    }
}

String decimal2hex(int decimalNumber) {
    if (decimalNumber == 0) {
        return "0"
    }
    String hexString = ""
    int decimalRemainder = 0
    while (decimalNumber != 0) {
        decimalRemainder = decimalNumber % 16
        decimalNumber = decimalNumber / 16
        hexString = decimal2hexDigit(decimalRemainder) + hexString
    }
    return hexString
}

String decimal2hexDigit(int decimalNumber) {
    if (decimalNumber <= 9) {
        return Integer.toString(decimalNumber)
    } else if (decimalNumber == 10) {
        return "a"
    } else if (decimalNumber == 11) {
        return "b"
    } else if (decimalNumber == 12) {
        return "c"
    } else if (decimalNumber == 13) {
        return "d"
    } else if (decimalNumber == 14) {
        return "e"
    } else if (decimalNumber == 15) {
        return "f"
    }
}