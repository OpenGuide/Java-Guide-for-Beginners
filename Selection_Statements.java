
package selectionstatements;


public class Selection_Statements {
          public static String IfElse(int x){
              if(x%2==0){
                  return "even";
              }
              else{
                  return "odd";
              }
          }
        public static String Switch(int x){
            switch(x){
                    case 1 :
                        return "it's one";
                    case 2 :
                        return "it's two";
                    case 3 :
                        return "it's three";
                    default:
                        return "out of my knowledge";
            }
        }    
            
   
    public static void main(String[] args) {
       Selection_Statements obj = new Selection_Statements();
       String y = obj.IfElse(123);
       System.out.println("The number is "+ y);
       String x=obj.Switch(2);
       System.out.println("switch statements result is :"+ x);
    }
    
}
