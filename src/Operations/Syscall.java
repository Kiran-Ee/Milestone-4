package Operations;


import CPU.CPU;

import java.util.HashMap;

public class Syscall implements Operation {

    public Syscall(){
        // may not be needed any additional parsings for syscall
    }

    @Override
    public String operate() {
        HashMap<String,Integer> hm = CPU.get_registers_state();
        int v0_val = hm.get("$v0");

        return CPU.syscall_handler(v0_val);
    }
}
