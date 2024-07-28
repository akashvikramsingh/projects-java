class Abc{
    public  int a;
    Abc(int a){
        this.a=a;
    }

}
public class HI {


    public static void main(String[] args) {
        Abc obj= new Abc(5);
        System.out.println(obj.a);
    }
}