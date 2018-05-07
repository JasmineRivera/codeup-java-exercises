//    Create a class named MethodsExercises. Inside of your class, write to code
// to create the specified methods. Test your code by creating a main method and
// calling each of the methods you've created.
//
//        1. Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the
//   operation can be performed.

public class MethodsExercises {
    public static void main(String[] args) {
    }
        public static int addMethod ( int numberA, int numberB){
            int result = numberA + numberB;
            return result;
        }
        public static int subMethod ( int numberA, int numberB){
            int result = numberA - numberB;
            return result;
        }
        public static int multMethod ( int numberA, int numberB){
            int result = numberA * numberB;
            return result;
        }
        public static int divMethod ( int numberA, int numberB){
            int result = numberA / numberB;
            return result;
        }
        public static int modMethod ( int numberA, int numberB){
            int result = numberA % numberB;
            return result;
        }

}

//    Test your functions and verify the output.
//
//        Add a modulus function that finds the modulus of two numbers.
//
//        Food for thought: What happens if we try to divide by zero? What should happen?

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at MethodsExercises.divMethod(MethodsExercises.java:33)
//	at MethodsExercises.main(MethodsExercises.java:18)