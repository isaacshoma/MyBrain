##### CMPT 385, Fall 2022, Trinity Western University
## Group 2: We Don't Byte
## Project: My Brain

Last Modified: Nov 15, 2022
Members: Dane Munday, Isaac Shoma, Okewoma Okumo, Denghao Wang


# How to Launch:
Option 1: Download
1) Download repository files with the download button irectly to the left of the blue "clone" button
2) Extract files and open in android studio

Option 2: Git Clone (Git must be installed)
1) Open windows command prompt
2) Navigate to desired directory for project to be stored
3) Click blue "Clone" button on GitLab and copy the second URL(the HTTPS link)
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