package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameParserTest {

    @Test
    public void format_firstAndLast_shouldReturnLastCommaFirst() {

        //arrange
        String result = NameParser.format("adrian", "rodriguez");
        String expected = "rodriguez, adrian";

        //assertion
        assertEquals(expected, result);
    }

    @Test
    public void format_AllPieces_should_return_AllPiecesInProperFormat() {

        //arrange
        String result = NameParser.format2("Mr.", "Adrian", "O.", "Rodriguez", "PHD");
        String expected = "Rodriguez, Mr. Adrian O., PHD";

        //assertion
        assertEquals(expected, result);
    }

}