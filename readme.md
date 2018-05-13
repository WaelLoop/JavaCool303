The design patterns that I used:
1. Decorator Pattern: Since we reshape a Button based on the theme passed to it. For example, having a pastel button would turn a rectangular shaped button to a round rectangular button.
On the other hand, having a summer button would turn a rectangular shaped button to a circle button.

2. Composite Pattern: It's Root since it contains the Box/Containers. In addition, both Box/Container and root extends Panel, and I have an arrayList of Boxes. Therefore, I can iterate on each box and manipulate each one. Thus making it a composite pattern.

3. Strategy Pattern: since I made a root requires a specific theme so that it arranges the root based on the theme passed. For the case of this assignment, I made 2 arrangements which are basically the themes and the TA will also add a theme to my program to see how root rearranges itself and its components based on the theme the TA created.
---------------------------------------------------------------------------------------
The design techniques that I used: Abstract Classes and Inheritance.

The Abstract classes: Specifically Cool303Root, Cool303Box, Cool303Button and Cool303Theme.

Cool303Root: it has 2 children, Cool303PastelRoot and Cool303SummerRoot. Each of the children creates a root based on the theme. Moreover, each child has his own methods. As for Cool303Root, it has 2 arrayLists that hold Cool303Pastel and Cool303Summer boxes. It also has methods that tells us information about these arrayLists.

Cool303Box: it has 2 children, Cool303PastelBox and Cool303SummerBox. Each of the children creates a box based on the theme. Moreover, each child has his own methods. As for Cool303Box. It has 2 array lists that hold Cool303Pastel and Cool303Summer buttons. It also has methods that tells us information about the array lists. As well as an addString method that adds a title to the box. In Addition, this class has an abstract method called addButton to which each child will add a its themed button to the themed box.

Cool303Button: it has 2 children, Cool303PastelButton and Cool303SummerButton. Each of the children creates a button based on the theme.

Cool303Theme: it has 2 children, Cool303Pastel and Cool303Summer. Each of the children creates a theme-based object. In addition each child checks if the instance matches the passed theme. Otherwise it throws an exception.

That way, in order to make a button, you must have created a box and in order to add a box, you must have created a root.


P.S.: If you want to add your theme to my program, you will have to create a theme, a root, a box and a button classes and have each extends Cool303Theme, Cool303Root, Cool303Box and Cool303Button respectively. Next, you will have to go to Cool303Window, Create a arrayList of the themeRoots you chose and in the function addRoot(Cool303Theme theme), add an extra condition for your theme(follow the way I check for the themes). Also add, getter for the array list you added. Finally, all that is left off is to go to application and hand code creating a root, a box, a button, resizing root(if you want), adding texts(Follow the way I do it for each theme). And that is all :)