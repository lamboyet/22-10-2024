public class Calculator {

    double add(double a, double b){return a + b; }

    double subtract(double a, double b){ return a - b;}

    double multiply(double a, double b){return a * b;}

    double divide(double a, double b){
        if(b == 0){
            System.out.println("Error, division by 0");
            return 0;}
        return a/b;}


}
