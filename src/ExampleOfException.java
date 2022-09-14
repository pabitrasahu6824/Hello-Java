public class ExampleOfException {
  public static void main(String[] args) {
    // TryCatch();
    TryCatchFinally();
  }
  public static void TryCatch(){
    try{
      int data = 10 / 0;
      System.out.println(data);
    }catch(Exception e){
      System.out.println("10 can not be divisiable by 0");
    }
    System.out.println("execute rest of code");
  }
  public static void TryCatchFinally(){
    try{
      int data = 10 / 0 ;
      System.out.println(data);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("the code has a ArrayIndexOutOfBoundsException");
    }finally{
      System.out.println("importand code");
    }
    System.out.println("execute rest of the code");
  }
  
}
