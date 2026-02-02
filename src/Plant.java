import java.net.Socket;

public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;

    public Plant(int pnumWeeksOld,String pcolor,boolean pisEdible){
        numWeeksOld = pnumWeeksOld;
        color = pcolor;
        isEdible = pisEdible;
    }

    public void printInfo(){
        System.out.println("It is " + numWeeksOld + " weeks old" + "\n" + "It is the color " + color + "\n" + "It is " + isEdible + " that it is edible");
    }
}
