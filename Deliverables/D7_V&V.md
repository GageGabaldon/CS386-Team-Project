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

##### 2.2.1

##### 2.2.2

##### 2.2.3

##### 2.2.4

#### 2.3 Acceptance Tests

##### 2.3.1

We used Espresso for our acceptance tests as it is already integrated in Android Studio and allowed us to easily test our UI.

##### 2.3.2

Acceptance Tests

https://github.com/GageGabaldon/CS386-Team-Project/tree/master/CSProject/app/src/androidTest/java/com/example/csproject

##### 2.3.3

New Game acceptance test

https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CSProject/app/src/androidTest/java/com/example/csproject/NewGameAcceptanceTest.java

This acceptance test tests that when the user starts a new game, the correct text and buttons are displayed to the correct views on the screen. This confirms that the game starts out correctly with no errors.

##### 2.3.4

Proof of accepted test:

![Screenshot1](/Deliverables/newGameTest.png)

### 3. Validation (user evaluation)
---

#### Script:
*Tasks to give:*
- Answer any questions that might pertain to the game's performance and design
- Test all event choices & check if they lead where they are supposed to go
- Check if there are any typos or grammatical errors in the events of the game
- Test if you can send any feedback to the database by pushing the "FEEDBACK: Give ideas to the creators" button
- Give any direct feedback to us developers if any (story, design, wording, etc)

*Data to be collected:*
- Answers to the questions asked about our game
- Direct feedback from the user evaluating if any
- Results from the tests we asked the user to perform

*Questions to be asked:*
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state?
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?
- Is there any thing you can see right now that we can improve on? If so, what?
- How do you feel about the interface of the game?

#### Results:

##### User 1
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state
  -*Answer*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?
  -*Answer*
- Is there any thing you can see right now that we can improve on? If so, what?
  -*Answer*
- How do you feel about the interface of the game?
  -*Answer*

##### User 2
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state
  -*Answer*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?
  -*Answer*
- Is there any thing you can see right now that we can improve on? If so, what?
  -*Answer*
- How do you feel about the interface of the game?
  -*Answer*
  
  ##### User 3
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state
  -*Answer*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?
  -*Answer*
- Is there any thing you can see right now that we can improve on? If so, what?
  -*Answer*
- How do you feel about the interface of the game?
  -*Answer*
#### Reflections:
