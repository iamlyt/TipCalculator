public class TipCalculator {

    protected double convertTip(int tip) {
        return tip * 0.01 + 1;
    }

    protected double calculateByPerson(double billTotal, int numOfPeople,
                                       int tip) {
        double tipDecimal = convertTip(tip);
        return billTotal / numOfPeople * tipDecimal;
    }
}
