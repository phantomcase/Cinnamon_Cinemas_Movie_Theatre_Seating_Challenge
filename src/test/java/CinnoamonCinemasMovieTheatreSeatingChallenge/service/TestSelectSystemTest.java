package CinnoamonCinemasMovieTheatreSeatingChallenge.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSelectSystemTest {

    @Test
    void testSelectSystemLastRequestMoreThenAvailable() {
        //Act
        var actualResult = new TestSelectSystem();
        var expectedResult = "This have 2 seats leave and 3 tickets request at last";

        //Assert
        assertEquals(expectedResult, actualResult);
    }
}