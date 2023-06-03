public class strVarVsObj {
    public static void main(String[ ] a){
        String string1 = "JAVA";
        String string2 = "JAVA";
        String string3 = string1;
        /* All strings (created as a variable) will be pointing towards the same memory address */
        System.out.println("-----------------------------------------------");
        System.out.println("\tstring1->" +"\"" +string1 + "\"->address : "+System.identityHashCode(string1));
        System.out.println("\tstring2->" +"\"" +string2 + "\"->address : "+System.identityHashCode(string2));
        System.out.println("\tstring3->" +"string1" + "->address : "+System.identityHashCode(string3));
        System.out.println("-----------------------------------------------");
//----------------------------------------------------------------------------------------------
        String string4 = new String("JAVA");
        String string5 = new String("JAVA");
        String string6 = new String(string1);
        /* All strings (created as an object) will be pointing towards the different memory address */
        System.out.println("\tstring4->" +"\"" +string4 + "\"->address : "+System.identityHashCode(string4));
        System.out.println("\tstring5->" +"\"" +string5 + "\"->address : "+System.identityHashCode(string5));
        System.out.println("\tstring6->" +"string1" + "->address : "+System.identityHashCode(string6));
        System.out.println("-----------------------------------------------");
    }
}
