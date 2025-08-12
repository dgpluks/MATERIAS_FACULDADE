C# language:

    Attention: in this language, uppercase and lowercase letters are case-sensitive.

Basic main structure:

    Using using System;
    class MainClass{
              public static void Main(string[] args){

              }
    }

    using System --> //avoids having to write "System." every time throughout the program, similar to using namespace std in C++. For example, instead of writing System.Console.ReadLine(), you can write Console.ReadLine() after including using System;//

    

The convention is to capitalize the main class name.

Reading User Input:

Console.ReadLine();

This line stores the input as a string, even if the user types a number, you need to convert it to what you want, for example:

int.Parse(Console.ReadLine());

Different from the C language, when you read the line and want to assign the value to the variable, you must assign a value to the variable using the assignment operator (=), for example:

int altura;
altura = int.Parse(Console.ReadLine());

Show something on the screen:

To show something you use the command Console.WriteLine(“Here goes the text followed by the variable.” + variable);
You need to use + to concatenate every item.

Loops:

The while and for structure are the same as C and C++, with the following structures:

while(condiction){commands lines}
for(condition){commands lines}

Naming Convention:

Class names follow the PascalCase, that is each word starts with a capital letter, with no spaces or underscores, for example:

class MainClass(){}

Private variables start with an underscore followed by the name in PascalCase, whereas the public variables doesn't have the underscore on the start.

Method names follow PascalCase, that is, each word starts with a capital letter, with no spaces or underscores. For example, CalculateTotal.

Variable names usually follow camelCase, where the first word starts with a lowercase letter and each following word starts with a capital letter, with no spaces or underscores. For example, totalAmount.
