package jp.ac.aiit.pbl;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolcanoParserTest {
        @Test
        public void parseTest(){
            VolcanoParser parser = new VolcanoParser();
            //Prefix prefix = parser.parse("010100111010110111110010110001010001010000000000000001010001000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000001111000101001010111010100");
            Volcano volcano = parser.parse("010100111010110111110010110001010001010000000000000001010001000000001100101010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000001111000101001010111010100");
            System.out.println(volcano.toString());
        }
    }
