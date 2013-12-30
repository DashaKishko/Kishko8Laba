

package kishkolaba8;

import bsuir.mycommand.Command;


public class StereoOffCommand implements Command{
    Stereo stereo;
    
    public StereoOffCommand( Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        stereo.off();
        
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
