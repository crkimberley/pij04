/**
 * @author crkimberley on 11/08/2016.
 */
Scanner input = new Scanner(System.in)
String option1 = "Binary to Decimal Conversion"
String option2 = "Decimal to Binary Conversion"
println "Decimal/Binary Converter"
boolean running = true
while (running) {
    switch (menu2options(option1, option2)) {
        case 0:
            running = false
            break
        case 1:
            print "Enter binary number: "
            println "Converted to decimal: " + binary2decimal(input.next())
            break
        case 2:
            print "Enter decimal number: "
            println "Converted to binary: " + decimal2binary(input.nextInt())
            break
    }
}

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
    int numberOfBinaryDigits = binaryString.length()
    for (int i=0; i<numberOfBinaryDigits; i++) {
        int binaryDigit = Integer.parseInt((binaryString.charAt(i)) as String)
        int powerOf2 = numberOfBinaryDigits - i - 1
        int decimalValueOfBinaryDigit = binaryDigit * power2(powerOf2)
        decimalNumber = decimalNumber + decimalValueOfBinaryDigit
    }
    return decimalNumber
}

String decimal2binary(int decimalNumber) {
    String result = ""
    while (decimalNumber != 0) {
        result = decimalNumber % 2 + result
        decimalNumber = decimalNumber / 2
    }
    return result
}

int menu2options(String option1, String option2) {
    while (true) {
        Scanner input = new Scanner(System.in)
        println "<1> " + option1
        println "<2> " + option2
        println "<0> To exit"
        print ">>> "
        if (input.hasNextInt()) {
            int choice = input.nextInt()
            if (choice >= 0 && choice <= 2)
            return choice
        }
        println "Invalid option"
     }
}