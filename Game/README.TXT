------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Frog Game
PURPOSE OF PROJECT: To sythesize multiple concepts to create a frog game as a capstone project.
VERSION or DATE: 4/24/15
DEPENDENCIES:
HOW TO START THIS PROJECT: Run the main method in the GameViewer class
AUTHORS: Kevin Maxson
USER INSTRUCTIONS: Use the arrow keys to maneuver the frog around the window. Avoid the cars and last
as long as possible to get a high score. The speed may start slow, but over time the speed and difficult increases
drastically.

Notes to Mr. Schmidt:
This capstone uses GUI, loops, class composition, and media composition, and arrays to create the game.
I had the most difficulty moving the frog by using the arrow keys. I initially used
the GameComponent to move the frog but realized that the GameViewer class would be better if I used
a KeyListener. I also needed to learn how to do collision detection. I created rectangle objects that were
below the obstacles and the frog and moved with them. I then used the intersects method to check to see if
there were any collisions. I also learned how to use timers to move the obstacles at a constant rate throughout
the game by using the action listener. The most revision I made was to consolidate the program. I started by hard
coding in all of the starting locations, speed, and size of each rectangle and obstacle. This meant that I had 48
lines of code to create the obstacles and rectangles and 48 lines of code to draw them and 96 lines of code to change
the x variables. I ended up using multiple for loops to write this code much more efficiently. At the end, I added
the levels and score to make the game look better and pose a challenge to the player. If I had more time, I
would make the program more efficient by not creating new rectangles and obstacles each frame and instead
just move them. After running the game 8 or 10 times it does begin to lag. I hope you like this program.
