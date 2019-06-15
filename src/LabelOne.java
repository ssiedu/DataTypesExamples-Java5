public class LabelOne {
    public static void main(String args[]){
        
    x:     for(int i=1; i<=5; i++){
    y:      for(int j=1; j<=5; j++){
                if(j==3)
                    break x;//breaking the outer loop
                
                System.out.println(j);
            }
        }
        //exit of outer
    }
}
