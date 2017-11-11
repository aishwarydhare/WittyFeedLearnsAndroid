# WittyFeedLearnsAndroid
It has the docs of our sessions and the sample projects we build


## Session 1

6 Nov&#39; 17

What is Android ?

-
  - Softwares built with Java using Android Development Tools, for developing applications that run on a Linux based Operating System that is called Google Android OS
  - Custom Firmware are built such as MIUI by companies taking Google Android OS versions as reference
  - Android History
    - Started by Android Inc., purchased by Google in 2005
    - From 1.6 it started getting recognized with names

&lt;release\_name&gt; &lt;API version&gt; - &lt;version\_name&gt;

- Donut 4 - 1.6
- Eclair 5 - 2.0
- Froyo 8 - 2.2
- Gingerbread 9 - 2.3
- Honeycomb  11 - 3.0
- Ice Cream sandwich 14 - 4.0
- Jellybean 16 - 4.1
- Kitkat 19 - 4.4
- Lollipop 21 - 5.0
- Marshmallow 23 - 6.0
- Nougat 24 - 7.0
- Oreo 26 - 8.0

- Android Architecture
  - Linux Kernel
    - Abstractions for device hardware and it has all hardware drivers for camera, sensors and etc
  - Libraries
    - On top of Linux Kernel are this libraries such as open-source web browser engine Web Kit, SQLite, SSL Internet Security, Library to play and record audio or video
    - We use libraries to manage underlying hardware activities for networking, storage and etc, they help with boilerplate code and further abstraction
    - Android Libraries
      - app: application model
      - content: content access, and messaging between multiple applications
      - database: storage
      - opengl: graphics and rendering
      - os: multitasking, memory management, system services, messaging
      - text: text rendering
      - view: fundamental building blocks of UI
      - widget: collection pre-built user interfaces such as calendar, date time picker
      - webkit: browser engine
  - Runtime
    - Consists of Dalvik Virtual Machine
      - Kind of JVM but customized for efficiency in running Android apps
      - It allows each app to have its own process running separately with its own separate DVM
  - Application Framework
    - Activity Manager
      - Application lifecycle
      - Activities stack
    - Content Providers
      - Publish and share data with other applications
    - Resource Manager
      - Access manager to non-code embedded resources such as images, color settings and user interface layouts
    - Notifications Manager
      - Allows displaying alerts and notifications
    - View System
      - Extensible set of views used to create User Interfaces
  - Applications
    - This is what we develop such as alarm app, calendar, weather reporting, watch video, Youtube, WittyFeed, InnerVoice

Now this is the overview of the Android Development, we will discuss more about Application Framework, Libraries, and the our main part Applications Later because

Android Development is done on Java and first we need to go through it before getting started with Android

Hence, Let&#39;s go through JAVA for two sessions, then we&#39;ll practice on some logical problems and then we&#39;ll get started with Android

Getting Started with JAVA

- Features of JAVA
  - Based on OOP, not pure OOP (why?)
  - Platform independent
  - Simple: as it&#39;s definitely not machine language
  - Secure: it develops virus free, temper free systems
  - Architectural-neutral: compiled code (i.e. byte code) will run in any Java runtime system -  WORA (write once, run anywhere)
  - Portable: WORA
  - Robust: exception handling, runtime error checking, compile time error checking
  - Multithreaded: programs that can perform many tasks simultaneously
  - Interpreted: compiled code (byte code) is translated on the fly, its rapid
  - High Performance: using just-in-time compilers, it is fast. JIT compiler
  - Distributed: designed in accordance with the distributed environment of Internet
  - Dynamic: Adapts to evolving environment, memory allocation
- OOP
  - Inheritance
    - A child entity if has a parent, will inherit its properties too
    - Single, multilevel, Hierarchical (no multiple, so no hybrid)
  - Polymorphism
    - Poly means many, morphing means shaping. It&#39;s equivalent to saying same thing shaped in multiple ways like clay. It works both ways, a clay can built multiple types of things or multiple things can be built with same clay
  - Encapsulation
    - Class: Collection of Objects (Objects are entities which have states and behavior, where state is defined through its variables and behavior through its methods)
  - Data Abstraction
    - We&#39;ve seen its example in android architecture, how kernel drivers are operated through libraries and then libraries are sometimes also simplified using more set of functions
  - Modularity
    - Implementing a program or computing system as a number of unique modules. A standardized interface is then used to enable the modules to communicate
- Identifiers
  - Names for the methods, variables, classes which obviously can&#39;t be same as which Java already uses such as (print, main, switch, if, else, for etc).
- Modifiers
  - Access: Public, private, protected
  - Non-Access: Abstract, final, strictfp\*\*
- Variables
  - Local
  - Class
  - Instance
- Arrays
  - Example: String[] string\_arr = new String[2];           //will have index 0 &amp; 1 valid, as the total length we provided is 2
- Enums
  - Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums
  - Will learn more about this when we will use _setVisibility(View.VISIBLE)_ in Android App Development

## Session 2

8 Nov&#39; 17

- Interfaces
  - Plays a vital role as communicator, we&#39;ll use it very often. In interface we define (declare a method) and the class which implements the interface has to compulsorily provide its implementation (underlying code)
  - To understand Interface: let us consider a scenario of Doremon cartoon, where Nobita keeps getting in trouble, doremon keeps saving him. Now, Doremon can only help him when Nobita is near to him, or we could say that they belong to same class or scope. But Nobita needs help outside the scope. So,
  - Once, Nobita asks doremon for a gadget using which he can call doremon anytime and doremon can remotely help him.
  - For this doremon takes out a magic mirror from his pocket and asks Nobita to write his name on it. When Nobita writes his name, the mirror becomes his Real-time CCTV camera using which Doremon can always lookout for him.
  - Now in this scenario the magic mirror is our interface, which was a property of Nobita whom the mirror monitors, but is mainly being handled by another client Doremon. No one knows when will Nobita could get in trouble is similar to no one knows when a asynchronous (async) process like HTTP request will fetch response, but when Nobita gets in trouble or when async process ends, we need something done, so we use Interface to notify the client and get operations done.

More about  Java Q &amp; A style -

-
  - Can we overload main method ?
    - Yes, but only public static void main(String[] args) will be used when your class is launched by the JVM
  - Constructor returns a value but, what ?
    - This is a little confusing: constructors indeed do not return a value; it is operator new that does. However, constructors are always used with a new\*, so it looks like they always return a value.
  - Can we create a program without main method ?
    - Yes, sequence is as follows:
      - jvm loads class
      - executes static blocks
      - looks for main method and invokes it
    - public final class Test {
    -         static {
    -         System.out.println(&quot;FOO&quot;);
    -         }
    - }
  - What are the 6 ways to use _this_ keyword ?
    - To get reference of an object through which that method is called within it(instance method).
    - To avoid field shadowed by a method or constructor parameter.
    - To invoke constructor of same class.
    - In case of method overridden, this is used to invoke method of current class.
    - To make reference to an inner class. e.g ClassName.this
    - To create an object of inner class e.g enclosingObjectReference.new EnclosedClass
    - \*this keyword can&#39;t be used with static methods
    - \*when used in a constructor, the this(...) must be the very first statement

class Foo

{

         private int bar;

public Foo() {

              this(42); // invoke parameterized constructor

         }

public Foo(int bar) {

             this.bar = bar; // disambiguate

         }

public void frob() {

              this.baz(); // used &quot;just because&quot;

         }

private void baz() {

          System.out.println(&quot;whatever&quot;);

         }

}

- Why multiple inheritance is not supported in java ?
  - Diamond problem
- Why use aggregation ?
  - To maintain code re-usability
  - Works when there&#39;s a HAS-A relationship
- Can we override the static method ?
  - Static methods can not be overridden because they are not part of the object&#39;s state, they belongs to the class (i.e they are class methods). Overloading is fine
- What is covariant return type ?
  - covariant Return types simply means returning own Class reference or its child class reference. class Parent

class Child extends Parent

{

//it contain data member and data method

 //covariant return

 public Parent methodName()

  {

         return new Parent();

              or

          return Child();

   }

}

- What are the three usage of super keyword?
  - It is used inside a sub-class method definition to call a method defined in the super class, Private methods of the super-class cannot be called
  - It is also used by class constructors to invoke constructors of its [parent class](https://en.wikipedia.org/wiki/parent_class).
  - To use or change the variable values in super class. Eg: super.var = 3.14.
- Why use instance initializer block?
- What is the usage of blank final variable ?
- What is marker or tagged interface ?
- What is runtime polymorphism or dynamic method dispatch ?
- What is the difference between static and dynamic binding ?
- How downcasting is possible in java ?
- What is the purpose of private constructor?
- What is object cloning ?

## Session 3

9 Nov&#39; 17

Building first Android App - calculator

-
  - How does an app development should work hypothetically
    - It should have some way to defined its &#39;main&#39; method type thing to launch
    - It will have media things, so app will bundle them too
    - It will have data storage and cache
    - It will have some configurations
    - It may have libraries and optional
    - It should support all devices old or new
    - It should be made once but shall support whole world, hence some way to localize languages
    - Apps get opened and closed all the time, it should be handled
    - I wish to know what the app does before installing it (instant apps in Oreo)
  - So we&#39;ll build a calculator app and understand how all above mentioned purposes are served
    - Making the project
      - App name : changeable later
      - Company domain : just a use case to generate package name
      - Package name : app&#39;s unique identified on play store (company domain is used in this, though is customizable irrespective of company domain)
      - Minimum API (if we will use functions and methods that do not support this API, studio will show warning)
      - Target API - should be always the latest version (if we use any method or widget above target API, studio will show warning )
      - Choose Activity to start with
  - Short description of app components
    - Manifest
    - Gradle
    - Activity
    - Res
      - Layouts
      - Style
      - Strings
      - Menu items
      - Mipmap
      - Anims

## Session 4

10 Nov&#39; 17

Continued - Calculator Android App

- Short description of elements that we are going to use
  - Button
  - Relative layout
  - TextView
  - EditText
- findViewById in Android
- nClickListener in Android
- First Android App : Calculator - on Github
