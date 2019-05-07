In the XYZ society, the neighbours hate each other for their attitude. 
Various activities are organized in the society for Welcoming the New Year. 
The tickets were provided to each house with an integer written on it. 
Some got tickets with positive integers and some got tickets with negative integers. 
In the evening, people had to carry their tickets to the club house where the eligible ones will get 
the exciting gifts. The eligibility of winning the gift depends on the maximum sum which can be formed 
from the tickets numbers keeping in mind that neighbours hate each other. Since the neighbours hate each other, 
the two cannot be together in the list of maximum sum. 

The President of the society, Mr. Singh, is a wise man and know that neighbours in society don't like each other. Also, he don't wish to become bad in front of people. So, he came up with an idea to design a program which will provide the list of integers forming maximum sum and thus all the members of the list will be given the gifts. The only problem with this idea is that he don't know programming so he is asking you to provide the correct list of integers. The people may be annoying but are smart and will fight if the list provided by you doesn't form the maximum sum.


Note: The integer written on ticket of individuals may or may not be unique. In case, when there are two list with equal maximum sum, the list with first greater element would be considered. For better understanding, look at the explanation of Test case 4 in Sample Test Case. The tickets with integer 0 are not considered for winning the gifts.


Input Format
The first line of input consist of number of test cases, T.

The first line of each test case consist of the number of houses (tickets distributed) in society, N.

The second line of each test case consist of N space separated tickets with integer written on them.




Constraints
1<= T <=10

1<= N <=10000

-1000<= Integer_on_Ticket <=1000



Output Format
For each test case, print the ticket numbers in a single line forming the maximum sum in the format similar to Sample Test Case.

Sample TestCase 1
Input
5
5
-1 7 8 -5 4 
4
3 2 1 -1 
4
11 12 -2 -1 
4
4 5 4 3 
4
5 10 4 -1


Output
48
13
12
44
10

Question 2 
-----------

A new fighting game has become popular. There are N number of villains with each having some strength. 
There are N players in the game with each having some energy. The energy is used to kill the villains.
 The villain can be killed only if the energy of the player is greater than the strength of the villain
 
 
 Maxi is playing the game and at a particular time wants to know if it is possible for him to win the game or not with the given set of energies and strengths of players and villains. Maxi wins the game if his players can kill all the villains with the allotted energy.



Input Format
The first line of input consist of number of test cases, T.

The first line of each test case consist of number of villains and player, N.

The second line of each test case consist of the N space separated strengths of Villains.

The third line of each test case consist of N space separated energy of players.



Constraints
1<= T <=10

1<= N <=1000

1<= strength , energy <=100000



Output Format
For each test case, Print WIN if all villains can be killed else print LOSE in separate lines.

Sample TestCase 1
Input
1
6
112 243 512 343 90 478 
500 789 234 400 452 150


Output
WIN


Explanation
For the given test case, If we shuffle the players and villains, we can observe that all the villains can be killed by players.



Player

Villain

RESULT

500 - 478

WIN

789 - 512

WIN

234 - 112

WIN

400 - 243

WIN

452 - 343

WIN

150 - 90

WIN


As all the villains can be killed by the players, MAXI will WIN the game. Thus, the final output is WIN.
Sample TestCase 2
Input
2
6
10 20 50 100 500 400 
30 20 60 70 90 490 
5
10 20 30 40 50 
40 50 60 70 80
Output
LOSE
WIN
