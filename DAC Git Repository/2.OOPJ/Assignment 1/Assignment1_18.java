class Assignment1_18 {
    public static void main(String []args) {

        int num1 = 15;
        int num2 = 68;

        int x = Integer.max(num1, num2);
        System.out.println(" Bigger nymber is " + x);

        int y = Integer.min(num1,num2);
        System.out.println(" Smaller nymber is " + y);

        int sum = Integer.sum(x, y);
        System.out.println(" Sum of numbers is " + sum);
    }
}