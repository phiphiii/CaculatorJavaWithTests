public class Main {
    double a,b;

    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Main(double a) {
        this.a = a;
    }

    public double add() {
        return a+b;
    }

    public double subtract() {
        return a-b;
    }

    public double multiply() {
        return a*b;
    }
    public Number divide() {
        if(b==0){
            return null;
        }
        else{
            return a/b;
        }
    }

    public double power(){
        return Math.pow(a,b);
    }

    public double sqroot(){
        return Math.sqrt(a);
    }
}