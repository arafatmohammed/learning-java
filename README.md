# Learning Java

## Data Structure:

A way of maintaining, changing, manipulating data in Java.

### Arrays

A DS allows you to store more variables
Define size
Cannot expand the size of an array


### List

If you want to expand the size, you can use Lists


### Sets

Similar to list, does not allow duplicates. And order is not guaranteed


### Stacks

Stacks are LIFO: Last in First out

### Queues

Queues are FIFO: First in First out

### Representing Money : Use BigDecimal

Double type has certain precision, you can lose some data. To represent money, use the big decimal data type.

### Null Values - Using Optionals

null value cannot be bound to a "var" keyword or any other Primitive data type. Use the object data type.

### Exceptions - Checked Exceptions and Unchecked Exceptions


`Checked Exceptions` - Exceptions that need to be handled at Compile time. Use try-catch block or throws keyword

`Unchecked Exceptions` - Not checked at Compile time, if you handle them, the program will not give you a compilation error


 ### Keywords need to learn for try-catch

 `try` : add logic here, if that logic errs, use catch

 `catch` : In here you pass the exception type you are expecting, if you do not know what exception type, put "Exception"

 `finally` : If the try-catch works or not, execute regardless, for cleanup purposes

 `catch ()` : Inside this paranthesis, it is not limited by one exception, you can have multiple catch () blocks, or have one catch () with multiple exceptions separated by "|" 


 ### Define your own exceptions

 