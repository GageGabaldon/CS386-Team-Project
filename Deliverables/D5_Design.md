# D5 Design
---

### Description
  Our system consists primarily of three parts, a user interface, a story composed of directories and files, and a tracked world state. The user interface is integral to our system, because it is the intermediary between the other components of our system and the player. The story module in our system will contain all events as files stored in their relevant story segments represented as directories. All story segments will be located in a master directory considedered as our story module. The world state contains player information such as the players health, inventory, available choices, current made choices, and the current stories the player is or has participated in. It will not only contain the players data, but the worlds data as well. That will include the current location of the player, all locations that exist, and all items in each location.

  This is how the three major parts interact with each other: as the story information is updated in the world, relevant information will be displayed to the player using the user interface. A description for the current story event will be displayed on the players phone with a selection of available choices for the current event. The player will select a choice which then is processed by our world to determine what can happen next in the story. The decided choice is stored, the completed event is stored, and if the location is changed or the story is finished, then the former or latter is updated. A completion of a story will store the story with record of all decided choices. This will repeat as a cycle of beginning a story, being given a description of the event, making a decision, progressing to a new event guided by the players previous decisions, and finally, once reaching a final event, completing the story. As this cycle repeats, the players stats will update as well as items being obtained and used.

### Architecture

![Architecture](/Deliverables/Architecture.png)

### Class Diagram

### Sequence Diagram

### Design Patterns

1. **Singleton**: *Creational* - One and only one instance of the Player class should exist. It is static and private to prevent some of the attributes from being manipulated nor accessed by other classes. We did Singleton because we want to control the instantiation of this Player class so we only have one each game.

![Singleton](/Deliverables/Singleton.png)

2. **Composite**: *Structural* - Due to the structural hierarchy of what characters have, it is convenient to use Composite to build a structural tree to represent the hierarchy. Composite classes such as NPC and Player sharing and implementing each individual methods CharacterStats has and manipulatin them as needed. 

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
