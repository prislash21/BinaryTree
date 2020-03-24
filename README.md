
# Binary Tree 

>#### Here I use Hashmap for implementing Binary Tree. Because hashmap represents unique value as like binary tree.


_Summery_
___
* User can input the Parent node value and child note value as they want to use.
*  If that node already  in map then, user can terminate from creating new node.
* Otherhand if the node is not exists in the map then user can create one.
* Here is an Exception Handler what can handle cases:
     * [x] Already inputed Right child value can't be inputted in the same place.
     * [x] Already inputed Left child value can't be inputted in the same place.
___

```java
System.out.println("Enter node value: ");
    int nodeValue = scanner.nextInt();
            
if (nodeValue > 0 && !binaryTree.containsKey(nodeValue)) {
    Node node = new Node(nodeValue);
}

```






































### BinaryTree with Hashmap - C
Write C docs there
