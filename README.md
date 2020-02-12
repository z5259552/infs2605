# INFS2605 FX Starter Kit

## What is this?
This is a starter kit for INFS2605 students. It will set you up to develop JavaFX applications on the Java 11 platform using OpenJDK and OpenJFX.

## How do I get this working on macOS?
1. Install Homebrew: https://brew.sh/
2. Copy and paste this into Terminal and hit the `ENTER` key on your keyboard to execute the command:
    ```
    brew cask install adoptopenjdk11 netbeans
    ```
    - While the command is executing, you will see lines of information appear on the Terminal. This is diagnostic information, it is not problematic.
    - You may be required to enter your administrator password. If prompted to do so, enter it. You will not see any dots appear to represent the hidden characters of your password, only the blinking terminal cursor staying at the same spot on the screen, but fear not - your password is being entered!
    - The command has finished executing once no more lines of information continue to appear in the Terminal and you just have the same prompt you had when you first opened the Terminal.
    
    
3. Now execute this command:
    ```
    /usr/libexec/java_home | tr -d '\n' | pbcopy
    ```
    - The first part, `/usr/libexec/java_home`, identifies the location of the JDK we installed in step 2.
    - The pipe symbol, `|`, sends information from the first part to the second part.
    - `tr -d '\n'` strips away the "new line" ("enter") symbol.
    - `pbcopy` copies data to the clipboard.

4. Go to Finder, and use the keyboard shortcut Command + SHIFT + G to open the "Go to Folder" pop-up. Now use Command + V to paste the data we acquired in step 3.

5. Now you are in a folder with items `bin`, `bundle`, `conf`, ... `man`, `release`. Open the folder called `jmods`. You will now see that it contains a lot of files that all end with the file extension `.jmod`.

6. Go to https://gluonhq.com/products/javafx/ and download the "Product" called **JavaFX Mac OS X jmods**. You will get a ZIP file - extract it by double-clicking it. You can see it contains 7 files that end with the file extension `.jmod`. Copy this into the folder from step 5.

7. Clone this repository and open it in NetBeans 11. You will see that it compiles to a working JavaFX app.


## How do I get this working on Windows?
Coming soon!