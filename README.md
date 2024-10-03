# My Program - Your Choice

My Topics:
- Instances
- CompoundDataStructures

## Explanation:

In this program there are two classes, Television show and Collection.

### TelevisionShow
Television Show is a simple class that describes a tv show. It has fields: title (String), season (int), and cast (List<String>). It also has a basic constructor, toString, and getters for the title and cast fields.

### Collection
Collection is the main program which uses **Instances** and **CompoundDataStructures**. It creates two instances of TelevisionShow then uses those instances to create a HashMap. The keys are the titles and the values are the cast lists. The resulting HashMap contains ArrayLists which makes the HashMap a CompoundDataStructure.
The Collection class prints both TelevisionShow instances and the HashMap to the console.
