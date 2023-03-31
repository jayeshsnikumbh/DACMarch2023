class Assignment1_26 {
    public static void main(String args[]) {

        float num1 = 1556.42f;
        float num2 = 681.235f;

        float x = Float.max(num1, num2);
        System.out.println(" Bigger nymber is " + x);

        float y = Float.min(num1,num2);
        System.out.println(" Smaller nymber is " + y);

        float sum = Float.sum(x, y);
        System.out.println(" Sum of numbers is " + sum);
    }
}