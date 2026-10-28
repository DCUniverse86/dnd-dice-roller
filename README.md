# D&D Dice Roller

A small Java console application I originally wrote to roll common dice used in Dungeons & Dragons.

The program supports:

- d4
- d6
- d8
- d10
- d12
- d20
- d100
- Multiple dice rolls
- Positive or negative modifiers
- Critical success and critical failure messages for natural 20s and natural 1s

## About this repository

This is an older project that I revisited for GitHub. The `original` folder contains the original source files as I wrote them, while `src` contains a cleaned-up version that keeps the same basic behavior while fixing issues that prevented the original from running reliably.

## Running the program

From the repository folder, compile the Java files:

```bash
javac -d out src/MultifacedDie.java src/DnDDiceRoller.java
```

Then run:

```bash
java -cp out DnDDiceRoller
```

## Example

```text
What die do you need? (d4, d6, d8, d10, d12, d20, d100)
d20
What are your modifiers?
5
How many dice do you want to roll?
2
```

The application rolls the requested dice, displays each result, and prints the total after applying the modifier.

## Project history

This repository intentionally keeps copies of the original code so the project's earlier implementation is preserved alongside the revised version.
