class Assignment1_30 {
    public static void main(String args[]) {

        double num1 = 14556.4263;
        double num2 = 6781.2357;

        double x = Double.max(num1, num2);
        System.out.println(" Bigger nymber is " + x);

        double y = Double.min(num1,num2);
        System.out.println(" Smaller nymber is " + y);

        double sum = Double.sum(x, y);
        System.out.println(" Sum of numbers is " + sum);
    }
}