# D.4 Implementation: Part 1
---

## Introduction

TextAdventureGame is a text adventure game that allows gamers to pass time and reduce boredom. The game encourages creativity and personal choice to determine the path the story leads. Players will have the opportunity to play something more open-ended and thought provoking than most mainstream games currently available. 
The game also includes numerous features such as:

- Customizable Character
- Minigames
- Infrastructure of several story choices
- Immersive gameplay
- New Game Plus
- And many more!

[Github Link](https://github.com/GageGabaldon/CS386-Team-Project)

[Trello Link](https://trello.com/b/2S8T1pBG/cs-386-project-main)

## Implemented Requirements

**MVP**: Our MVP includes the implementation of a clean and smooth user interface which was implemented for our current version, but we did not accomplish the implementation of an immersive story yet.

**User Stories**: The listed user stories have been implemented for the current version: 

- As a developer, I want constructive feedback about the story of the game so that I can create an immersive experience for users. 
- As a developer, I want feedback from other developers about my coding and vice versa so that we can improve our game as a team.
- As a tester, I want to communicate with the developers with the bugs I found and carefully describe them so that they can work on it without any confusion whatsoever
- As a tester, I want to be able to provide feedback and suggest ideas for the game so that I can help create a better, more immersive game.

**Workload**:

- Gage worked on the constructive feedback feature and implemented the feedback section of the app.  Along with working on the app design. 
- Tommy worked on the UI and design of the app. 
- Vidal worked on the Implementation of Requirements, Adopted Technologies, Learning/Training, and the story design for the application.
- Elijah worked on the Licensing, Introduction, and Readme and other markdown files.


## Adopted Technologies

**Android Studio**

Android studio is an integrated development environment created by Google and built from the JetBrains IntelliJ IDE. Specifically designed for Android development, it supports use of languages like Java. Our team is using Android Studio because our project will support Android devices. The software will be developed in Java, a supported language of the IDE, because the team is familiar with it and it is an object-oriented language that will be suitable for application development.

**SQLite**

SQLite, is a database engine that implements speed and reliability without needing configuration to use. It is widely used and built in with Android Studio. For the reason of its easy implementation with Android Studio, we have chosen to use this database for storage and access of data in our project.

**Room**

Room is a tool used with the SQLite database in Android Studio. It is a persistence library meant to help simplify the creation of data, its storage, and access. Our team plans to use Room to assist in our use of our database and increase efficiency in the development of our project.

**Gradle**

Gradle is a tool designed to automate the building of source files for programs through the use of scripts. We will implement Gradle with Android Studio for building our source files for our application to automate their construction.

**Docker**

Docker is a tool used to create packages of software held in virtual environments allowing for isolated running and testing of applications. By using a container to run our application, we can safely test our project as we develop it in a controlled environment.

**Amazon Web Services (AWS)**

Amazon Web Services is a cloud computing service allowing for cloud storage of data and the ability to emulate computers virtually. Amazon Web Services will allow for our project to have a running instance of our applications database stored remotely for use in the running of our game on mobile devices.

## Learning/training

Our team has utilized online resources to learn how to use our adopted technologies and develop our project. Android Studio provides many useful guides and documentation for learning how to use the IDE as well as the built-in features for SQLite. Material found to be useful is shared amongst the team through Slack for all to utilize.

## Deployment

For the deployment step the team deployed a docker image into our amazon ec2 server in order to run builds, tests and other miscellaneous tasks and running the app. In the docker image it has gradle installed in order to run a build and compile everytime we want to in order to see if it passes or fails. This docker image is being held on docker hub and everytime a push request happens on github docker hub will make a new build of the project. The server is also being used to host a simple website and will be the main way of getting our app out there. 

Website/server address:
http://textadventuregame.tk/
54.157.198.84
Docker image: https://hub.docker.com/repository/docker/gagegabaldon/packsdkandroiddocker.image

## Licensing

Our team picked MIT Licensing because we know for a fact that this project is a rather small one and is worked on by a small group of people; moreso by busy college students. We are realistically looking at things if we unfortunately are unable to complete the game to fruition, we’re hoping that other people might be able to continue working on it.
We also picked this specific Licensing practice because being open-source, we are able to share what we might have learned during the process of making the game. For example, implementing a database to use for mobile applications. This way, other people can also learn from our project or source code

## Readme File

- Readme.md - https://github.com/GageGabaldon/CS386-Team-Project/blob/master/README.md
- Contributing.md - https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CONTRIBUTING.md
- Code_of_conduct.md - https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CODE_OF_CONDUCT.md
- License.md - https://github.com/GageGabaldon/CS386-Team-Project/blob/master/LICENSE.md

## Look and Feel

When designing the user interface we wanted something that would look clean and minimalistic with little clutter but would still have all needed functionality. We based our design heavily on the Android material design following the guidelines and rules that come along with that. There are only a few colors but this allows a uniform theme throughout the entire app. The colors are bright and contrast well which makes them pleasant to look at. The font was another thing we had to think about. We chose a default android font roboto as it followed our goals of minimalism and has a clean appearance.

Screenshot 1 shows the main page and color theme of the app:

![Screenshot1](/Deliverables/D4P1Screenshot1.png)

Screenshot 2 shows the main game screen where the user will select their choices: 

![Screenshot2](/Deliverables/D4P1Screenshot2.png)

## Lessons Learned

We have learned that with a lot of stuff on this as well as previous deliverables that it is key to start early. A lot of the tools we are using have some sort of learning curve and tackling that early is the first step to having what we need done on time.
Android studio has been the steepest learning curve for us all but we are working through it. Learning about styling techniques and implementing what we want the app to do with java code is something that is getting easier but still requires time.

## Demo
Demo is listed here: https://youtu.be/nS6br85BTTM
