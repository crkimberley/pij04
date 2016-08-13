/**
 * @author crkimberley on 13/08/2016.
 */
Scanner input = new Scanner(System.in)
print "Enter amount borrowed: "
double borrowed = input.nextDouble()
print "Enter number of years to pay it back: "
double duration = input.nextDouble()
print "Enter interest rate: "
double rate = input.nextDouble()
println "totalAmountToBePaid = " + totalAmountToBePaid(borrowed, rate)
println "moneyToBePaidEveryYear = " + moneyToBePaidEveryYear(borrowed, rate, duration)
println "yearsBeforeInterestPaid = " + yearsBeforeInterestPaid(borrowed, rate, duration)

double totalAmountToBePaid(double borrowed, double rate) {
    return borrowed * (1 + rate / 100)
}

double moneyToBePaidEveryYear(double borrowed, double rate, double duration) {

    return totalAmountToBePaid(borrowed, rate) / duration
}

double yearsBeforeInterestPaid(double borrowed, double rate, double duration) {
    return (totalAmountToBePaid(borrowed, rate) - borrowed) / moneyToBePaidEveryYear(borrowed, rate, duration)
}
