
package kishkolaba8;

import bsuir.mycommand.Command;


public class SimpleRemotCOntrol {
    Command slot;
    public SimpleRemotCOntrol(){
        
    }
    public void setCOmmand(Command command){
        slot=command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
