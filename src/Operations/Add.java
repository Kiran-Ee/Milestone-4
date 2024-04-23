package Operations;


import CPU.CPU;

import java.util.HashMap;

public class Add implements Operation {
    private String rs;
    private String rt;
    private String rd;

    public Add(String rs, String rt, String rd){
        this.rs = rs;
        this.rt = rt;
        this.rd = rd;
    }

    @Override
    public String operate() {
        HashMap<String, Integer> hm = CPU.get_registers_state();

        int rs_val = hm.get(rs);
        int rt_val = hm.get(rt);

        int sum = rs_val + rt_val;

        CPU.update_register(rd, sum);
        return "";
    }
}
