
package pkgfinal;



//here final in classes 
final  class  fin {
    int x=4;
    
}
public class Final  {
    
/*class ex extends fin{
    public void dis(){
        System.out.println("x = "+x);
   هنا لما عملنا الكلاس فين من نوع فينال طوااالي رفض اعمل اكستند منو 
    }
}\*
\*/
    
    class stud {
 final int val;
 stud() {
  val = 60;
 }
 void method() {
  System.out.println(val);
 }
    }
    public static void main(String[] args) {
        stud st =new stud();
        st.method();
        
    }
    
}
