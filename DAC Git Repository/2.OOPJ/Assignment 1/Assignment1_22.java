class Assignment1_22 {
    public static void main(String args[]) {

        long num1 = 155642;
        long num2 = 681235;

        long x = Long.max(num1, num2);
        System.out.println(" Bigger nymber is " + x);

        long y = Long.min(num1,num2);
        System.out.println(" Smaller nymber is " + y);

        long sum = Long.sum(x, y);
        System.out.println(" Sum of numbers is " + sum);
    }
}