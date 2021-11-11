# Scala : For Expression

## For Expression
Expression to handle the loop.  
Consists of generator, definition and filter.  

## Sample
```Scala
    for (p <- persons; n = p.name; if n startsWith "C")
        yield print(n + ", ")
        
    for {
        p <- persons          // Generator
        n = p.name            // Definition
        if n startsWith "C"   // Filter
    } yield print(n + ", ")
```
