class Assignment1_14 {
    public static void main(String args[]) {

        short value = 4139;
        Short instance = new Short(value);

        byte num1 = instance.byteValue(); 
        //Returns the value of this Short as a byte after a narrowing primitive conversion.
        System.out.println(" Num1 : "+ num1);

        short num2 = instance.shortValue();
        //Returns the value of this Short as a short.
        System.out.println(" Num2 : "+ num2);

        int num3 = instance.intValue();
        //Returns the value of this Short as an int after a widening primitive conversion.
        System.out.println(" Num3 : "+ num3);

        float num4 = instance.floatValue();
        // Returns the value of this Short as a float after a widening primitive conversion.
        System.out.println(" Num4 : "+ num4);

        double num5 = instance.doubleValue();
        //Returns the value of this Short as a double after a widening primitive conversion.
        System.out.println(" Num5 : "+ num5);

        long num6 = instance.longValue();
        //Returns the value of this Short as a long after a widening primitive conversion.
        System.out.println(" Num5 : "+ num6);
    }
 }