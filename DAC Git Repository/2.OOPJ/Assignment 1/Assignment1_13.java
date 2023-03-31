class Assignment1_13 {
    public static void main(String args[]) {

        //1. short value into String
        short value1 = 568;
        //String str1 = new String(Short.toString(value1));
        String str1 = Short.toString(value1); //Alternate
        System.out.println(" Short value to String : " + str1);

        //2. short value into Short instance
        short value2 = 468;
        Short instance1 = new Short(value2);
        short number1 = instance1.shortValue();
        System.out.println(" Short value to short instance : " +number1);

        //3. String instance into short instance
        String str2 = new String("5223");
        //Short instance2 = new Short(str2);
        Short instance2 = Short.valueOf(str2); //Alternate. 
                                        //Returns a Short object holding the value given by the specified String.
        System.out.println(" Short value to short instance : " +instance2);
        
    }
}