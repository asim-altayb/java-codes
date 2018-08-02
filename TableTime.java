
package tabletime;

import java.util.Scanner;


public class TableTime {
     
     
    
      Scanner in =new Scanner (System.in);
     
    public void data (){
        int teachers ;
        int Material1;
        int Material2;
        int Material3;
        int Material4;
       
        
        
       
        
        //==teachers memmber 
        System.out.println("Enter the number of teachers :");
        teachers=in.nextInt();
        
        String [] teach = new String[teachers];
        int [] hoursteach = new int [teachers];
        
        for(int i=0 ; i < teach.length ;i++){
            
            
            
            System.out.println("Enter name of teacher "+(i+1) );
            teach[i]=in.next();
            
            System.out.println("Enter the hours of work to "+teach[i] + " peer week ");
            hoursteach[i] = in.nextInt();
            
        }
        
        
        //Materials memmber lacture one 
        System.out.println("Enter the number of lacture in semester one  :");
        Material1=in.nextInt();
        String [] mat1 =new String[Material1];
        int [] mathours1 = new int [Material1];
        
        for(int i=0 ; i<mat1.length ;i++){
            
            System.out.println("Enter name of lacture "+(i+1)+" of semester one :");
            mat1[i]=in.next();
            
            System.out.println("Enter the hours  of lacture "+mat1[i]+" of semester one  peer week :");
            mathours1[i]=in.nextInt();
        }
        
        
        //Materials memmber of lacture tow 
        System.out.println("Enter the number of lacture in semester tow  :");
        Material2=in.nextInt();
         String [] mat2 =new String[Material2];
         int [] mathours2 = new int[Material2];
        
         for(int i=0 ; i<mat2.length ;i++){
            
            System.out.println("Enter name of lacture "+(i+1)+" of semester tow :");
            mat2[i]=in.next();
            
            System.out.println("Enter the hours  of lacture "+mat2[i]+" of semester tow peer week  :");
            mathours2[i]=in.nextInt();
        }
        
        
        //Materials memmber of lacture three
        System.out.println("Enter the number of lacture in semester three   ");
        Material3=in.nextInt();
         String [] mat3 =new String[Material3];
        int [] mathours3 = new int [Material3];
        
         for(int i=0 ; i<mat3.length ;i++){
            
            System.out.println("Enter name of lacture "+(i+1)+" of semester three :");
            mat3[i]=in.next();
            
            System.out.println("Enter the hours  of lacture "+mat3[i]+" of semester three  peer week :");
            mathours3[i]=in.nextInt();
        }
         
         //Materials memmber of lacture three
        System.out.println("Enter the number of lacture in semester four   ");
        Material4=in.nextInt();
         String [] mat4 =new String[Material4];
        int [] mathours4 = new int [Material4];
        
         for(int i=0 ; i<mat4.length ;i++){
            
            System.out.println("Enter name of lacture "+(i+1)+" of semester four :");
            mat4[i]=in.next();
            
            System.out.println("Enter the hours  of lacture "+mat4[i]+" of semester four  peer week :");
            mathours4[i]=in.nextInt();
        }
         
         
         
         int dofwek;
         System.out.println("enter the number of days of week :");
         dofwek =in.nextInt();
          int allhteach = 0;
        for(int i=0 ;i<hoursteach.length;i++){
           
         allhteach+=   hoursteach[i];
            
        }
        
        int mofwek=0;
      for(int i=0 ; i<mathours1.length;i++){
          mofwek+=mathours1[i];
      }
      
         for(int i=0 ; i<mathours2.length;i++){
          mofwek+=mathours2[i];
      }
         
           for(int i=0 ; i<mathours3.length;i++){
          mofwek+=mathours3[i];
      }
           
            for(int i=0 ; i<mathours4.length;i++){
          mofwek+=mathours4[i];
      }
           
         int allhwek=mofwek/2;
         if(mofwek%2!=0){
             allhwek++;
         }
     
        System.out.println("all lacture in one week =  "+allhwek);
        int allhtewek = allhteach/2;
        if(allhteach%2!=0){
            allhtewek++;
        }
        System.out.println("all lacture you have from teachers = "+allhtewek);
        
        int  [] lacture = new int [80];
        String res=null;
        
        
        for(int i=0;i<lacture.length;i++){
            //from 1-20 the first class 21-40 second 41-60 third 61-80 fourth .
            //index i + 4 "like متتاليه"..80 must be null to any teacher .
            //that string null to save result for ex teach A has lacture at index 4 we use "A =4 " "b =5" ...etc.
            
            
        }
        
        
          
        
    
}

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        TableTime obj = new TableTime();
        
      obj.data();
      
        
        
    }
    
}
