class Assignment1_6 {
    public static void main( String args[]) {

    //1.Converting Boolean value into String instance
    boolean value1 = true;
    String str1 = new String(Boolean.toString(value1));
    //String str = Boolean.toString(value); //Alternate way
    //String str = new String(value); // Error Check
    System.out.println(" 1.Boolean value converted to a string : "+ str1);

    //2.Converting Boolean value into Boolean instance
    boolean value2 = true;
    Boolean instance1 = Boolean.valueOf(value2);
    System.out.println(" 2.Boolean value converted to Boolean instance :" + instance1);

    //3. String value into boolean value
    String value3 = new String("false");
    boolean var = Boolean.parseBoolean(value3);
    System.out.println(" 3. String value converted to boolean value :" + var);

    //4. String value into boolean instance
    String str2 = new String("false");
    Boolean instance2 = Boolean.valueOf(str2);
    System.out.println(" 4. String value converted to Boolean instance :" + instance2);

    }
}