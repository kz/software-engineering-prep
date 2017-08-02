# 2. Object Oriented Design

## 2.5 Casting and Generics

The old way to handle generics would be to use objects (where member variables are declared as `Object`) and a narrowing cast. For obvious reasons, this is not ideal.

Instead, we can do the following:

```java
public class Pair<A,B> {
    A first;
    B second;
    public Pair(A a, B b) {
        first = a;
        second = b;
    }
    public A getFirst() { return first; }
    public B getSecond() { return second; }
}

Pair<String, Double> bid; // Declaration
bid = new Pair<String, Double>("0RCL", 32.07); // Instantiation with explicit types
bid = new Pair<>("0RCL", 32.07); // Instantiation with type inference; Java SE 7
```

When arrays become involved:

```java
Pair<String, Double>[] holdings;
holdings = new Pair<String, Double>[25]; // Invalid; compile error
holdings = new Pair[25]; // Valid, with unchecked cast warning
holdings[0] = new Pair<>("04CL", 32.07) // Valid
```

```java
public class Things<T> {
    T[] things;
    public class Things(int num) {
        things = new T[num]; // Illegal; compiler error
        things = (T[]) new Object[num]; // Valid: creates array of objects which is cast to array of T
    }
    public T get(int i) { return things[i]; }
    public void set(int i, T thing) { things[i] = thing; }
}
```

Note the existence of _bounded type parameters_ to constrain what a type can be:

```java
public class NaturalNumber<T extends Integer> { private T n; }
```