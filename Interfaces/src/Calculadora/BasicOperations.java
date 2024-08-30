package Calculadora;

public class BasicOperations {
    public static class Addition implements Operation{
        public int execute(int a, int b){
            return a+b;
        }
    }

    public static class substract implements Operation{
        public int execute(int a, int b){
            return a-b;
        }
    }

    public static class multiplication implements Operation{
        public int execute(int a, int b){
            return a*b;
        }
    }

    public static class division implements Operation{
        public int execute(int a, int b){
            return a/b;
        }
    }
}
