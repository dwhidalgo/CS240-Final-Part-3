/*************************************************************************
  Winter 2017 CS 240 Programming Exam : Person

 Author: Drue Hidalgo      

 Dependencies: Stack, Queue, Dictionary

 Description:  Models a person, a list of messages that they can
               read, and a list of their friends, so that when you
               post a message, all your friends can read it too.

**************************************************************************/

import java.util.Stack;
import java.util.PriorityQueue;


public class Person { 
	PriorityQueue<Stack<String>> Person = new PriorityQueue<Stack<String>>();
	//Stack<String> Person = new Stack<String>();
    // Create a new Person with this name.
    public Person(String name) 
    {
        Person newPerson = new Person(name);
    }

    // Make these two people become friends with each other.
    // Throw an exception if you try to meet yourself.
    // We are allowed to assume we didn't meet this person yet.
    public void meet(Person otherPerson) 
    {
        if(Person != otherPerson)
        {
            Person.add(otherPerson);
        }
        else
        {
            throw RunTimeException;
        }
    }

    // Are these two people friends?
    // Throw an exception if you ask about knowing yourself.
    public boolean knows(Person otherPerson) 
    {
       if(Person != otherPerson)
       {
           Person.contains(otherPerson);
       }
       else
       {
           throw RunTimeException;
       }
    }

    // Post a message to my list and the lists of all my friends
    public void post(String message) 
    {
        Person.push(message);
    }

    // Print a header, then all messages this Person can read, newest first
    public void listMessages() 
    {
       System.out.print("==The Wall Of " + Person + " ==");
       for(int i = 0; Person.size() > i; i++)
       {
           Person names = Person.search(i);
           System.out.print(names.toArray());
       }
       
    }
}