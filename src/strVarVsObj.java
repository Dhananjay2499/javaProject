public class strVarVsObj {
    public static void main(String[ ] a){
        String string1 = "JAVA";
        String string2 = "JAVA";
        String string3 = string1;
        /* All strings (created as a variable) will be pointing towards the same memory address */
        System.out.println("------------------------------------------");
        System.out.println("string1->" +"\"" +string1 + "\"->address : "+System.identityHashCode(string1));
        System.out.println("string2->" +"\"" +string2 + "\"->address : "+System.identityHashCode(string2));
        System.out.println("string3->" +"\"" +string3 + "\"->address : "+System.identityHashCode(string3));
        System.out.println("------------------------------------------");
//----------------------------------------------------------------------------------------------
        String string4 = new String("JAVA");
        String string5 = new String("JAVA");
        String string6 = new String(string1);
        /* All strings (created as an object) will be pointing towards the different memory address */
        System.out.println("string4->" +"\"" +string4 + "\"->address : "+System.identityHashCode(string4));
        System.out.println("string5->" +"\"" +string5 + "\"->address : "+System.identityHashCode(string5));
        System.out.println("string6->" +"\"" +string6 + "\"->address : "+System.identityHashCode(string6));
    }
}
