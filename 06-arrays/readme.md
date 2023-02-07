## Arrays

- Used to store many values at one time in an organized way
- All the values have to be of the same type
- These values are somewhat related to one another

To create an array of integers -

```java
int[] integers = {1, 2, 3};
```

To create an array of strings -

```java
String[] words = {"hi", "hello", "hola"};
```

To create an array of decimals -

```java
double[] words = {1.2, 2.2, 3.3};
```

- Variable does not store the array directly, it store the reference that points to the created array
- Printing a whole array prints its Hashcode representation

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(names); // [Ljava.lang.String;@5acf9800 (memory address)
```

- Each array element is stored at an index (starting from 0) and can be printed separately

```java
                  // 0       1       2
String[] names = { "John", "Mary", "Bob" };
System.out.println(names[0]); // John
System.out.println(names[1]); // Mary
System.out.println(names[2]); // Bob
System.out.println(names[3]); // Array Index Error
```

## Looping Arrays

Arrays can be looped over so we don't need to perform a single operation for every single element one by one.

#### The `length` property

- Returns the number of elements in an array

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(names.length); // 3
```

- Used a lot when looping over arrays

```java
String[] names = { "John", "Mary", "Bob" };

for (int i = 0; i < names.length; i++) {
  System.out.println(names[i]);
}
```

#### Tips

- Always use `length` property to count elements, never do it yourself
- Be careful while using the condition, since the last element will always have the index 1 less than the array's length
- In the above case, if we used `i <= names.length` it will throw an error since at one point `names.length` will be 3 and if we enter the loop with `i=3` we won't get any element since last element has the index 2.

## Updating Arrays

- Use the element index and directly update it's value

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(Arrays.toString(names)); // [John, Mary, Bob]

// Update the value at index 1 and index 2
names[1] = "Alice";
names[2] = "Charlie";
System.out.println(Arrays.toString(names)); // [John, Alice, Charlie]
```

#### `Arrays.toString()`

- Used to convert arrays into string format

```java
import java.util.Arrays;

String[] names = { "John", "Mary", "Bob" };

System.out.println(names); // [Ljava.lang.String;@5acf9800 (memory address)
System.out.println(Arrays.toString(names)); // [John,  Mary, Bob]
```

#### Adding New Elements

- You cannot change the size of the array once it's created
- If more new elements are need to be added then create a new array with larger size and copy the previous elements into it using a loop
- Manually add the new elements into remaining index of the new array

```java
String[] names = { "John", "Mary", "Bob" };

// Create a new array with a larger size
String[] newNames = new String[5];

// Copy the elements from the old array to the new array
for (int i = 0; i < names.length; i++) {
  newNames[i] = names[i];
}

// Update the value at index 3 and index 4
newNames[3] = "David";
newNames[4] = "Eve";
```