import java.net.Socket;

public class Greenhouse {
    public String Name;
    public boolean sprinklerisOn;
    public int numberOfFlowers;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }

    public Greenhouse() {
        System.out.println("Hello World! Good luck on your exams!");
        Name = "Planting Parameters at the CSG";
        sprinklerisOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + Name + "!" + "It is " + sprinklerisOn + " that we are waterting plants right now. We have " + numberOfFlowers + " flowers!");
        numberOfFlowers = 80;
        System.out.println("Welcome to " + Name + "!" + "It is " + sprinklerisOn + " that we are waterting plants right now. We have " + numberOfFlowers + " flowers!");
        System.out.println(" ");
        randomReplant();
        System.out.println(" ");
        veggieOFTheDay("carrots.");
        System.out.println(" ");
        countFlowers();
        System.out.println(" ");
        changeTemperature();
        System.out.println(" ");
        kimPlant.printInfo();
        System.out.println(" ");
        myPlant.printInfo();
        System.out.println(" ");
        starTriangle(7);
        System.out.println(" ");
        perimeterTriangle(3);
    }

    public void randomReplant() {
        int randomInt;
        randomInt = (int) (Math.random() * 16);
        System.out.println("We are replating " + randomInt + " vegetables today!");

    }

    public void veggieOFTheDay(String veggie) {
        System.out.println("Today's chosen veggie is " + veggie);
    }

    public void countFlowers() {
        for (int x = 2; x < 7; x = x + 1) {
            System.out.println(x+" ");

        }
        System.out.println(" ");
        for (int x=20; x<111; x=x+30){
            System.out.println(x+" ");
        }
        System.out.println(" ");
        for (int x=8; x>-1; x=x-1 ){
            System.out.print(x+", ");
        }
    }

    public void changeTemperature(){
        double randomNum;
        randomNum = (Math.random()*0.99999);
        if(randomNum<.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }
        if(randomNum>.25&&randomNum<.5){
            System.out.println("The temperature has decreased by 1 degrees");
        }
        if(randomNum>.5&&randomNum<.75){
            System.out.println("The temperature has increased by 1 degrees");
        }
        if(randomNum>.75&&randomNum<1){
            System.out.println("The temperature has increased by 2 degrees");
        }
    }
    Plant kimPlant = new Plant(3,"orange",true);
    Plant myPlant = new Plant(5,"vibrent blue",true);

    public void starTriangle(int size){
        for(int y=1;y<size+1; y=y+1){
            for (int x=0; x<y; x=x+1){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void perimeterTriangle(int size){
            for(int y=1;y<size+1; y=y+1){
                for (int x=0; x<y; x=x+1){
                    System.out.print("-");
                }
                System.out.print("*");
                System.out.println(" ");
            }

        }
    }



