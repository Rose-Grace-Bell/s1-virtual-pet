public class name {
    private String first;
    private String last;

    public name(String f, String l){
        first = fixCase(f);
        last = fixCase(l);
    }

    public String fullName(){
        return first + " " + last;
    }
    public String fixCase(String part){
        part = part.toLowerCase();
        return part.substring(0,1).toUpperCase() + part.substring(1);
    }
}
