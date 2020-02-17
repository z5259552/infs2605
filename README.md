# INFS2605 FX Starter Kit

## What is this?
This is a starter kit for INFS2605 students. It will set you up to develop JavaFX applications on the Java 11 platform using NetBeans 11, OpenJDK 11 and OpenJFX 11.

## System requirements
For macOS:
- macOS **10.14 Mojave** (if you need to maintain backwards compatibility with other 32-bit software that you need installed on your computer) or **macOS 10.15 Catalina**.
- Older versions of macOS may not work properly. If your computer does not support at least macOS 10.14 Mojave, it may be too old to run the required sofware anyway.
- It is always best practice to keep your computer updated with the latest updates from Apple. This is important not only for compatibility with new software, but also to receive security patches.

For Windows:
- Windows 10, **build 1903 (May 2019 update)** or newer.
- All Windows 10 computers can update to the latest build using the **Windows 10 Update Assistant**: https://support.microsoft.com/en-au/help/3159635/windows-10-update-assistant
- Windows 8/8.1 will probably work, but we cannot assist with your setup unless you are running Windows 10.
- Windows 7 is not officially supported but it seems that everything works fine if you just install PowerShell 3: https://www.microsoft.com/en-au/download/details.aspx?id=34595
- It is always best practice to keep your computer updated with the latest updates from Microsoft. This is important not only for compatibility with new software, but also to receive security patches.

## Setup instructions for macOS
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

7. Go to https://gluonhq.com/products/scene-builder/ - download and install **Scene Builder for Java 11**.

8. Clone this repository (either using a Git client, or using the **Clown or download** button in the top right-corner of this page and then clicking **Download ZIP**. Open this repository in NetBeans 11. You will see that it compiles to a working JavaFX app.


## Setup instructions for Windows
1. Install Chocolatey: https://chocolatey.org/
2. Open the Windows Start Menu and type `cmd`. Right click the **Command Prompt** menu item and select **Run as administrator**.
3. Copy and paste this into Command Prompt and hit the `ENTER` key on your keyboard to execute the command:
    ```
    cinst -y adoptopenjdk11 apache-netbeans.portable github-desktop
    ```
    - While the command is executing, you will see lines of information appear on the Command Prompt. This is diagnostic information, it is not problematic.
    - The command has finished executing once no more lines of information continue to appear in the Command Prompt and you just have the same prompt you had when you first opened the Command Prompt: `C:\Windows\system32>`.
    - If the command seems to be stuck, try hitting the `ENTER` key a few times to push it along... :)

4. Go to `C:\Program Files\AdoptOpenJDK\` in Windows Explorer and open the folder inside it that is named along the lines of `jdk-11.0.6.10-hotspot` (your version number might be higher, this is OK).

5. Now you are in a folder with items `bin`, `bundle`, `conf`, ... `man`, `release`. Open the folder called `jmods`. You will now see that it contains a lot of files that all end with the file extension `.jmod`.

6. Go to https://gluonhq.com/products/javafx/ and download the "Product" called **JavaFX Windows jmods**. You will get a ZIP file - extract it. You can see it contains 7 files that end with the file extension `.jmod`. Copy this into the folder from step 5.

7. Go to https://gluonhq.com/products/scene-builder/ - download and install **Scene Builder for Java 11**.

8. Clone this repository using **GitHub Desktop** (you installed this in step 3). Then open this repository in **Apache NetBeans 11**. You will see that it compiles to a working JavaFX app.
