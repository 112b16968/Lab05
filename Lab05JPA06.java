public class Lab05JPA06 {
    public static void main(String[] args) {
        System.out.println("圓形面積為:"+circle());
        System.out.println("三角形面積為:"+triangle());
        System.out.println("長方形面積為:"+rectangle());
        double rectangle = rectangle();
        System.out.println("此圖形面積為:"+(circle()+triangle()+rectangle));
    }
    public static double circle(){
        
        int radius = 5;
        double PI = 3.1415926;
        return radius*radius*PI;
    }
    public static double triangle(){
     int bottom = 10;
     int height = 5;
     return (bottom*height)/2;   
    }
    public static int rectangle(){
        int length = 5;
        int width = 10; 
        return length*width;
    }
}
