
public class UsingTernaryOperator {
    public static void main(String[] args) {

                double num = -10000001;
                String message;

  //      message = (num<0) ? "Small" : "";
//        message = (num>1000000) ? "Large" : "";



        message=(num<0 ? "Small" : num>10000000 ? "Large" : "Number is not Large or Small");

        System.out.println(message);
            }
        }
