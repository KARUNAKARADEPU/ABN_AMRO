# Test assignment

Please note i have added a minimal functionality to the app hence it will shows few menuitems and a button, then on clicking the button shows the balance. balance is a random value between 1000-10000 with prefixed EUR symbol. and used Android studio and Kotlin for doing so.

i could add few Android instrumentation tests such as pressing the button and checking the value which displays on the results view of the screen. changed the snackbar text and added a test to click on the mail icon, and verifying the message using Kotlin and Espresso framework.

once you dowload the project onto your machine, open it as a gradle project in Android studio and install necessary Android SDK platform/SDK tools (i used API level 28 and Android Pie as i have used a real device and emulator with same API levels).
create an emulator with API level28 and android version 9 and first build the app by adding the configuration, then run the instrumentation test MainActivityTest

or if you want to run from terminal, use 'gradle connectedCheck' command.
