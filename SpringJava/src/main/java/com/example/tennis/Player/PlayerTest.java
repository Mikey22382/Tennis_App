package com.example.tennis.Player;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class PlayerTest {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;

    @Before
    public void setUp() throws Exception {
        player1 = new Player(1, "Chase", 3.0);
        player2 = new Player(2, "Mike", 3.0);
        player3 = new Player(3, "Chris", 3.0);
        player4 = new Player(4, "Noah", 3.0);
    }

    @Test
    public void TestId() {
        Assert.assertEquals(1, player1.getId());
    }

    @Test
    public void testIdChange() {
        player1.setId(10);
        Assert.assertEquals(10, player1.getId());
    }

    @Test
    public void testName() {
        Assert.assertEquals("Chase", player1.getName());
    }

    @Test
    public void testNameChange() {
        player1.setName("Chris");
        Assert.assertEquals("Chris", player1.getName());
    }

    @Test
    public void testRank() {
        Assert.assertEquals(3.0, player1.getRank(), 0.1);
    }

    @Test
    public void testRankChange() {
        player1.setRank(3.5);
        Assert.assertEquals(3.5, player1.getRank(), 0.1);
    }

    @Test
    public void testPreviousMatches() {
        Assert.assertEquals(0, player1.getPreviousMatches().size());
    }

    @Test
    public void testPreviousMatchesChange() {
        player1.addPreviousMatches(player2);
        player1.addPreviousMatches(player3);

        ArrayList<Player> testList = new ArrayList<Player>(Arrays.asList(player2, player3));
        Assert.assertEquals(testList, player1.getPreviousMatches());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddPreviousMatchesNull() {
        player1.addPreviousMatches(null);
    }

    @Test
    public void testHasPlayed() {
        Assert.assertEquals(true, player1.hasPlayed(player2));
    }

    @Test
    public void testHasNotPlayed() {
        Assert.assertEquals(false, player1.hasPlayed(player4));
    }





        
}
