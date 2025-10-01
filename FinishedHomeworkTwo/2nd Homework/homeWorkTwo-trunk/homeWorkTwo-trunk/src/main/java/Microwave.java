public class Microwave extends Device{
int maxTime;

    public Microwave(int startPower, int maxCookingTime){
        super.powerLevel = startPower;
        this.maxTime = maxCookingTime;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Max Cooking time " + maxTime);
    }

    public void heatFood(){
        System.out.println("Food is heating.");
    }
}
