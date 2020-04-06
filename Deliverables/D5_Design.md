# D5 Design
---

### Description
  Our system consists primarily of three parts, a user interface, a story composed of directories and files, and a tracked world state. The user interface is integral to our system, because it is the intermediary between the other components of our system and the player. The story module in our system will contain all events as files stored in their relevant story segments represented as directories. All story segments will be located in a master directory considered as our story module. The world state contains player information such as the players health, inventory, available choices, current made choices, and the current stories the player is or has participated in. It will not only contain the players data, but the world's data as well. That will include the current location of the player, all locations that exist, and all items in each location.

  This is how the three major parts interact with each other: as the story information is updated in the world, relevant information will be displayed to the player using the user interface. A description for the current story event will be displayed on the players phone with a selection of available choices for the current event. The player will select a choice which then is processed by our world to determine what can happen next in the story. The decided choice is stored, the completed event is stored, and if the location is changed or the story is finished, then the former or latter is updated. A completion of a story will store the story with a record of all decided choices. This will repeat as a cycle of beginning a story, being given a description of the event, making a decision, progressing to a new event guided by the players previous decisions, and finally, once reaching a final event, completing the story. As this cycle repeats, the players stats will update as well as items being obtained and used.

### Architecture

![Architecture](/Deliverables/art.png)

In our architecture we have two main components: the server and the android app. For the android application, every dotted line represents a class that contains another class. The main components of the app are Story Components, Character, and Game Activity. The story components use a data retrieval package to get information. The packages in the main app components are the same as the major packages but are more refined in the details and represent more dependencies. Our app also uses the server to get information from the database.

### Class Diagram
![ClassDiagram](/Deliverables/RevisedUML.png)

### Sequence Diagram

![SequenceDiagram](/Deliverables/StoryUpdateSequenceDiagram.png)

Use Case: Update Story
I. Brief Description: Demonstrates the process to updating the current event in the story of the game

II. Actors: Player

III. Preconditions: The player has opened the app and started a session

IV. Flow of Events:
1. The system retrieves the current events description and available choices for the current story
2. The system displays the description and available choices
3. The Player will select one choice displayed on screen
4. The system will process the selected choice.
5. The system will access the next event file.
6. The system will loop back to step 1.

V. Alternative Flows:
4.1 The current event completed is the last in the story
4.2 The system retrieves available stories
4.3 The system displays the available stories as choices for the player
4.4 The player selects a story
4.5 The system returns to step 1.

4.2.1  There are no available stories
4.2.2 The system displays message of completion of game
4.2.3 The system returns to menu


VI. Key Scenarios:
Player makes a choice and progresses through the game's current storyline.
Player completes the current storyline and starts a new storyline.
Player has no stories left to play so the game ends and returns to the menu.

VII. Post-Conditions: Player reaches end of the game.

### Design Patterns

1. **Singleton**: *Creational* - One and only one instance of the Player class should exist. Some attributes are static and private to prevent some of it from being manipulated nor accessed by other classes. We did Singleton because we want to control the instantiation of this Player class so we only have one each game.

![Singleton](/Deliverables/Singleton.png)

2. **Composite**: *Structural* - Due to the structural hierarchy of what characters have, it is convenient to use Composite to build a structural tree to represent the hierarchy. Composite classes such as NPC and Player sharing and implementing each individual method's CharacterStats has and manipulating them as needed.

![Composite](/Deliverables/Composite.png)

3. **Strategy**: *Behavioral* - There are different item types in the game, and in order for the player to use them, there are different methods for each individual item type that is implemented through an interface called UseItemMethod. Instead of a traditional brute-force method with ifs or even switches, it might be more readable for others to use this kind of approach.

![Strategy](/Deliverables/Strategy.png)

### Design Principles
  <br/>**Single Responsibility Principle:**
  <br/>Our Location class contains its name and description with its sole function being the ability to share this information.

  <br/>**Open/Closed Principle:**
  <br/>Our PlayerStats class follows the Open/Closed principle because we can create new instances of players with the same starting stats to play through the game but it is closed as these starting values will not ever be changed or modified.

  <br/>**Liskov Substitution Principle:**
  <br/> The event class follows this principle as different events will be triggered along with different parts of the story and allow substitution into the story without the entire story being rewritten.

  <br/>**Interface Segregation Principle:**
  <br/>We used the Interface segregation with our player and NPC interfaces to avoid using one big interface. Players and NPCs have slightly different fields and methods so we gave each class a separate interface to follow this principle.

  <br/>**Dependency Inversion Principle:**
  <br/>We use this principle in our UpdateGame class when handling rewriting the story and user options to the screen. This allows the user to continue playing seamlessly after making a choice and does not require them to do anything other than play the game.

---
