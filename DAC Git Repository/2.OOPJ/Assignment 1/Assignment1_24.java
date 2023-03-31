class Assignment1_24 {
    public static void main(String []args) {

        //1.Float value into string
        float value = 56.874f;
        String str = Float.toString(value);
        System.out.println(" float value into string : " + str);

        //2. Float value into float instance
        float value2 = 86.231f;
        Float instance = new Float(value2);
        float number = instance.floatValue();
        System.out.println(" float value into float instance : " + number);

        //3. String instance into float instance
        String str1 = new String("543.248");
        Float instance2 = new Float(str1);
        System.out.println(" float value into float instance : " + instance2);

        //4. float value into Hexadecimal string
        float value3 = 8951.556f;
        String str2 = Float.toHexString(value3);
        System.out.println(" float value into float instance : " + str2);
    }
    
}