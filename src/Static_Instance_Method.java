public class Static_Instance_Method {
    public static void main(String[] a){
//----------------------------------------------------------------------

        st_meth(); // To call a static method no need to create an object

//----------------------------------------------------------------------

        Static_Instance_Method obj = new Static_Instance_Method(); // reference object creation
        obj.in_meth(); //calling instance method

//----------------------------------------------------------------------
    }
//    Static method
    public static void st_meth(){
        System.out.println("Static method call!");
    }

//    Instance method
    public void in_meth(){
        System.out.print("Instance method call!");
    }
}
