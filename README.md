# Creator
RPG Character Creation
Class Creator:

Represents the character creator.
Generates a role-playing game character with a given name and random stats.
Attributes:

name: Stores the character's name.
role: Stores the character's role (Warrior, Wizard, Potato).
health, strength, magic: Store the character's stats.
Constructor Creator(String name):

Initializes the character's name and generates a random role and random stats.
Adjusts stats based on the role.
generateRandomRole() Method:

Randomly selects a role for the character from "Warrior", "Wizard", or "Potato".
generateRandomStat() Method:

Generates a random stat between 2 and 12 (inclusive).
toString() Method:

Overrides the toString() method to provide a custom string representation of the character.
Formats the character's information in the desired output format.
main Method:

Validates the command-line arguments and usage.
Creates a Creator instance with the provided character name.
Displays the generated character's information using the toString() method.
Usage:

Compile the program using javac Creator.java.
Run the program with a character name as an argument, e.g., java Creator Veera.
The program generates a character with random stats and a random role (Warrior, Wizard, or Potato) and displays the desired output.