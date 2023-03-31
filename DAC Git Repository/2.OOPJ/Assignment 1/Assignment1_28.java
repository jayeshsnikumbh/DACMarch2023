class Assignment1_28 {
    public static void main(String []args) {

        //1.Double value into string
        double value = 56.874651;
        String str = Double.toString(value);
        System.out.println(" double value into string : " + str);

        //2. double value into Double instance
        double value2 = 86.2319845;
        Double instance = new Double(value2);
        double number = instance.doubleValue();
        System.out.println(" double value into double instance : " + number);

        //3. String instance into double instance
        String str1 = new String("543.2876248");
        Double instance2 = new Double(str1);
        System.out.println(" Double value into Double instance : " + instance2);

        //4. Double value into Hexadecimal string
        double value3 = 8951.556f;
        String str2 = Double.toHexString(value3);
        System.out.println(" Double value into Hexa : " + str2);

        //5. Double value into Binary
        double value4 = 564.32156;
        long binary = Double.doubleToLongBits(value4);
        System.out.println(" Double value into Binary : " + binary);               


    }
    
}