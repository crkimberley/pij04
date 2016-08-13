/**
 * @author crkimberley on 13/08/2016.
 */
class Integer2 {
    int value

    int getValue() {
        return value
    }

    void setValue(int value) {
        this.value = value
    }

    boolean isEven() {
        return value % 2 == 0
    }

    boolean isOdd() {
        return !isEven()
    }

    void prettyPrint() {
        println value
    }

    String toString() {
        return "" + value
    }
}

// Test code from the question
Integer2 i2 = new Integer2()
print "Enter a number: "
Scanner input = new Scanner(System.in)
int i = input.nextInt()
//String str = System.console().readLine()
//int i = Integer.parseInt(str)
i2.setValue(i)
print "The number you entered is "
if (i2.isEven()) {
    println "even."
} else if (i2.isOdd()) {
    println "odd."
} else {
    println "undefined!! Your code is buggy!"
}
int parsedInt = Integer.parseInt(i2.toString())
if (parsedInt == i2.getValue()) {
    println "Your toString() method seems to work fine."
}