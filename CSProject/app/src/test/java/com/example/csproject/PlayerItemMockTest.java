package com.example.csproject;
import com.example.csproject.Characters.Item;
import com.example.csproject.Characters.Player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PlayerItemMockTest {
    @Mock
    Item book1 = new Item( "Book", "A small book with a red cover.", "utility" );

    Player player = Player.getInstance();

    @Test
    public void testPlayerInventory()
    {
        player.inventory.add( book1 );
        assertEquals( player.inventory.contains( book1 ), true );
    }
}
