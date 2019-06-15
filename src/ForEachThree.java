public class ForEachThree {
    public static void main(String args[]){
        
        int ar[][]={{10,20},{30,40},{45,55},{90,95},{11,22}};
        
        for(int tmp[]:ar){
            for(int num:tmp){
                System.out.print(num+"\t");
            }
            System.out.println("");
        }
        
        
        
        
    }
}
