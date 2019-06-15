public class ForEachTwo {
    
    public static void add(int ar[]){
        int sum=0;
        
        for(int n:ar){
            sum=sum+n;
        }
        
        System.out.println(sum);
    }
    
    public static void main(String args[]){
        
        int x[]={10,20,30,40,50};
        int y[]={10,20,30,40,50,60,70,80};
        int z[]={11,12,13,14};
        add(x);   
        add(y);
        add(z);

        
        
    }
}
