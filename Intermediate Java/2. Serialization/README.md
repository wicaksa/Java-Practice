# Serialization
Serialization describes the process of taking an object’s state and transforming it into a stream of bytes. Let’s discuss the terminology further:

- A stream is an abstract definition of a sequence of data that is made available over time.
- A byte is an 8 bit (0s or 1s) group of data.
- A stream of bytes is a sequence of bytes that is made available over time.

To serialize an object, its fields and their types are stored in the form of bytes. These bytes are then able to be written to memory, a file, a database, or sent over a network with all the information necessary to recreate the object.

# Deserialization
You may be wondering, “This is great and all but how do I get my object back from this stream of bytes?” This is where deserialization comes in. 

Deserialization as the name suggests, does the opposite of serialization and converts a stream of bytes back into an object. Using both serialization and deserialization gives us the flexibility to persist our objects and get them back when needed. 

There are a couple of important details to note about serialization and deserialization:

- The stream of bytes created by serialization only includes the member variables of an object and not its methods. 
- Deserialization creates a copy of the original object. This copy shares the same state but is an entirely new object in memory. 

