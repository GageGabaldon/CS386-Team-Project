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
  ![UML Diagram](/Deliverables/diagramfilename.png)
  
  ##### Classes:
  - *Class Player*: attributes->( health, inventory, location, moraleStat )
  
  - *Class PlayerStats*: A potential super class. 
  
  - *Class World*: attributes->( story-location, player-location )
  
  - *Class Item*: (item type, use item )
  
  - *Class Story*: ( event-location )
  
  - *Class Location*: (Name, ID, Description)
  
  - *Class Activities*: handles screen stuff.
  
  - *Class NPC*: (health, where they come into the story)
  
  - *Class Event*: ( player-dialogue/user’s choice, event-dialogue )
  
  - *Class UpdateGame*: (operation: update activities)


### Class Responsibilities
  + **Player** class handles stuff related to the player. This includes attributes like health, 
  where the player is, and what items the player has. We have this class to keep track of stuff the player does.

  + **PlayerStats** class is used as a superclass for both players and NPCs. We have included this because 
  both players and NPCs have a health stat as well as a location.

  + **World** class will handle the sort of “back end” of our game. World class will keep track of the player 
  and their location which will make saving progress to a database more easily achievable.

  + **Item** class will handle all the items the player can interact with, whether it is by picking the item up 
  or having it in the inventory and actually using it, its names, and its categories.

  + **Story** class will handle anything related to the story including actual story text as well as choices that 
  will be presented to the user. We have included this to manage the main story behind our game and keep track of 
  what is currently going on for the user to interact with.

  + **Location** class will handle the current location in terms of the story. Location refers to where the 
  player is currently at in the story. We have included this the make is easier to track where the player 
  is and share this to the world class for saving purposes.

  + **Activities** class will handle the UI and what is currently being displayed on the screen. We have included 
  this to handle updating the screen when a new location is reached so we do not have to keep making new activities.

  + **NPC** class will handle anything to do with NPCs that the player comes across in the story. 
  This will help keep track of recurring characters and handle health stats for combat purposes.

  + **Event** Class will work with handling anything to do with events happening in the story such as 
  something requiring user input or interaction. This will include handling cases where the 
  user makes a choice and update what happens with the location and activities class.

  + **UpdateGame** class will work closely with the activities class to update the current state of the game. 
  This will include things like changing the current activity and updating the user’s location.
 


