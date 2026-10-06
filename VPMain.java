import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain(){
        while(vp.life == 1){
            String ans = this.askForInput("What should I do? [Eat] [Sleep] [Think] [Friend]");
            if (ans.equals("Eat")){
                vp.feed();
                this.waitABeat(5000);
            }
            else if(ans.equals("Sleep")){
                vp.sleep();
                this.waitABeat(5000);
            }
            else if(ans.equals("Think")){
                this.waitABeat(5000);
            }
            else if(ans.equals("Friend")){
                vp.interact();
                this.waitABeat(2000);
            }
            else{
                vp.Suffer();
                vp.life = 0;
            }
            vp.check();
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


