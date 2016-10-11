Use RegexTester to test all the expressions.

I decided not to print the regular expression after each input since some of
these regular expressions are quite large. To validate input on States,
Streets, web extension, etc. -- I checked for specific input that matched
all currently qualifying data (ie. DisneyLand is not a state so it is denied).

Each regular expression being tested has its corresponding java file. All
extend RegexOption and each corresponding class name via option can be viewed
in RegexOptionFactory.
