
package kishkolaba8;

import bsuir.mycommand.Command;


public class RemoteLoader {
    public static void main(String [] args){
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight =new Light("Living Room");
        Light kitchenLight =new Light("Kitchen");
        GarageDoor garageDoor=new GarageDoor("");
        CeiligFan ceilingFan=new  CeiligFan("Living Room");
        Stereo stereo=new Stereo("Living room");
        
        /*LightOnCommand livingRoomLightOn=
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn=
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff=
                new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn=
                new CeilingFanOnCommand(ceilingFan);*/
        CeilingFanOffCommand ceilingFanOff=
                new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh=
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium=
                new CeilingFanMediumCommand(ceilingFan);
        /*GarageDoorCLoseCommand garageDoorCLose=
                new GarageDoorCLoseCommand(garageDoor);
        GarageDoorOpenCommand garageDoorOpen=
                new GarageDoorOpenCommand(garageDoor);
        
        StereoOffCommand stereoOff=
                new StereoOffCommand(stereo);
        StereoOnWithCDCommand stereoOn=
                new StereoOnWithCDCommand(stereo);
        */
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);        
        //remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
       // remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        //remoteControl.setCommand(3, stereoOn, stereoOff);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        //remoteControl.offButtonWasPushed(1);
        //remoteControl.onButtonWasPushed(2);
        //remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        //remoteControl.offButtonWasPushed(3);
        
        Light light=new Light("Living room");
        TV tv=new TV("Living room");
        Stereo stereo1 = new Stereo("Living room");
        Hottub hottub=new Hottub();
        LightOnCommand light1On = new LightOnCommand(light);
        StereoOnWithCDCommand stereo1On=new StereoOnWithCDCommand(stereo1);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff=new StereoOffCommand(stereo1);
        TVOnCommand tvOn=new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCOmmand hottubOff = new HottubOffCOmmand(hottub);
        Command [] partyON={light1On,stereo1On,hottubOn, tvOn};
        Command [] partyOff={lightOff,stereoOff,hottubOff, tvOff};
        
        MacroCOmmand partyONmacro=new MacroCOmmand(partyON);
        MacroCOmmand partyOFFmacro=new MacroCOmmand(partyOff);
        
        remoteControl.setCommand(0, partyONmacro, partyOFFmacro);
        
        System.out.println(remoteControl);
        System.out.println("Pushed Macro ON");
        remoteControl.onButtonWasPushed(0);
        System.out.println("Pushed Macro Off");
        remoteControl.offButtonWasPushed(0);
        
        
    }   
}
