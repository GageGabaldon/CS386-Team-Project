# D7 - Verification and Validation

### 1. Description
---
  Our system consists primarily of three parts, a user interface, a story composed of directories and files, and a tracked world state. The user interface is integral to our system, because it is the intermediary between the other components of our system and the player. The story module in our system will contain all events as files stored in their relevant story segments represented as directories. All story segments will be located in an assets directory considered as our story module. The world state contains player information such as the players health, inventory, available choices, current made choices, and the current stories the player is or has participated in. It will not only contain the players data, but the world's data as well. That will include the current location of the player, all locations that exist, and all items in each location.

  This is how the three major parts interact with each other: as the story information is updated in the world, relevant information will be displayed to the player using the user interface. A description for the current story event will be displayed on the player's phone with a selection of available choices for the current event. The player will select a choice which then is processed by our world to determine what can happen next in the story. The decided choice is stored, the completed event is stored, and if the location is changed or the story is finished, then the former or latter is updated. A completion of a story will store the story with a record of all decided choices. This will repeat as a cycle of beginning a story, being given a description of the event, making a decision, progressing to a new event guided by the players previous decisions, and finally, once reaching a final event, completing the story. As this cycle repeats, the players stats will update as well as items being obtained and used.

### 2. Verification (tests)
---

#### 2.1 Unit Tests

##### 2.1.1

We used JUnit for all of our unit tests through Android Studio.

##### 2.1.2

Unit Tests

https://github.com/GageGabaldon/CS386-Team-Project/tree/master/CSProject/app/src/test/java/com/example/csproject

##### 2.1.3

##### 2.1.4

#### 2.2 Integration Tests

##### 2.2.1

We used Mockito and Junit for our integration tests.
  
##### 2.2.2

Integration Tests

https://github.com/GageGabaldon/CS386-Team-Project/tree/master/CSProject/app/src/androidTest/java/com/example/csproject

##### 2.2.3

GitHubPath: CSProject/app/src/androidTest/java/com/example/csproject/DataAccessTest.java

With this example we are testing the integration test with our file reader class. We are making sure that the files being read are what we expect based on our text files.

##### 2.2.4

![example](/Deliverables/exampleintegration.PNG)

#### 2.3 Acceptance Tests

##### 2.3.1

We used Espresso for our acceptance tests as it is already integrated in Android Studio and allowed us to easily test our UI.

##### 2.3.2

Acceptance Tests

https://github.com/GageGabaldon/CS386-Team-Project/tree/master/CSProject/app/src/androidTest/java/com/example/csproject

##### 2.3.3

New Game acceptance test

https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CSProject/app/src/androidTest/java/com/example/csproject/NewGameAcceptanceTest.java

This acceptance test tests that when the user starts a new game, the correct text and buttons are displayed to the correct views on the screen. This confirms that the game starts out correctly with no errors when run using the user interface.

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

##### User 1 - Noelia
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state

  *8. The game seemed interesting and the story intriguing. The UI was easy to use and intuitive.*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?

  *5. She said the story was creative and immersive. There was a good amount of choice that let her feel like she had control over what was going on. The story is well written.*
- Is there any thing you can see right now that we can improve on? If so, what?

  *Sometimes the wording was confusing. There were still small gramatical errors in the text that could have been fixed. Sometimes there was a lot of information at once which made remebering the finer details a little difficult.*
- How do you feel about the interface of the game?

  *The game looks and works fine, sometimes there is just a lot of information and text on the screen at once. The buttons and choices are concise and straightforward.*

##### User 2 - Anthony
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state
  
  *It was ok 4 out 10 what was alright but needs more stuff. Also would like to see more paths or some other gameplay mechanic.*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?

  *Cloud thing was ok I give it a 4. It was a lot to look through and I didnt have time to work at it.*
- Is there any thing you can see right now that we can improve on? If so, what?

  *Fix text better text and more divergent paths. Color changes based on the story plot.*
- How do you feel about the interface of the game?

  *I like it is simple. I want a little more variety in the colors though.*
  
##### User 3 - Jerid
- On a scale of 1-10 being 10 the greatest, how likely would you play our game in its current version/state
  
  *Maybe a 2 out of 10. I would not replay this as it is now, but I like the idea of it. I would be more interested in it further down the road. It has potential, but feels incomplete.*
- On a scale of 1-5 being 5 the greatest, how immersive is the story or plot of the game?

  *I will say a 2 out of 5. I don't see any good connection between all the stories, it lacks continuity, relevence, or maybe I would say it lacks some direction. Overall I found the stories to be disconnected. If the stories were to be completed and logically connected, then I would be more interested.*
- Is there any thing you can see right now that we can improve on? If so, what?

  *Some of the descriptions are too long. I think it should be broken up into segments somehow or shortened in some other way. Another note on display, you need to check for spelling and grammar errors. Other than that, I don't have any other thoughts on improvement.*
- How do you feel about the interface of the game?

  *I do like the interface overall. It is a simple interface that is easy and clear to use. I don't like orange for the color however.*
#### Reflections:

The app as a whole did turn out to work pretty well. We had an intuitive layout for choosing story options that allowed the user to easily progress through the story and updated based on the choices they made. We could change how we handle the access of individual stories to allow for easier expansion of the app but overall what we implemented worked for us. The learning curve of our system is very easy as the app is straightforward and self-explanatory. The choices are presented in an intuitive way that allows for easy user interaction.
 
The users seemed to perform tasks as expected from starting the game to choosing their character's name and progressing through the story options. Based on our user feedback the users' actions seemed to produce the results as expected. The clicking of a button option progressed the story and updated the buttons as it should. The users seemed to like how creative the story was. The writing and ease of use with choosing options was attractive to users looking for an immersive story. Our value proposition seems to be accomplished. We offer a story that adapts to user choice and immerses them into an interactive story. 
