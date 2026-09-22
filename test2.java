public class test2{
    public static void main(String[] args){
        double r=0.01*100;
        System.out.println("乘= "+r);

        double s=0;//用double和float也不一样
        for(int i=0;i<100;i++){
            s+=0.01;
        }
        System.out.println("加= "+s);
    }
}
