
package wuwamart.users;
import java.util.*;
public class Customer extends User {
    
  private ArrayList<Object>orders;
  public Customer(int id ,String fullName,String userName,String password,String email){
  
      super (id,fullName,userName,password,email);
      this.orders=new ArrayList<>();
      
  }
  
    
    
}
