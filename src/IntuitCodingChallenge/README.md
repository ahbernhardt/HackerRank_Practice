You are running a classroom and suspect that some of your students are cheating by sharing answers as single words hidden in 2D grids of letters.

A particular grid contains at most one word. The word may start anywhere in the grid, and consecutive letters can be
either below or to the right of the previous letter.

The input will consist of a word and a grid. Print the location of the word in the grid as a list of “row column”
coordinates, each on its own line. If the word does not appear in the grid, just print “None”. 

Example input:
```angular2html

catnip
c r c a r s
c r c a r s
c r c a r s
x s i i p t 

```


Example output 
0 2
0 3
1 3
2 3
3 3
3 4 

Clarifications:
The word will always appear in the grid exactly 0 or 1 times.
