package Operations;

import CPU.CPU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    Add add = null;
    String a0 = "$a0";
    String a1 = "$a1";
    String a2 = "$a2";

    int a0_val = 4;
    int a1_val = 10;
    int a2_val = 15;

    int exp_add1 = 14;


    @BeforeEach
    public void setUp() {
        CPU.a0 = a0_val;
        CPU.a1 = a1_val;
        CPU.a2 = a2_val;
    }

    @Test
    public void setAdd1(){
        add = new Add(a0, a1, a2);
        add.operate();
        assertEquals(CPU.a2 , exp_add1);
    }

}