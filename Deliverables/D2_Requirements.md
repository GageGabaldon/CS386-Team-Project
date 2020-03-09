#D.2 - Requirements
____________________________________

###1. Positioning
#####a. Problem Statement:
The problem of being bored and looking for an immersive gaming experience affects gamers; the impact of which is being unable to find a game or experience that helps pass time.

#####b. Product Position Statement:
For gamers who are looking for ways to alleviate boredom and pass time, TextAdventureGame is a text adventure game that immerses the user in a story in which they choose their own path unlike other text adventure games, our product keeps the user engaged by providing multiple choices that lead to multiple paths of gameplay.

#####c. Value Proposition
I. *Value Proposition*: TextAdventureGame is a text adventure game that allows gamers to pass time and reduce boredom. The game encourages creativity and personal choice to determine the path the story leads. Players will have the opportunity to play something more open-ended and thought provoking than most mainstream games currently available.

II. *Consumer Segment*: Gamers who are looking for an immersive text adventure.


###2. Stakeholders
#####a. Developers:
Create the idea behind and implement a text adventure game playable on android. Responsibilities include learning the necessary tools (Android studio, some sort of database - probably SQL), outlining the story for the game by creating paths and and story lines that work together.

#####b. Gamers
people who will play the game and provide feedback regarding game play mechanics and user interaction for the developers. Responsibilities include playing through the game and following the storyline.

#####c. Readers
people who will play the game and provide feedback regarding aspects of the storyline, storytelling ability, and user interaction for the developers. Responsibilities include playing through the game and following the storyline, just like the gamers.

#####d. Testers
People who will also play the game and search thoroughly for bugs and discontinuity. Responsibilities include exhausting options in the game and finding bugs/issues to report to the developers. Provide assistance for creating a seamless user experience.


###3. Functional Requirements
1. Clean, Elegant User Interface

2. Organized Infrastructure of story choices

3. Maintain User Information throughout Session ( Health Points, Inventory, Location, Made Choices, Relationships )

4. Customizable Character

5. Minigames

6. New Game Plus


###4. Non-Functional Requirements
1. Must look appealing, immersive, and sellable to our audience

2. Must work on Android OS and Apple IOS

3. Bug Management

4. Updates based on user feedback

5. Smooth and Intuitive GUI

###5. MVP
For creating our MVP our main strategy will be to reference our interviews and observe overlapping opinions for deciding what to implement. Frequent specifications about important aspects in the game will be key to our MVP. Things such as smooth and intuitive UI as well as story immersion are common themes in all of our interviews thus far and are considered important to our MVP.
More interviews may be necessary to get a larger amount of opinions regarding features. With the current focus being on the user interface and the story, we will plan to develop the UI first for demoing and testing.


###6. Use Cases
#####a. Use Case Diagram

![Use Case Diagram](/Deliverables/386usediagramSS1.png)

#####b. Use Case Description
*Elijah's Use Case*

######**Use Case: Test Game**

I. Brief Description: The use case demonstrates how the testers find bugs in the game & how the developers deal with said bugs

II. Actors: Testers & Developers

III. Preconditions: Game is still in development stage but is testable by testers

IV. Basic Flow of Events:

1. The use case begins when the game is being tested by the tester
2. Use Case: Play Game is performed by the tester
3. The tester performs every single action possible in a certain sequence in the game
4. If a bug is found, the tester then contacts the developers
5. Developers receives message about the bug
6. Developers communicates with the tester about the found bug
7. Developers talk within each other to debug it
8. Bug Fixed
9. Go to next sequence of action
10. Repeat step 3 ~ 9
11. Game tested successfully w/o bugs

V. Alternative Flows

1. No bug is found - in step #3, if no bug was found, skip to step 11
2. Cannot fix bug - in step #7, if the bug is not fixable, perform use case: Recode Game
3. Developers didn't receive message - in step #5, if testers somehow was not able to relay the message about the bug, go meet them physically

VI. Key Scenarios

1. Game tested successfully w/o bugs
2. Game has game-breaking bug(s)

VII. Post-conditions
Game tested successfully w/o bugs

*Vidal's Use Case*
######**Use Case: Interaction in Menu**
I. Brief Description: This use case demonstrates how maneuvering through the menu will get you into the beginning of the game.

II. Actors: Player

III. Preconditions: The player has opened the app

IV. Basic Flow of Events:
1. Game prompts user with option to play or quit game
2. Player will select play
3. The game will begin

V. Alternative Flows:
1. Little can happen from the players ability aside from not selecting an option. If they do not select an option, they will sit in the menu
2. Player selects Exit and game is exited

VI. Key Scenarios:
1. Player selects play to start the game
2. Player selects exit to exit the game

IIV. Post-Conditions: Player is in a session of the game

######**Use Case: Valid input**
I. Brief Description: This use case demonstrates how valid inputs from the user progress the story and are to be handled

II. Actors: Player

III. Preconditions: The player has opened the app and started a session
IV. Basic Flow of Events:
1. Game begins with displaying storyline event and prompts player for input
2. Player will input text to the game using implemented UI
3. The Player inputs text that is acceptable by the system
4. The Game will display another event to proceed the storyline to the player
5. Player inputs text to repeat back to step 2

V. Alternative Flows:
1. Player gives invalid text as input in step 2. and is returned to step 1. to have the event displayed again

VI. Key Scenarios:
1. Player gives valid input and progresses through games storyline
2. Player gives invalid input and is held in current event until valid input given

VII. Post-Conditions: Player reaches end of game

*Tommy's Use Case*

######**Use case: Wrong input**
I. Brief Description: This use case demonstrates how wrong inputs from the user will be handled.

II. Actors: Testers, Developers

III. Preconditions: Game is in development and misinputs/bugs are being smoothed out

IV. Basic Flow of Events:

1. Begin with game prompting for user input
2. User will input something to the game using implemented UI
3. The user inputs something that is invalid/doesn't make sense
4. Prompt is displayed notifying user of invalid input and must retry
5. User is brought back to previous screen where input is required again
6. User inputs valid option
7. Game continues as normal with users valid input

V. Alternative Flows:

1. User correctly inputs from step #3, skip to step #6
2. User inputs incorrectly multiple times, repeat steps #2 ~ #5

VI. Key Scenarios:

1. User's wrong input is handled by simply prompting again for correct input
2. User inputs legal input from beginning

VII. Post-Conditions: User continues on through the game sequence

*Gage's Use Case*

I. Brief Description: Demonstrates how new features get implemented

II. Actors: Client, Testers, Developers

III. Preconditions: A client or tester has opened the app and has an idea to propose.

IV. Basic Flow of Events:

1. User presses the suggest feature button
2. User types in what kind of feature it is in the top box
3. User types in their feature into the box
4. User then sends information to the developer
5. Developer then decides to add feature
6. Developer then works on feature
7. Contact User if feature is implemented
8. Request is resolved

V. Alternative Flows:

5a. Developer does not add feature
		1. User is not contacted and feature is not added to app.
		2. Skip to 8.

VI. Key Scenarios:

1. Idea is worthwhile and is added to app
2. Idea is too hard or not a developer focus and is not added to app

VII. Post-Conditions:

1. New Feature is added to App
2. User contacted and thanks given

###7. User Stories

1. As a user, I want wrong inputs to be handled effeciently so that misclicks and typos will not drag on and be consequential to the story of the game.

Priority: Medium

Time Estimate: We estimate this will take around 2 hours to fully implement

2. As a user, I want a game that can be different each time I play it so that I can enjoy the game after I finish it the first time.


3. As a developer, I want constructive feedback about the story of the game so that I can create an immersive experience for users.
	a) We estimate this will be an ongoing piece of our game but may take ~20 hours or so

4. As a tester, I want to be able to catch issues and bugs with the game so that the game can be improved for players.
	a) We estimate this will be developing as the game is developed and may take up to 15 hours.

Priority: High

Time Estimate: Will take anywhere between 20 - 30 hours to implement.

3. As a developer, I want constructive feedback about the story of the game so that I can create an immersive experience for users.

Priority: Low

Time Estimate: We estimate this will be an ongoing piece of our game but may take ~20 hours or so

4. As a tester, I want to be able to catch issues and bugs with the game so that the game can be improved for players.

Priority: Medium

Time Estimate: We estimate this will be developing as the game is developed and may take up to 15 hours.

5. As a gamer, I want to build a unique character so that I can personalize my experience.

Priority Level: Medium

Time Estimate: 13hrs

6. As a developer, I want to be to create interesting gameplay choices so that I can bring an immersive and creative experience to the user.

Priority Level: High

Time Estimate: 5 -24 hours

7. As a developer, I want feedback from other developers about my coding and vice versa so that we can improve our game as a team.

Priority Level: High
Time Estimate: 20 - 30 hours

8. As a tester, I want to communicate with the developers with the bugs I found and carefully describe them so that they can work on it without any confusion whatsoever.

Priority Level: Medium
Time Estimate: 1 - 2 hours

###8. Trello
https://trello.com/b/2S8T1pBG/cs-386-project-main

![TrelloScreenShot](/Deliverables/386trelloSS.png)
