# D7 - Verification and Validation

### 1. Description
---
  Our system consists primarily of three parts, a user interface, a story composed of directories and files, and a tracked world state. The user interface is integral to our system, because it is the intermediary between the other components of our system and the player. The story module in our system will contain all events as files stored in their relevant story segments represented as directories. All story segments will be located in an assets directory considered as our story module. The world state contains player information such as the players health, inventory, available choices, current made choices, and the current stories the player is or has participated in. It will not only contain the players data, but the world's data as well. That will include the current location of the player, all locations that exist, and all items in each location.

  This is how the three major parts interact with each other: as the story information is updated in the world, relevant information will be displayed to the player using the user interface. A description for the current story event will be displayed on the player's phone with a selection of available choices for the current event. The player will select a choice which then is processed by our world to determine what can happen next in the story. The decided choice is stored, the completed event is stored, and if the location is changed or the story is finished, then the former or latter is updated. A completion of a story will store the story with a record of all decided choices. This will repeat as a cycle of beginning a story, being given a description of the event, making a decision, progressing to a new event guided by the players previous decisions, and finally, once reaching a final event, completing the story. As this cycle repeats, the players stats will update as well as items being obtained and used.

### 2. Verification (tests)
---

#### 2.1 Unit Tests

##### 2.1.1 

##### 2.1.2

##### 2.1.3

##### 2.1.4

#### 2.2 Integration Tests

##### 2.1.1

##### 2.1.2

##### 2.1.3

##### 2.1.4

#### 2.3 Acceptance Tests

##### 2.1.1

##### 2.1.2

##### 2.1.3

##### 2.1.4

### 3. Validation (user evaluation)
---

#### Script:

#### Results:

#### Reflections: