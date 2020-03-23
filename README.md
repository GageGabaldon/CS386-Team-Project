# CS386-Team-Project: **TextAdventureGame**

Our team is developing a text adventure game playable through an Android mobile platform. In our program, a player will be able to progress through a storyline leaving their own impact in an immersive world that allows the player to solve problems in creative and entertaining ways. We hope to give the player a chance to be able to focus on just the game and the story at hand. It will resolve boredom and offer an escape from reality.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

To test or develop your own build of the project, download the CSProject folder through our Github by any means. Then, open the folder through Android Studio under File and select the folder. 

Refer to Installing on the process to get Android Studio 

See deployment for notes on how to deploy the project on a live system


### Prerequisites

The following programs and softwares are needed to develop the project:

- Android Studio-IDE for developing mobile Applications
- Docker-Platform to service products that uses OS-level virtualization through containers
- Room-Object Relational Mapping library used to map database objects to Java's
- Gradle-open-source build automation system that supports incremental builds by intelligently determining which parts of the build tree are up to date.
- SQLite-Database engine that implements speed and reliability without needing configuration to use
- Amazon Web Services-cloud computing service allowing for cloud storage of data and the ability to emulate computers virtually

### Installing

To get a development environment ready, follow these steps:

1. Install Android Studio
2. Install Docker
3. Install SQLite
4. Install Gradle
5. Apply for a server at AWS
6. Through Android Studio, after opening the project implement the following dependencies to the app's build.gradle file to implement Room
```
dependencies {
  def room_version = "2.2.5"

  implementation "androidx.room:room-runtime:$room_version"
  annotationProcessor "androidx.room:room-compiler:$room_version" // For Kotlin use kapt instead of annotationProcessor

  // optional - Kotlin Extensions and Coroutines support for Room
  implementation "androidx.room:room-ktx:$room_version"

  // optional - RxJava support for Room
  implementation "androidx.room:room-rxjava2:$room_version"

  // optional - Guava support for Room, including Optional and ListenableFuture
  implementation "androidx.room:room-guava:$room_version"

  // Test helpers
  testImplementation "androidx.room:room-testing:$room_version"
}

```

At the end try getting a few datas out of the database to test the database itself and AWS functionality 

## Running the tests

Once the database is implemented, make sure to test it so that it can pull in and out items from it

## Deployment

1. Connect phone via usb
2. Through Android Studio, click on run to compile the run Android Studio
3. Android Studio will automatically upload the apk to your phone and run it there

## Contributing

Please read [CONTRIBUTING.md](https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CONTRIBUTING.md) for details about the process for submitting pull requests to us.

Please also read [CODE_OF_CONDUCT.md](https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CODE_OF_CONDUCT.md) for more details about our code of conduct.

Our team uses [SemVer](http://semver.org/) for versioning.

## Authors

- [Gage Gabaldon](https://github.com/GageGabaldon)
- [Vidal Martinez](https://github.com/vidalrmartinez)
- [Thomas Whitney](https://github.com/ymmot7)
- [Elijah Macaranas](https://github.com/elij48)

Contact Informations under [CONTRIBUTING.md](https://github.com/GageGabaldon/CS386-Team-Project/blob/master/CONTRIBUTING.md)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/GageGabaldon/CS386-Team-Project/blob/master/LICENSE.md) file for details
