package Operations;


public class Lw implements Operation {
    private String base = "";
    private String rt = "";
    private String offset = "";


    public Lw(String base, String rt, String offset) {
        this.base = base;
        this.rt = rt;
        this.offset = base;
    }

    @Override
    public String operate() {
        return null;
    }
}
