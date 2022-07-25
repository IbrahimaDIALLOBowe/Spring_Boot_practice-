
--------------------------------------------------------
STEPS to include in the process of building spring boot project 

STEP 1 : Create new maven project and set spring boot dependencies
	 --> Create a new maven project
	 --> Moment we create maven project along with it we get pom.xml
	 --> in pom.xml we have to update the information regarding Spring boot maven dependencies
	 --> We need <artifactId>spring-boot-starter-web</artifactId> to communicate with the browser
	 --> We need <artifactId>spring-boot-starter-jdbc</artifactId> to communicate with the database
	 --> We need <artifactId>mysql-connector-java</artifactId> to distinguish with which database we will connect (MySQL)
	 
STEP 2 : UPdate db information in application.properties
	--> under src/main/resources -- do right click and create new file with name as application.properties
	--> here update the info as given in the applciation.properties of your spring_boot_practise project 
	
STEP 3 : Define the starting point of spring boot project 
   --> create a pacakge as com.app(user defined)
   --> Create a class with any name under this com.app package (*Can call it SpringBootStarter.java)
   --> Define main method while creating the class 
   --> This class should be annotated through using @SpringBootApplication
   --> so that when we run this program application will be automatically builded and deployed in embedded tomcat server 
   
STEP 4 : Define rest api or web services in the controller layer 
	--> create a package with name com.app.controller (This is also the controller layer)
	--> create a class containing the word Controller in the name (Ex. ItemController)
	--> Controller layer class should be annotated using @RestController annotation
	--> Class will get identified from browser through using @RequestMapping(Value="/someUrl")  *Note: The URL value is not necessarily the same name as the table name; URL based upon requirements
	--> Define methods in the controller layer where each method acts as a web service which we can call from ARC (advanced rest client for testing)
	
	--> Define web services methods in controller layer 
	  --> based on type of request we wish to make we choose 1 among these  and write on top of method
	          --> @GetMapping(value="/url")
	          --> @PostMapping(value="/url")
	          --> @PutMapping(value="/url")
	          --> @DeleteMapping(value="/url")
	
	  --> if you are expecting object type of data to be received from browser (in case of insert or update) then we define @RequestBody in the method arguments
	  --> If you are expecting raw type of data to be received from browser ( in case of get or delete) then we define @RequestParam in the method Arguments
REVIEW THIS	  --> If you are not expecting any value to be passed as input from browser to your web service then we can define method arguments as empty (in case of getAll)
	  
STEP 5 : Define service layer  
	--> Create a package with name as com.app.service (This is also the service layer)
	--> Create an interface for example ICustSrv or IItemSrv or IUserSrv etc ...
	--> Define abstract methods in the interface based on requirements 
	--> Now create a class (for example CustSrvImpl) in the service layer (Ex. CustomerServiceImpl.java) (Ex. ItemServiceImpl.java)
	--> Define the class with @Service annotation
	--> Make the class implements Interface defined in service layer (Ex. public class ItemServiceImpl implements IItemService {} )
	--> Implement all the abstract methods from interface in the class (Ex. The interface is IItemService; the class is ItemServiceImpl.java)
	    --> hover mouse on compile time error and click on add unimplemented methods

STEP 6 : Define repository layer 
     --> Create a package with name as com.app.repository (This is also the repository layer)
     --> Create an interface for example ICustRepo or IItemRepo etc ..
     --> Define abstract methods in the interface based on requirements
     --> Now create a class (for example CustRepoImpl) in the repository layer
     --> Define the class with @Repository annotation
     --> Make the class implements interface defined in repository layer (Ex. public class ItemRepoImpl implements IItemRepo{} )
     --> Implement all the abstract methods from interface in the class	(Ex. The interface is IItemRepo; the class is ItemRepoImpl.java)
     	--> hover mouse on compile time error and click on add unimplemented methods
     	
STEP 7 : Inject the service layer in controller layer using @Autowired
    --> Open the already defined class in controller layer
	--> define a variable of type as Service  (ex : private ICustSrv custSrv)
	--> on top of variable define @Autowired
	--> also define setter method for service type of variable 
	--> above 3 lines together are called as injecting the service layer object in controller layer object
	*Note: In the example
	@Autowired
	private IItemService itemService;
	
	itemService is the variable and the service layer object which is being injected into (assigned to) the controller layer object
	
Note : If we wish to go from controller to service we have to do above step which is autowire service layer in 
controller layer 


STEP 8 : Inject the repository layer in service layer using @Autowired
    --> Open the already defined class in service layer
	--> define a variable of type as Repository  (ex : private ICustRepo custRepo)
	--> on top of variable define @Autowired
	--> also define setter method for repository type of variable 
	--> above 3 lines together are called as injecting the repository layer object in service layer object
	
Note : If we wish to go from service to repository layer we have to do above step which is autowire repository layer in 
service layer 


STEP 9 : Inject the jdbcTemplate object in repository layer using @Autowired
    --> Open the already defined class in repository layer
	--> define a variable of type as Repository  (ex : private JdbcTemplate jdbcTemplate )
	--> on top of variable define @Autowired
	--> also define setter method for jdbcTemplate type of variable 
	--> above 3 lines together are called as injecting the jdbcTemplate object in repository layer object
	
Note : If we wish to go from repository layer to database and execeute query, 
 we have to do above step which is autowire jdbcTemplate object in repository layer 

STEP 10 : Create rowMapper classes which map the data from database into java class objects 
			ResultSet rs  --> carries information regarding data base records as per query execution results
			we have to create an object for java class and   -- (Customer cust = new Customer)
			map every column of data to every property of object 
			  for referfecne : 
					cust.setcName(rs.getString("cName"));
					cust.setGender(rs.getString("gender"));
		

STEP 11 : Now add logic in controller layer  and call the service layer methods

STEP 12 : Now add logic in service layer and call the repository layer methods 

STEP 13 : Now write queries and execute queries from repository layer using jdbcTemplate object












