package Operations;


public class Beq implements Operation {
    private String rs = "";
    private String rt = "";
    private String offset = "";

    public Beq(String rs, String rt, String offset) {
        this.rs = rs;
        this.rt = rt;
        this.offset = offset;
    }

    @Override
    public String operate() {
        return null;
    }
}
