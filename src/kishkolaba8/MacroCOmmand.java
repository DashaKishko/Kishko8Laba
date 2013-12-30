

package kishkolaba8;

import bsuir.mycommand.Command;


public class MacroCOmmand implements Command{
    Command []commands;
    
    public MacroCOmmand( Command []commands){
        this.commands=commands;
    }
    @Override
    public void execute() {
        for(int i=0; i<commands.length; i++)
            commands[i].execute();
    }

    @Override
    public void undo() {
        
    }
    
}
