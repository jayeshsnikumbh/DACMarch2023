class Assignment1_25 {
    public static void main(String args[]) {
        
        float value = 579.26f;
        Float instance = new Float(value);

        byte num1 = instance.byteValue();
        System.out.println(" Num1 : "+ num1);

        short num2 = instance.shortValue();
        System.out.println(" Num2 : "+ num2);

        int num3 = instance.intValue();
        System.out.println(" Num3 : "+ num3);

        float num4 = instance.floatValue();
        System.out.println(" Num4 : "+ num4);

        double num5 = instance.doubleValue();
        System.out.println(" Num5 : "+ num5);

        long num6 = instance.longValue();
        System.out.println(" Num6 : "+ num6);

    
}
}