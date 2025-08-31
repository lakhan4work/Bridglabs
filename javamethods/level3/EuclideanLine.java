public class EuclideanLine {
    public static void main(String[] args) {
        int x1=1,y1=2,x2=4,y2=6;

        System.out.println("Euclidean Distance = " + distance(x1,y1,x2,y2));
        equationOfLine(x1,y1,x2,y2);
    }

    static double distance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    static void equationOfLine(int x1,int y1,int x2,int y2) {
        int a = y2-y1;
        int b = x1-x2;
        int c = (x2*y1 - x1*y2);
        System.out.println("Equation: "+a+"x + "+b+"y + "+c+" = 0");
    }
}
