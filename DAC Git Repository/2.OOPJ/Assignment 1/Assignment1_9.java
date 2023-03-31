class Assignment1_9 {
    public static void main (String args[]) {
        byte value = 43;
        Byte bs = new Byte(value); //Byte instance

        byte num1 = bs.byteValue();
        System.out.println(" Num1 : "+ num1);

        short num2 = bs.shortValue();
        System.out.println(" Num2 : "+ num2);

        int num3 = bs.intValue();
        System.out.println(" Num3 : "+ num3);

        float num4 = bs.floatValue();
        System.out.println(" Num4 : "+ num4);

        double num5 = bs.doubleValue();
        System.out.println(" Num5 : "+ num5);
    }
}