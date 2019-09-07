# Assignment 2: Get Classy
<!-- 🚀🚀🚀🚀 Scroll down for the assignment instructions 🚀🚀🚀🚀 -->

## Assignment Self Assessment:
#### Reflection
[//]: <> (share your thoughts on the assignment, things you learnt and would like to remember when you look back at this assignment)


#### Self Assessment
##### Part 1:
- [ ] The program runs with no errors.
- [ ] The Person class includes all the fields and methods specified above.
- [ ] Usage of the `Calendar` object to calculate age in the `getAge` method.
- [ ] The program properly instantiates objects using the class constructor.
- [ ] The program properly stores the Objects in an `ArrayList`.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)

##### Part 2:
- [ ] The program runs with no errors.
- [ ] The program properly uses the `JFileChooser`.
- [ ] The program properly instantiates objects using the class constructor.
- [ ] The program properly stores the Objects in an `ArrayList`.
- [ ] The program output is formatted properly.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)

**Your Grade:**  /20

**Notes:**

 -----
<!--⬇⬇⬇⬇⬇⬇ DO NOT MODIFY THIS SECTION ⬇⬇⬇⬇⬇⬇ -->
### Lab Goals
1. Practice creating classes and instantiating objects.
2. Instantiate object using data from a text file.
3. Persist Object data to a text file.
4. Store and Manipulate class objects with an `ArrayList`

### Final Result:
You will be submitting a git repository with the following naming
convention, `2-get-classy-<your-github-username>`, (i.e., `2-get-classy-Ygilany`). The repository contains:
1. one Java Project with the following files:
  1. Person.java (a class to represent a person object)
  2. PersonGenerator.java (has a main method)
  3. PersonReader.java (has a main method)
  4. SafeInput.java (The source file is available with the assignment instructions)
  5. The output text file from the PersonGenerator program.
2. a modified README.md file that includes your self-assessment
----

## Part 1: Writing to a text file:

1. Create a `Person.java` class to represent a Person Object.

  |**Person**| | |
  |-------|--|--|
  |*Fields*|||
  ||`String ID;`| |
  ||`String firstName;`| |
  ||`String lastName;`| |
  ||`String title;`| Mr., Mrs., Ms., Prof., Dr., Hon., ... |
  ||`int YOB;`| - Year of Birth <br/> - Range should be 1940-2010 <br/> - make sure validations happen in the constructor as well as the setter method. |
  |*Methods*|||
  ||Constructor| |
  ||Getters and Setters| |
  ||`public String fullName()`| returns a concatenation of the first and last names |
  ||`public String formalName()`| returns a concatenation of the title and the full name |
  ||`public static int getAge(int year)`| - A static method that takes a year and returns an age. <br/> - Use the Calendar Object (Requires a bit of web search)|
  ||`public String toCSVDataRecord()`| - returns a comma separated value (csv) String suitable to writing to a java text file. <br/> - Make sure to use this function when saving data to the file. <br/> - (i.e., 0001,John, Doe,Mr., 2000)|

2. Create a program (Java main class) called `PersonGenerator.java`.
  - a user will input the data to the console.
  - a *Person* object is created for each entry.
  - Store all the *Person* objects in an `ArrayList<Person>`
  - Export all the  *Person* objects to a text file using the `toCSVDataRecord()` method

#### Grading
- [ ] The program runs with no errors.
- [ ] The Person class includes all the fields and methods specified above.
- [ ] Usage of the `Calendar` object to calculate age in the `getAge` method.
- [ ] The program properly instantiates objects using the class constructor.
- [ ] The program properly stores the Objects in an `ArrayList`.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
----

## Part 2: Person Reader:

1. Create a program (Java main class) called `PersonReader.java`.
  - Use the `JFileChooser` to prompt the user to select the file you export in Part 1.
  - Instantiate a *Person* Object for each record you read from the file.
  - Store all the *Person* Objects in an `ArrayList<Person>`.
  - Use the `String.format` or `System.out.printf` method to create a neatly formatted columnar display of the data.

```
ID    Firstname    Lastname   Title    YOB
==================================================
0001  John         Doe        Mr.      1990
0002  Jane         Doe        Mrs.     1993
```

#### Grading
- [ ] The program runs with no errors.
- [ ] The program properly uses the `JFileChooser`.
- [ ] The program properly instantiates objects using the class constructor.
- [ ] The program properly stores the Objects in an `ArrayList`.
- [ ] The program output is formatted properly.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)


<!--⬆⬆⬆⬆⬆⬆ DO NOT MODIFY THIS SECTION ⬆⬆⬆⬆⬆⬆ -->
 -----
