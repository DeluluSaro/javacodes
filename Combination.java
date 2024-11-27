import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static int fact(int as){
        
        int f=1;

        for(int i=1;i<=as;i++){
            f=f*i;
        }
        return f;
    }
    
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();

        numbers.add(19);
        numbers.add(19);
        numbers.add(19);
        numbers.add(19);
        numbers.add(24);

        int n=numbers.size();
        int r=2;
        int Combination=fact(n)/(fact(r)* fact(n-r));

        System.out.println(Combination);

        

        
    }
}
