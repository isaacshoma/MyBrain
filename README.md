##### CMPT 385, Fall 2022, Trinity Western University
## Group 2: We Don't Byte
## Project: My Brain

Last Modified: Nov 15, 2022
Members: Dane Munday, Isaac Shoma, Okewoma Okumo, Denghao Wang


# How to Launch:
Option 1: Download
1) Download repository files with the download button directly to the left of the blue "clone" button
2) Extract files and open in android studio

Option 2: Git Clone (Git must be installed)
1) Open windows command prompt
2) Navigate to desired directory for project to be stored
3) Click blue "Clone" button on GitLab and copy the second URL (the HTTPS link)
4) Use Git Command: git clone <insert copied link to repository)
5) Open the cloned project in android studio


# Purpose:
The MyBrain android app is a media sharing app either for use by a therapist/caregiver
of a dementia patient as an aid for reminiscence therapy, or for direct use by the dementia patient.
The main user (dementia patient) is given a feed of content sent by secondary users (friends/family)
about their daily lives to improve their feeling of connection and involvement. When an image has
been selected by the primary user, a corresponding info panel will be provided including the
sender's image, name, relation to the primary user, as well as an optional personalized message.
This app was created to address the concern of an increasing sense of disconnection and loneliness
among dementia patients.

# Program flow
1)   Launch screen
2)   Login Screen 1 (register and sign-in)
3)   Login Screen 2 (select user type: provider or receiver)
4a)  Scrolling screen
4aa) Detailed Image view
4b)  Sender screen 

Login Screen 2 Details:
Upon first logging in, the user will select whether they are the primary user (patient) or a
secondary user (friend/family) this option will be stored in user preferences and will not appear
a second time. Primary users are the media receivers while secondary users provide the media for the feed.

# Classes Identified by User type:
Unique Primary User Activities: ScrollingActivity, ImageSelectActivity
Unique Secondary User Activity: EventCreatorActivity
Shared Activities: MainActivity, LoginActivity, LoginActivity2

# Java Class Header Comments:

###### MainActivity.java
/**
 * Main Activity class is a splash screen that appears before user login
 */

###### LoginActivity.java
/**
 * LoginActivity class is the primary login screen where both primary and secondary users
 * can register an account and login. After login, user is taken to login screen 2.
 *
 * Entered Info includes:
 * String username,
 * String password,
 * int/bool whether to remember login details (0 or 1),
 */

###### LoginActivity2.java
/**
 * LoginActivity2 class is the secondary login screen where a user selects whether they are a
 * primary (media receiver) or secondary user (media provider). 2 buttons are provided to make
 * the selection. After selecting an option, the choice is stored in user preferences and this
 * activity will not be shown again.
 */

###### ScrollingActivity.java
/**
 * ScrollingActivity class is the primary user's activity where they will spend the majority of
 * their time. A feed of sent events will appear on the primary user's scrolling screen that,
 * when clicked on, will take user to ImageSelect Activity (details on image contents and the sender).
 * A "getID" button is located in the top left of the screen that provides the user with their userID/username
 * in the case a friend or family member needs their ID to send them an event. UserID is provided via an
 * Android Toast notification.
 */

###### ImageSelectActivity.java
/**
 * ImageSelectActivity class is the screen that appears after the primary user has clicked on an event
 * from the ScrollingActivity. The contents of the imageSelectActivity is pulled from the database
 * upon starting. No info is entered on this page. It is just for viewing.
 * A "return" button is provided at the bottom to take the primary user back to the main ScrollingActivity.
 */

###### EventCreatorActivity.java
/**
 * EventCreatorActivity class is a class for primary users to create an "event" that can be
 * sent to a specified secondary user. User is specified through userID/username.
 * Events consist of secondary user's: name, relation to the primary user, profile picture,
 * attached image to be sent, a personalized message, and the userID/username of the primary user.
 *
 * Entered Info includes:
 * String yourName,
 * String relation,
 * Image profilePic,
 * Image imageToSend,
 * String userID/username
 */

###### Multithreading.java
/**
 * The Multithreading class is an extension of the thread class with an overriden run() function.
 * It allows a socket connection with the database server to be established via multithreading so
 * that the user's experience is not frozen when waiting for a connection to be established and data
 * transferred.
 */


## CMPT 385 Group 2 Project Style Guide:
    Based on https://www.cs.cornell.edu/courses/JavaAndDS/JavaStyle.html#CamelCase

General Naming uses camelcase
- Includes: classes, fields, methods, and variable names
    thisIsAnExample

Constants are all capitalized with underscores instead of spaces
    MY_EXAMPLE_CONSTANT

Classes begin capitalized
    MyExampleClass

Methods start with a lowercase letter
    public void myExampleMethod()

Variable names start with a lowercase letter
    SomeType myExampleVar;


Indentation:
    substatements of a statment are idnented for visibility

Comments:
    All methods have a comment describing what the function does

    All classes have a multi-line comment describing the overall purpose of the class.