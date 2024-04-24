package Operations;


public class Bne implements Operation { //
    private String rs = "";
    private String rt = "";
    private String offset = "";

    public Bne(String rs, String rt, String offset) {
        this.rs = rs;
        this.rt = rt;
        this.offset = offset;
    }

    @Override
    public String operate() {
        return null;
    }
}
