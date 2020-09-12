
public class SelectiveIteration {
    public static void main(String[] args) {

        int num = 1500;
        int i=0;
        while(i <1500){


            if (i%3==0) {
                i++;
                continue;
            }
            if ( (i+5)%7==0){
                i++;
                continue;
            }
            if(i%10==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}