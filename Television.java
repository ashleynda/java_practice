public class Television {
    private boolean turnOn;
    private boolean turnOff;
    private int volume;
    private int chnagechannels;
    private boolean mute;


    public boolean turnOn(){
        return turnOn;
    }
    public void setOn(){
        if(turnOn){
        turnOn ==true;
       }
    }
    public boolean turnOff(){ 
        if(turnOff){
        turnOff == false;
       }   
    }
    public void increaseVolume(int increaseVolume){
        if(turnOn && increaseVolume < 25){
        increasVolume++
    }
        System.out.println
    }
    public int getIncreaseVolume(){
        return volume;
    }

}
