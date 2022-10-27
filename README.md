** R E Q U I R E M E N T S **

All the inputs/commands will be given to us via command line.
So we need to read the inputs from command line, parse them and perform actions accordingly.

Input-format:
- Register dev 9876543210 pass
    this means u1 is registering with username "dev", phoneNumber "9876543210" and password as "pass"
- u_id updateProfile newPass
    this means that u1 is updating their password to "newPass";
- u_id addGroup Roommates
    u1 is creating a group titled "Roommates"

** A P P R O A C H **

- Handling commandline inputs
  - Firstly we'd create a registry to store all the different types of commands.
  - To handle the commands we'd create a Command interface
  - Command will have two major methods viz. parse and execute
  - Now for every command we'll have a class which implements command interface.



[//]: # (NOTE: In springboot if you are building a command line application then your main application class should implement
CommandLineRunner interface)

** C O N C E P T S **

- Spring Annotation - by using @Controller, @Service, @Repository
  - Spring makes the respective classes a singleton and saves them in spring context
  - It allows us to inject the object of that class wherever we need by using @Autowired

- @Autowired
  - 