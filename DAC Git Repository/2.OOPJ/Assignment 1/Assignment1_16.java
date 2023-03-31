class Assignment1_16{
    public static void main(String []args) {

        //1. int value into String
        int value1 = 7834945;
        //String str1 = Integer.toString(value1);
        String str1 = new String(Integer.toString(value1)); 
                       //Returns a String object representing the specified integer.
        System.out.println(" Integer value converted to string : " + str1);

        //2. int value into int instance
        int value2 = 623783;
        Integer instance1 = new Integer(value2);
        int var = instance1.intValue();
        System.out.println(" Integer value into Integer instance : " + var);

        //3. String instance into integer instance.
        String str2 = new String("26684");
        Integer instance2 = Integer.valueOf(str2);
        System.out.println(" String instance into Integer instance : " + instance2);
    }
}