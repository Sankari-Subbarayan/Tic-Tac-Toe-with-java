import java.util.*;
abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}
class Addition extends IntBinaryOperation{
    public Addition(int firstArg,int secondArg){
        super(firstArg,secondArg);
    }
    public int perform( ){
        return firstArg+secondArg;
    }
}
class Multiplication extends IntBinaryOperation{
    public Multiplication(int firstArg,int secondArg){
        super(firstArg,secondArg);
    }
    public int perform( ){
        return firstArg*secondArg;
    }
}
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int firstNum=s.nextInt();
//        int secondNum=s.nextInt();
//        IntBinaryOperation addition = new Addition(firstNum, secondNum);
//        System.out.println("Addition: " + addition.perform());
//
//        // Perform Multiplication
//        IntBinaryOperation multiplication = new Multiplication(firstNum, secondNum);
//        System.out.println("Multiplication: " + multiplication.perform());
//    }
//}

// declare and implement your classes here