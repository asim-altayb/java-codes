
package pkgstatic;

public class Static {

 static int x = 60;
 static void fun() {
  System.out.println("Within Static");
 }
    
    public static void main(String[] args) {
        Static.fun();
     
  System.out.println(Static.x);
  Static S1 = new Static();
  Static S2 = new Static();
  System.out.println(S1.x);
  S1.fun();
        
    }
    
}
