/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedproject;

//factory2
public class UserFactory {
    public static final int Admin =1;
  public static final int Developer =2;
  public static final int Tester =3;
  
  public static User createUser (int id) {

      switch (id) {

         case Admin :
          return new Admin ();
        case Developer:
          return new Developer();
        case Tester:
          return new Tester();
           
        default:
           return null;
  
    
}
  }
}
//factory 2
