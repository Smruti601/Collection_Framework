import java.util.Stack;

class Demo{
    public static void main(String[] args) 
    {
        Stack<String> animal = new Stack<>();
        
        animal.push("Tiger");
        animal.push("Lion");
        animal.push("Leo");
        animal.push("Puma");
        animal.push("Panther");
        animal.push("Deer");


        System.out.println("Stack :" + animal);//Stack :[Tiger, Lion, Leo, Puma, Panther, Lion]
//==================================================================================================
        animal.pop();// Deer is deleted as it is last in (LIFO)
        System.out.println("Stack :" + animal);//Stack :[Tiger, Lion, Leo, Puma, Panther]
//==================================================================================================
        System.err.println("Peek Object_in_Stack : " + animal.peek()); // Peek Object_in_Stack : Panther

//===================================================================================================

        System.err.println("Positon From the Peek : " + animal.search("Puma")); // Positon From the Peek : 2
//====================================================================================================
    
        System.err.println("Is the Stack Empty ? " + animal.empty());//Is the Stack Empty ? false

    }
}

// Output :
// ========
// Stack :[Tiger, Lion, Leo, Puma, Panther, Deer]
// Stack :[Tiger, Lion, Leo, Puma, Panther]
// Peek Object_in_Stack : Panther
// Positon From the Peek : 2
// Is the Stack Empty ? false