# D&D Dice Roller

A simple Java console application for rolling common Dungeons & Dragons dice.

## About This Project

This is an older Java project I created as part of my programming journey. I've preserved the original source code in the `original` folder and included a cleaned, working version in `src`.

This repository serves as an archive of my original work and something I can continue improving as I develop my programming skills.

## Features

- Supports common D&D dice:
  - d4
  - d6
  - d8
  - d10
  - d12
  - d20
  - d100
- Roll multiple dice at once
- Add positive or negative modifiers to a roll
- Calculates the total of all rolls plus the modifier
- Detects natural 20s as critical successes
- Detects natural 1s as critical failures

## Project Structure

```text
dnd-dice-roller/
├── original/
│   ├── dice-roller-original.txt
│   └── multifaced-die-original.txt
├── src/
│   ├── DnDDiceRoller.java
│   └── MultifacedDie.java
├── .gitignore
└── README.md
```

### `original`

Contains the original source code from the project. These files have been preserved so the original version of the program remains available.

### `src`

Contains the cleaned and updated Java source code.

## How It Works

The program asks the user which type of die they want to roll, how many dice they want to roll, and what modifier should be applied.

For example:

```text
What die do you need? (d4, d6, d8, d10, d12, d20, d100)
d20

What are your modifiers?
5

How many dice do you want to roll?
2
```

The program rolls the requested dice, displays the individual results, and calculates the final total with the modifier applied.

## Running the Program

Make sure Java is installed on your computer.

Compile the source files:

```bash
javac src/DnDDiceRoller.java src/MultifacedDie.java
```

Run the program:

```bash
java -cp src DnDDiceRoller
```

## Future Improvements

This is a project I can continue expanding as I learn more. Possible improvements include:

- Better input validation
- Advantage and disadvantage rolls
- Custom dice expressions such as `2d6+4`
- A graphical user interface
- Roll history
- Additional D&D-specific rolling options

## Why Preserve the Original Code?

I wanted to keep the original version rather than simply replace it. The `original` folder provides a snapshot of the project as I originally wrote it, while the `src` folder gives me a place to improve and expand the program over time.
