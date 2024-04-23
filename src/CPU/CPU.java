package CPU;

import Operations.Operation;
import SecConverters.DataSecConverter;
import SecConverters.TextSecConverter;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

// will keep track of ALL registers & maybe mem
public class CPU {
    public static int zero = -1;
    public static int at = -1;
    public static int a0 = -1;
    public static int a1 = -1;
    public static int a2 = -1;
    public static int a3 = -1;
    public static int v0 = -1;
    public static int v1 = -1;
    public static int t0 = -1;
    public static int t1 = -1;
    public static int t2 = -1;
    public static int t3 = -1;
    public static int t4 = -1;
    public static int t5 = -1;
    public static int t6 = -1;
    public static int t7 = -1;
    public static int s0 = -1;
    public static int s1 = -1;
    public static int s2 = -1;
    public static int s3 = -1;
    public static int s4 = -1;
    public static int s5 = -1;
    public static int s6 = -1;
    public static int s7 = -1;
    public static int t8 = -1;
    public static int t9 = -1;
    public static int k0 = -1;
    public static int k1 = -1;
    public static int gp = -1;
    public static int sp = -1;
    public static int fp = -1;
    public static int ra = -1;

    public static String cpu(String hex_dta, String hex_txt) {
        return null;
    }

    public static HashMap<String, Integer> get_registers_state() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>() {
        };
        hm.put("$zero", zero);
        hm.put("$at", at);
        hm.put("$v0", v0);
        hm.put("$v1", v1);
        hm.put("$a0", a0);
        hm.put("$a1", a1);
        hm.put("$a2", a2);
        hm.put("$a3", a3);
        hm.put("$t0", t0);
        hm.put("$t1", t1);
        hm.put("$t2", t2);
        hm.put("$t3", t3);
        hm.put("$t4", t4);
        hm.put("$t5", t5);
        hm.put("$t6", t6);
        hm.put("$t7", t7);
        hm.put("$s0", s0);
        hm.put("$s1", s1);
        hm.put("$s2", s2);
        hm.put("$s3", s3);
        hm.put("$s4", s4);
        hm.put("$s5", s5);
        hm.put("$s6", s6);
        hm.put("$s7", s7);
        hm.put("$t8", t8);
        hm.put("$t9", t9);
        hm.put("$k0", k0);
        hm.put("$k1", k1);
        hm.put("$gp", gp);
        hm.put("$sp", sp);
        hm.put("$fp", fp);
        hm.put("$ra", ra);
        return hm;
    }

    public static void update_register(String reg, int val) {
        switch (reg) {
            case "$zero":
                zero = val;
                break;
            case "$at":
                at = val;
                break;
            case "$v0":
                v0 = val;
                break;
            case "$v1":
                v1 = val;
                break;
            case "$a0":
                a0 = val;
                break;
            case "$a1":
                a1 = val;
                break;
            case "$a2":
                a2 = val;
                break;
            case "$a3":
                a3 = val;
                break;
            case "$t0":
                t0 = val;
                break;
            case "$t1":
                t1 = val;
                break;
            case "$t2":
                t2 = val;
                break;
            case "$t3":
                t3 = val;
                break;
            case "$t4":
                t4 = val;
                break;
            case "$t5":
                t5 = val;
                break;
            case "$t6":
                t6 = val;
                break;
            case "$t7":
                t7 = val;
                break;
            case "$s0":
                s0 = val;
                break;
            case "$s1":
                s1 = val;
                break;
            case "$s2":
                s2 = val;
                break;
            case "$s3":
                s3 = val;
                break;
            case "$s4":
                s4 = val;
                break;
            case "$s5":
                s5 = val;
                break;
            case "$s6":
                s6 = val;
                break;
            case "$s7":
                s7 = val;
                break;
            case "$t8":
                t8 = val;
                break;
            case "$t9":
                t9 = val;
                break;
            case "$k0":
                k0 = val;
                break;
            case "$k1":
                k1 = val;
                break;
            case "$gp":
                gp = val;
                break;
            case "$sp":
                sp = val;
                break;
            case "$fp":
                fp = val;
                break;
            case "$ra":
                ra = val;
                break;
            default:
                System.out.println("Invalid register name: " + reg);
                break;
        }
    }


    public static String syscall_handler(int v0_val) { //TODO
        String return_string = "";
        switch (v0_val) {
            case 1:  //print int
                return_string = String.valueOf(a0);
                break;
            case 4: //print string
                String hex_a0 = Integer.toHexString(a0);
                return_string = DataSecConverter.data_mem.get(hex_a0); // handle key exception? ...
                break;
            case 5: //read int
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Int: ");
                v0 = Integer.parseInt(scanner.nextLine()); // handle exception ...
                break;
            case 10: //stop execution
                return_string = "-- program is finished running --";
                break;
            default:
                throw new IllegalArgumentException("Only allowed to perform syscall on $v0 = 1,4,5,10");
        }
        return return_string;
    }

    public static String run_program() { //TODO
        LinkedHashMap<String, Object[]> txtSec_translated = TextSecConverter.text_mem;
        Operation op = null;
        String return_string = ""; // only syscall returns
        for (Object[] instr : txtSec_translated.values()) {
            op = (Operation) instr[1];

            if (instr.equals("syscall")) return_string = syscall_handler(v0);
            else op.operate();
        }
        return return_string;
    }
}
