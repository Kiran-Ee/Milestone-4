package Operations;


public class AndI implements Operation {
    private String rs = "";
    private String rt = "";
    private String immediate = "";


    public AndI(String rs, String rt, String immediate){
        this.rs = rs;
        this.rt = rt;
        this.immediate = immediate;
    }

    @Override
    public String  operate() {
        return null;
    }
}
