/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    public int hunger = 0;   // how hungry the pet is.
    public int joy = 10;
    public int stable = 5;
    public int tired = 5;
    public int life = 1;
    public int numinter = 0;
    public void check(){
        if(joy==0 ||hunger == 10 || tired == 10)
            this.die();
            life = 0;
        if(joy>10)
            joy=10;
        if(tired<0)
            tired = 0;
        if(hunger<10)
            hunger=0;
        if(stable == 0)
            this.Suffer();
    }
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        stable = stable - 1;
        joy = joy - 1;
        face.setMessage("Is it worth it?");
        face.setImage("sad");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 3;
        tired = tired - 1;
        joy = joy - 2;
        face.setImage("asleep");
    }

    public void die(){
        face.setImage("dead");
        life = 0;
    }

    public void Suffer() {
        face.setImage("No");
        life = 0;
    }

    public void thought(){
        if(joy <= 5 || stable <= 3){
            
        }
    }

    public void interact(){
        numinter ++;
        if(numinter == 1){
            face.setMessage("I think I like them");
            face.setImage("ecstatic");
            joy = joy + 2;
            hunger = hunger - 4;
        }
        if(numinter == 2){
            face.setMessage("They Like me too!");
            face.setImage("love");
            joy = joy + 5;
            hunger = hunger - 3;
            stable = stable - 3;
        }
        if(numinter == 3){
            face.setMessage("They told me to do it...");
            this.die();
        }
    }

} // end Virtual Pet
