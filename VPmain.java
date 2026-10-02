import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.feed();
        this.waitABeat(100);
        vp.exercise();
        this.waitABeat(500);
        String ans = this.askForInput("?");
        if (ans == "yes"){
            vp.sleep();
            this.waitABeat(500);
        }
        else{
            vp.exercise();
            this.waitABeat(500);
        }
    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

