package Operations;

public class Ori implements Operation {
    private String rs = "";
    private String rt = "";
    private String immediate = "";

    public Ori(String rs, String rt, String immediate){
        this.rs = rs;
        this.rt = rt;
        this.immediate = immediate;
    }

    @Override
    public String  operate() {
        return null;
    }
}
