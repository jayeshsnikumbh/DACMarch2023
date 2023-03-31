class Assignment1_8 {
    public static void main(String args[]) {

        //1. byte value into String
        byte value1 = 58;
        //String str1 = Byte.toString(value1);
        String str1 = new String(Byte.toString(value1));
        System.out.println(" Byte value converted to string : " + str1);

        //2. byte value into Byte instance
        byte value2 = 63;
        Byte instance1 = Byte.valueOf(value2);
        System.out.println(" Byte value into byte instance : " + instance1);

        //3. String instance into Byte instance.
        //String str2 = new String("29876"); // Error : Exception in thread 
                                           //"main" java.lang.NumberFormatException: Value out of range.
        String str2 = new String("26");
        Byte instance2 = Byte.valueOf(str2);
        System.out.println(" String instance into Byte instance : " + instance2);
    }
}