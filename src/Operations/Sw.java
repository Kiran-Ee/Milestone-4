package Operations;


public class Sw implements Operation {
    private String base = "";
    private String rt = "";
    private String offset = "";

    public Sw(String base, String rt, String offset) {
        this.base = base;
        this.rt = rt;
        this.offset = base;
    }

    @Override
    public String operate() {
        return null;
    }
}
