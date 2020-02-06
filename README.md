# Assignment


SINGTEL 2020

Hi ,Good Day :)

I have create seperate branch for each section.

Section A
1.a. Added sing() method inside Bird Class.Solution class, when sing() method is called it prints "I am Singing".
1.b. Adding method into the class is not scalable and maintainable.
    To solve this create Animal abstract class remove its behaviour walk(),sing(),fly() .
    Create interface [Walk/Fly/Swim/Sing]] .
    Bird Class extends Animal
2. Added Interface Swim contains method swim.
  Bird to extend Animal and implement Walk, Sing since all birds can walk and sing but may not fly or swim.
  Create a class Duck [SubClass] which extends Bird [SuperClass] and implements Swim and Fly interface.
  Chicken(extends Bird) will just override the sing fly and method.
3.Rooster Class implements Sing Interface
  	1.isChicken value is true ,say Cluck cluck [Chicken]
  	2.isRooster value is false ,say Cock-a-doodle-doo

  Tried Another Way using Enums
  Assume MALE, FEMALE Chicken ,A Rooster is a male Chicken ,Chicken is a female Chicken.
  SexEnum contains FEMALE,MALE
  Based on sex the sing() method will sing as Cluck,cluck or Cock-a-doodle-doo

4.4. Based on input parameter ,Parrot will reply
  eg:A parrot living with dogs says ,Woof, woof


Section B
1. Fish extends Animal and implements Swim.

2. Fish has size and color property. Shark extends Fish has eat() method as only sharks eat other fish and ClownFish extends Fish and can makeJokes.

3. Dolphin implements Swim [Interface]

Section D
1. Create an Insects class which extends Animal, and Butterfly extends Insects and implements Fly.

2. Create an Catterpillar class which extends Insects.
	Create Metamorphosis,which has a stage method that defines the catterpillar to butterfly.



Bonus

1.Localisation , based on the language rooster reply sound
eg: Rooster language "DANISH" ,it says "kykyliky"


2.REST webservice get List of animals and behaviour
eg;
1.http://localhost:9000/stat/BIRD
{"animal":{"type":"bird","name":"bird","swim":"I cannot Swim","walk":"I am Walking","sing":"I am Singing"}}
2.http://localhost:9000/stat/CLOWNFISH
{"animal":{"type":"animal","name":"ClownFish","swim":"I am Swimming","walk":"I cannot walk","sing":"I cannot sing"}}


Written Test Case for one method only.

Attached Screenshot in word doc
Assignment2020.doc

Thanks :)

