/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    public int hunger = 0;   // how hungry the pet is.
    public int joy = 10;
    public int stable = 10;
    public int tired = 5;
    public int life = 1;
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
        face.setMessage("Yum, thanks");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void die(){
        face.setImage("dead");
    }

    public void dead() {

    }

} // end Virtual Pet
