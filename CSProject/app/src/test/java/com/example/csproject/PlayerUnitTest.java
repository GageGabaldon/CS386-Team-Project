package com.example.csproject;

import com.example.csproject.Characters.Player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class PlayerUnitTest {
    Player player = Player.getInstance();

    @Test
    public void testPlayerName()
    {
        player.setName( "John Doe" );
        assertEquals(player.getName(), "John Doe" );
    }

    @Test
    public void testPlayerHealth()
    {
        assertEquals( player.getHealth(), 100 );
    }
}
