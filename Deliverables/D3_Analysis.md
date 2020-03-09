# D.3 Analysis
---

### System Description
  The problem of being bored and looking for an immersive gaming experience affects **players**; 
  the impact of which is being unable to find a game or experience that helps pass time. 
  TextAdventureGame is a text adventure game that immerses the **player** in a **story** in which 
  they can choose their own path or **story**. TextAdventureGame keeps users engaged by providing multiple 
  :choices: to the **player** that ultimately :decides: how the **story** plays out. TextAdventureGame encourages 
  creativity and personal choice to give **players** an open-ended story.
  
  The **player** will be able to choose a name for their character before starting the game. 
  A character has specific attributes such as their *health*, *inventory*, and current **location**. 
  Once in the game, the **player** will be presented with elements of the **story** that lead to the **player** 
  being presented a *choice*. The **player** will continue through the **story** making :choices: until the end 
  of the game is reached. Along the path of the **story** the **player** will be able to interact with and combat 
  **Non Playable Characters** through events that require another *choice*. The **NPC’s** have their own attributes 
  such as *health* and **location**. The **player** will come across **items** that they can pick up and add to the
  *inventory*. These **items** may be used to affect other :choices: or change the **players** stats such as *health*.
  As a whole, there is a world that encapsulated the current position of the **story** which includes the 
  **player** and their attributes, as well as the current **location**. A separate class activities will handle the UI 
  and update what parts of the **story** are displayed on the current screen as well as the possible :choices:. 
  An **activities** and **update game** class will be used to update the UI and keep the :buttons: and other elements of
  the UI updated. 
  
### Model

  ##### UML Diagram

  ![UML Diagram](/Deliverables/UMLDiagram.png)

  
  ##### Classes:
  - *Class Player*: ( attribute: health; inventory; location; morality Stat;, operation: )
  
  - *Class PlayerStats*: ( attribute:, operation: reduce health; increase health; increase morality; decrease morality; ) 
  
  - *Class World*: ( attribute: story-location; player-location;, operation: update player-location; )
  
  - *Class Item*: ( attribute: item type; item use state; use item;, operation: use item; )
  
  - *Class Story*: ( attribute: event-location;, operation: update event; )
  
  - *Class Location*: ( attribute: name; ID; description;, operation: )
  
  - *Class Activities*: ( attribute:, operation: update screen; )
  
  - *Class NPC*: ( attribute: health; event-location; story-location;, operation: )
  
  - *Class Event*: ( attribute: player-dialogue; event-dialogue; NPC's;, operation: )
  
  - *Class UpdateGame*: ( attribute:, operation: access database info; load player dialogue; load event dialogue; )


### Class Responsibilities
  + **Player** class handles information related to the player. This includes attributes like health, 
  where the player is, and what items the player has. We have this class to keep track of the player as it progresses in the story.

  + **PlayerStats** class is used as a superclass for both players and NPCs. We have included this to update the health and morality score 
  player has a health and morality stat. NPC has a health stat.

  + **World** class will track the location of the story and player location for our game. World class will update the players location given the current location in story based on the story class.

  + **Item** class will handle all the items the player can interact with, whether it is by picking the item up 
  or having it in the inventory and actually using it, its name, usability and type.

  + **Story** class will handle events presented to the user. It manages the main story behind our game and keeps track of what is currently going on for the user to interact with.

  + **Location** class will hold the name of the location, an ID to track the location, and a description to use in dialogue for the user to know where they are. Location refers to where the 
  player is currently at in the story. We have included this the make is easier to track where the player 
  is and share this to the world class for saving purposes.

  + **Activities** class will handle the UI and what is currently being displayed on the screen. We have included 
  this to handle updating the screen when a game starts, is loaded, or a new location is reached so we do not have to keep making new activities.

  + **NPC** class will handle anything to do with NPCs that the player comes across in the story. 
  This will store information to be able to handle health stats for combat purposes.

  + **Event** class will contain dialogue for the player to input and dialogue for the event in the story. This will also include a list of NPC's that will be in the event.

  + **UpdateGame** class will work closely with the activities class to update the current state of the game. 
  This will include things like retrieving and storing the current state of the game for the Activities class to update the UI.
 


