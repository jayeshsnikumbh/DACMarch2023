class Assignment1_20 {
    public static void main (String args[]) {

        //1. Convert long value into string
        long value = 65321684354l;
        //String str = new String(value);//error: no suitable constructor found for String(long)
        String str = Long.toString(value);
        System.out.println(" Value inside string : " + str);

        //2. Long value into Long instance
        long value2 = 98465135;
        Long instance1 = new Long(value2);
        long fetch = instance1.longValue(); 
        System.out.println(" Value Converted to Instance : " + fetch);

        //3. String instance into long instace
        String str2 = new String("845631325");
        Long instance2 = new Long(str2);
        long fetch2 = instance2.longValue();
        System.out.println(" String instance Converted to long Instance : " + fetch2);

        //4. Long value into Binary, octal and Hexadecimal string.
        long value3 = 243232;
        String binary = Long.toBinaryString(value3);
        String octal = Long.toOctalString(value3);
        String hexa = Long.toHexString(value3);
        System.out.println(" Long converted to Binary " + binary);
        System.out.println(" Long converted to Octal " + octal);
        System.out.println(" Long converted to HexaDecimal " + hexa);

    }
}