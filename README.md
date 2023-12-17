# Title: Bullet Journal Program

Info about your project goes here

Name of team members: Rishika Kundu, Savannah Haugen, Linh Dang

Project description: 

a. This is a journal program that helps you track your mood, hours of sleep, water intake, and tasks.

b. Technical guide: 
    i. Java 17 installed for Kilt-Graphics library. The java.util and java.awt are also needed. 
    ii. The source code consists of 4 widgets, which are all implementation of the BulletJournalWidget interface. The main class is BulletJournalProgram, which has all 4 widgets.
    To run the program, run the main bullet journal program class which contains the main method.

c. This program contains artwork from public sources, source codes take inspiration from homework, lab, and in-class activities with the help of COMP 127 professor and preceptors.

The program referenced the HW3 Weather Program, Emoji Vacation Lab, and the Painter Lab for refernce. 
The illustrations added to the program were soruced from:
https://www.123rf.com/photo_124746651_procrastinating-bad-habit-hand-drawn-illustration-with-cute-marshmallow-cartoon-minimalism.html
https://www.istockphoto.com/vector/cute-smiling-happy-water-glass-gm1170933225-324207607
https://www.google.com/imgres?imgurl=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20230104%2Foriginal%2Fpngtree-empty-glass-cup-png-image_8870870.png&tbnid=59e7lqSXK6jSfM&vet=12ahUKEwibz6WFnJeDAxWE78kDHRN_CBYQMygFegQIARBc..i&imgrefurl=https%3A%2F%2Fpngtree.com%2Ffreepng%2Fempty-glass-cup_8870870.html&docid=NkVAeEnhX0ZhmM&w=1200&h=1200&q=empty%20glass%20cartoon&ved=2ahUKEwibz6WFnJeDAxWE78kDHRN_CBYQMygFegQIARBc
https://www.vecteezy.com/vector-art/6795582-cute-boy-sleeping-cartoon-vector-icon-illustration-people-icon-concept-isolated-premium-vector-flat-cartoon-style

Known issues:

- The smaller widget is still running even when it's not the displayed widget. The canvas on click methods that we defined in the smaller widgets control the main program even when the smaller widget isn't called. This does not cause any issues or break our program, but is something to avoid in the future. 
- SLeep widget:
- The task widget list and position logic is not the best, newly added task doesn't appear on the top even when the old tasks are removed.
- onClick method is slow in sleep widget and task widget. We don't know if this is the Kilt-Graphic problem or problem on our side. 

Societal impact: 
- Although the main point of the program is to a helper application, it oversimplifies life, such as user only has a variety of mood to choose from. It doesn't color-blind friendly, doesn't have assistive sound for people with impaired eyesight.
- Our program can also trigger mental health issues since it may cause excessive tracking of mundane day to day activities. 
- Our program is not available on easy-access platform such as App Store or Google store. It only serves a very small, niche population who are familiar with VScode, Github platform.


