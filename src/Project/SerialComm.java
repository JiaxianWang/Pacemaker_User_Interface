/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.nio.ByteBuffer;
import java.util.Arrays;
/**
 *
 * @author BRUCE WANG
 */
public class SerialComm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = 250;
        byte [] bytes = ByteBuffer.allocate(4).putInt(data).array();
        System.out.println(Arrays.toString(bytes));
    }
    
}
