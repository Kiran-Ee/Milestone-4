package Operations;

import CPU.CPU;

import java.util.HashMap;

public class Sub implements Operation {
    private String rs;
    private String rt;
    private String rd;

    public Sub(String rs, String rt, String rd){
        this.rs = rs;
        this.rt = rt;
        this.rd = rd;
    }

    @Override
    public String operate() {
        return null;
    }
}
