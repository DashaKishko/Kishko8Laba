package kishkolaba8;


public class RemoteControlTest {
    public static void main(String [] args){
        SimpleRemotCOntrol remote= new SimpleRemotCOntrol();
         Light light=new Light();
         GarageDoor garageDoor=new GarageDoor();
         LightOnCommand lightOn = new LightOnCommand(light);
         GarageDoorOpenCommand garageOpen
                 =new GarageDoorOpenCommand(garageDoor);
         remote.setCOmmand(garageOpen);
         remote.buttonWasPressed();
         remote.setCOmmand(lightOn);
         remote.buttonWasPressed();
    }  
    
}
