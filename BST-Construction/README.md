
## Write a BST class for a Binary Search Tree. 

Each BST node has an integer value, a left child node, and a right child node. A node is said to be a valid BST node if and only if it satisfies the BST property: 

- its value is strictly greater than the values of every node to its left; 
- its value is less than or equal to the values of every node to its right; 
- its children nodes are either valid BST nodes themselves or None / null. 

The class should support: 
- Inserting values with the insert method.
- Removing values with the remove method; this method should only remove the first instance of a given value. 
- Searching for values with the contains method.

### Note:
you can't remove values from a single-node tree. In other words, calling the remove method on a single-node tree should simply not do anything. 



### Sample Usage

- Assume the following BST has already been created:
<pre>
         10
       /     \
      5      15
    /   \   /   \
   2     5 13   22
 /           \
1            14

</pre>
- All operations below are performed sequentially.

<pre>
insert(12):   10
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /        /  \
     1        12  14

remove(10):   12
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /           \
     1            14

contains(15): true
</pre>
