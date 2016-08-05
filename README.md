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

#### Composite

When hierarchy of classes composed in a class, LSP (Liskov substitution principle) maybe violated. Composite design
pattern alleviates the violation of LSP by generalizing the class hierarchy. Super class in the hierarchy
implements some of the methods such as add, remove, count, operation() to provide the generality.

On the flipside, violations of LSP may be pushed to the specific sub-classes.

#### Decorator

When nesting of object behavior is required, Decorator pattern comes handly. Leaf level component in the decorator
pattern does not invoked nested component, others invoked nested component before self' behavior is executed.

In the example: EvaluationDecorator handles the nested part and ResidentialEvaluator handles the leaf part.

#### Facade

Facade patterns provides an easy way to interact with complex set of sub-systems when the client is not interested
to inteface with all the details of sub-systems. Having said that client can have visibility to the sub-systems
if needed. 

Facade is loosely coupled with sub-systems, sub-systems have no knowledge of the facade.

#### Flyweight

Flyweight pattern minimizes the number of objects by sharing similar objects instead of creating new ones.
Immutable state that holds intrinsic state can be shared during computation & mutable state can change during
computation.

For example is: java.util.regex.Pattern holds intrinsic state of regEx expression that is compiled and shared among
the extrinsic string data stored by Matcher classes.

In the example, Color state can be shared while varying the location and size data.

#### Proxy

Proxy pattern is implemented in different flavors in different contexts
Remote proxy pattern - provides an indirection between local or remote implementations
Virtual proxy pattern - provides lazy instantiation to defer the object creation during first method call
Protected proxy pattern - controls the access to the object by hiding some details
Proxies in Mock Test Frameworks - Mock test frameworks use proxy object using CGLib or similar dynamic libraries

### Behavioral

#### Chain of responsibility

Seems similar to Decorator pattern but differs in the intent of the pattern. When an event needs to be handled
by one or few of the event handlers, the chaining of the objects by passing along the chain until an object
handles it.

#### Command

Command pattern uses callback functions to separate concerns of the details in the receiving object vs the
callback processing
 
#### Interpreter
 
Interpreter pattern is used in evaluation of expressions/natural language using terminal and non-terminal
symbols created from the parsing of the text.

#### Iterator

Iterator pattern provides consistent way of traversing elements across different type of collections

#### Mediator

Mediator pattern decouples the related components from interactions by delegating the responsibility 
to the mediator. Mediator holds references of all the components and manages the constraints.
 
#### Memento
 
Without violating the object encapsulation, save the internal state of an object to be restored to a
previous copy at a later time

#### Observer

Decoupling of the objects by registering for the notification of events. java.util has Observer and Observable
classes to go with the pattern. Lambda expressions further simplifies the implementation of the pattern.

#### State

Pattern implements the state machine on the internal details of an object by making classes derive from a
state pattern interface or abstract class

#### Strategy

Within a family of algorithms, strategy pattern allows interchanging of algorithms at the runtime.

#### Template Method

Template method standardizes skeleton of an algorithm and defer details/steps of the algorithm to the subclasses

#### Visitor

One or more algorithms can be applied on an of object structure without polluting the object structure with details
of the algorithm. Object structure is decoupled from the algorithms.

[Reference: Agile Learner by Venkat Subramaniam](https://www.agilelearner.com/)