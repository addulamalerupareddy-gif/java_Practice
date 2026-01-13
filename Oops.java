class pen{
    String color;
    String type;//ballpoint;gel

    public void Write (){
        System.out.println("Writting something");
    }
    public void printtype(){
        System.out.println(this.type);
    }
}
public class Oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printtype();
        pen2.printtype();
    }

}
