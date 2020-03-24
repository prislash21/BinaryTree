# Binary Tree 

>#### Here I use Hashmap for implementing Binary Tree. Because hashmap represents unique value as like binary tree.


_Summery_
___
* User can input the Parent node value and child note value as they want to use.
*  If that node already  in map then, user can terminate from creating new node.
* Otherhand if the node is not exists in the map then user can create one.
* Here is an Exception Handler what can handle cases:
     * [x] Already inputed Right child can not be input in the same place.
     * [x] Already inputed Left child can not  input in the same place.
___

### Step 1:
```java
System.out.println("Enter node value: ");
    int nodeValue = scanner.nextInt();
            
if (nodeValue > 0 && !binaryTree.containsKey(nodeValue)) {
    Node node = new Node(nodeValue);
}

```
### Output

___

### Step 2:

```java
 System.out.println(
     "Enter parent value (if it is root then enter 0) : ");
    
```
### Output:

___

```java
System.out.println("Enter node's position(For Right R, For Left L) : ");
     scanner.nextLine();
     String position = scanner.nextLine();
```

### Output : 
 here will be the screenshot

___

If the program goes normally then it will look like :


here will be the all outputs screenshot 


____

Exceptios will be there ...

 Exception handled successfully





### BinaryTree with Hashmap - C
Write C docs there
