# FlyingDevices
Various flying objects can be described as follows:
- An Airplane class, which has the following attributes: a brand (String type), price (double type)
and horsepower (int type).
- A Helicopter is an Airplane that additionally has the
following: a number of cylinders (int type), a creation
year (int type), and a passenger capacity (int type).
- A Quadcopter, is a Helicopter that additionally has the
following: max flying speed (int type), which indicates its
maximum moving speed.
- A Multirotor is a Helicopter that additionally has the
following: number of rotors (int type), which indicates its
number of rotors/blades that it has.
- A UAV (Unmanned aerial vehicle / Drone) class has the
following attributes: weight (double type), and price
(double type).
- An AgriculturalDrone (which is used for crop
production) is UAV that additionally has the following:
brand (Sting type), and carry capacity (int type).
- A MAV (Micro Air Vehicle), is a miniature UAV that
has a size restriction (and can be as small as few
centimeters. It has the following: model (String type) and
size (double type). 

Part I: 
1. Draw a UML representation for the hierarchy of the above-mentioned classes. Your representation
must also be accurate in terms of UML representation of the different entities and the relation
between them. You must use software to draw your UML diagrams (no hand-writing/drawing is
allowed). In case additional classes are needed to reflect how the above classes are related in real-life,
you can add these classes.

2. Write the implementation of the above-mentioned classes using inheritance and according to the
specifications and requirements given below:
- You must have 5 different Java packages for the classes. The first package will include the
Airplane class. The second package will include the Helicopter, and the Quadcopter classes.
The third package will include the Multirotor class. The fourth package will include UAV class,
and the last package will include the AgriculturalDrone and MAV classes.
- For each of the classes, you must have at least three constructors, a default constructor, and a
copy constructor. The default constructor should initialize the object with any values (that make
sense though). The parameterized constructor will accept enough parameters to initialize ALL the
attributes of the created object from this class. For instance, the parameterized constructor of the
Quadcopter class must accept 7 parameters to initialize the brand, the price, the horse power, the
number of cylinders, the creation year, the passenger capacity, and the maximum flying speed.
The copy constructor creates a new object that is an exact copy of the passed objct.
- An object creation using the default constructor must trigger the default constructor of its ancestor
classes, while creation using parameterized constructors must trigger the parameterized
constructors of the ancestors.
- For each of the classes, you must include at least the following methods: accessors, mutators,
toString() and equals() methods (notice that you are always overriding the last two methods). 
− The toString() method must return clear description and information of the object, including
its exact type (i.e “This Agricultural Drone is manufactured by Agridrones. It weighs 340
pounds, and costs 98000$. It can carry up to 25 Kg….).
− The equals() method must first verify if the passed object (to compare to) is null and if it is of
a different type than the calling object. The method would clearly return false if any of these
conditions is true; otherwise the comparison of the attributes is conducted to see if the two
objects are actually equal. Two objects are equal if the values of all their attributes are equal.
- For all classes you must use the appropriate access rights, which allow most ease of use/access
without compromising security. Do not use most restrictive rights unless they make sense!
- When accessing attributes from a base class, you must take full advantage of the permitted rights.
For instance, if you can directly access an attribute by name from a base class, then you must do
so instead of calling a public method from that base class to access the attribute.

3. Write a driver program (that contains the main() method), which will utilize all of your classes.
The driver class can be in a separate package or in any of the already existing packages. Besides
the main() method, the driver will also include another static method called
findLeastAndMostExpensiveUAV(). The description this is as follows:
- The findLeastAndMostExpensiveUAV() should be able to accept any array of flying objects as a
parameter. The method however must find both the least-expensive and the most-expensive UAV
objects in that array (if any exists). If so, the method must find, then display (using toString), the
information of these two UAV objects. If only one UAV object exists in the passed array, then it is
considered as the least and the most expensive. If no UAV objects are found, the method must display
something to that effect.

4. In the main() method you must:
- Create at least 15 objects from the 7 classes, and display their information (you must take
advantage of the toString() method).
- Test the equality of some of the created objects using the equals() method. You should
test at least the equality of two objects from different classes, two objects from the same
class with different values and two objects with similar values. In other words, you
should include enough test cases to test your implementation.
- Create 2 arrays, each of 15 to 20 of these flying objects and fill these arrays with various
objects from these classes. The first array must include at least one object from each of
the classes; while the second array should not have any UAV objects.
(HINT: Again, do you need to add something else to the classes described above? If so;
go ahead with that!)
- Finally call the findLeastAndMostExpensiveUAV() once with the first array as a
parameter and once with the second array. This should display what is needed! 

Part II:
In that part, you need to modify/expand the implementation from Part I as follows:

1. Create a new driver program (again, keep in mind that you should treat that as if it was a different
assignment. You can however copy/reuse any code from Part I). Besides the main() method, you
need to add another static method (add it above the main() method), called copyFlyingObjects.
The method will take as input an array of these objects (the array can be of any size) and returns a
copy of that array. That is to say, the method needs to create an array of the same length as the
passed array, copy all objects from the passed array to a new array, then return the new array.
Your copy of the objects will automatically depend on the copy constructors of the different
listed classes. You must consider the following restrictions: Do NOT attempt to explicitly find
the exact type of the objects being copied, do NOT attempt to find the object type inside the
copy constructors and Do NOT use clone().

2. In the driver program, create an array of 15 to 20 objects (must have at least one from each of the
classes), then call the copyFlyingObjects() method to create a copy of that array. 
