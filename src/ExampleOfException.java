import java.net.SocketTimeoutException;

public class ExampleOfException {
  public static void main(String[] args) {
    TryCatch();
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
}
