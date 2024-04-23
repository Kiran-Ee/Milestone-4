package Operations;


public class Or implements Operation {
    private String rs = "";
    private String rt = "";
    private String rd = " ";

    public Or(String rs, String rt, String rd){
        this.rs = rs;
        this.rt = rt;
        this.rd = rd;
    }

    @Override
    public String operate() {
        return null;
    }

}
