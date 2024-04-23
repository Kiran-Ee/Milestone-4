package Operations;


public class Addiu implements Operation{
    private String rs = "";
    private String rt = "";
    private String immediate = "";

    public Addiu(String rs, String rt, String immediate){
        this.rs = rs;
        this.rt = rt;
        this.immediate = immediate;
    }

    @Override
    public String  operate() {
        return null;
    }
}
