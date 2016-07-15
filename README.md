## Take Home Points of Design Patterns

### Creational Patterns

#### Abstract Factory

Families of products are hierarchically structured. Reflection can be used to create objects through
respective Family's Abstract Factory.

Abstract Factory is object-based pattern. Each individual object can vary in the construction within same family of classes.

#### Builder

Builder pattern constructs a product where sequence of steps or operations involved in object construction are fixed.
A director uses an AbstractBuilder to call the sequence of method available in the AbstractBuilder class.
Sub-classes of AbstractBuilder provides the variation of the different product types.

#### Factory Method

Factory Method uses the hierarchy of the product classes itself to build a product(s). Non-abstract Factory method in
the super class of the object-hierarchy invokes other abstract methods. Sub-classes override the abstract methods
to give specific implementation customized for each class of product

Factory method is class-based pattern that fixes the construction of each class of objects.

#### Prototype

Prototype pattern uses "copyOf" method similar to copy constructor to comply with open/close principle in the 
containing object and the client that constructs the product.

Product class need not be modified each time a new implementation of interface wrapped in product class
is added.

#### Singleton

Singleton factory is implemented using enums in java. Enum types are thread-safe, will not lead to concurrency issues.

If thread-safety is not the issue then private constructor checking single static instance & getInstance method
double checking the null value by obtaining lock on the class will give correct implementation.

Object serialization still poses challenges in guaranteeing the correctness of singleton instance.

### Structural Patterns

#### Adapter

Adapter pattern comes in two varieties. On by inheritance and other by composition.

Adapter pattern by inheritance is inflexible if the adapteee is a final class or when it's subclasses needed to be used
by the client.

Adapter pattern by composition, Adapter class contains adaptee class and implements the known interface. When the
the overidden methods are called it delegatee the call to the adaptee.
  
#### Bridge

Bridge design pattern uses dependency injection to the bridge class (In this example Expert interface) to allow
extensibility to either side of class hierarchies.

In the example; Translator is injected into Expert class. Both Translator and Expert could be extended while the
client takes care of proper implementation of Translator to be injected.

