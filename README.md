# 60-days-of-Java


<a href="url"><img src="https://images.vexels.com/media/users/3/166401/isolated/preview/b82aa7ac3f736dd78570dd3fa3fa9e24-java-programming-language-icon.png" align="center" height="450" width="450" >
<img src="https://camo.githubusercontent.com/7126894c136cfcea2ead9679838b0ca5b8bf50f64c0b76dc0e69e75d9fc57314/68747470733a2f2f7237713677397a362e726f636b657463646e2e6d652f6361726565722f77702d636f6e74656e742f75706c6f6164732f323032302f30332f68656c6c6f2e676966" align="center" height="450" width="450" ></a>



---

# 55 Servlets Interview Question:

---
---

### Q1. What is a Servlet?
#### Ans: A Servlet is a Java program that runs on a Web server. It is similar to an applet but is processed on the server rather than a client’s machine. Servlets are often run when the user clicks a link, submits a form, or performs another type of action on a website
---
### Q2. What is a Cookie?

#### Ans: A cookie is a piece of information that is present between multiple client requests. A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version number.
---
### Q3. How PrintWriter is different from ServletOutputStream?

#### Ans: PrintWriter is basically a character-stream class. On the other hand, ServletOutputStream is a byte-stream class. The PrintWriter class can be used to write only character-based information whereas ServletOutputStream class can be used to write primitive values as well as character-based information.
---
### Q4. Explain is servlet mapping?

#### Ans: Servlet mapping is a process of defining an association between a URL pattern and a servlet. The mapping is used to map requests to Servlets.
---
###  Q5. What are the annotations used in Servlet 3?

#### Ans: The important 3 annotations used in the servlets are.

@WebServlet : for servlet class.
@WebListener : for listener class.
@WebFilter : for filter class.
---
### Q6. What is the difference between a Generic Servlet and HTTP Servlet?

#### Ans: A common feature between Generic Servlet and HTTP Servlet is both these Classes are Abstract Classes. But, they do have differences between them which discussed as follows

#### Generic Servlet: Protocol Independent | Belongs to javax.servlet package	 | supports only service() method 


#### HTTP Servlet: Protocol Specific | Belongs to javax.servlet.http package | supports doGet(), doPost(), doHead() methods

---

### Q7. What is the use of RequestDispatcher Interface?

#### Ans: The RequestDispatcher interface defines the object that receives the request from the client and dispatches it to the resources such as a servlet, JSP, HTML file. The RequestDispatcher interface has the following two methods:


public void forward(ServletRequest request, ServletResponse response)
Forwards request from one servlet to another resource like servlet, JSP, HTML etc.


public void include(ServletRequest request, ServletResponse response)
Includes the content of the resource such as a servlet, JSP, and HTML in the response.

---
### Q8. Can a JSP be called using a Servlet?

#### Ans: Yes, Servlet can call a JSP using RequestDispatcher interface.

Example:

1 : RequestDispatcher reqdis=request.getRequestDispatcher("log.jsp");
2 : reqdis.forward(request,response);
---
### Q9. Explain the Servlet Filter.

#### Ans: A Filter is defined as a pluggable object that is invoked either at the pre-processing or post-processing of a request.
---
### Q10. Why do we need Servlet Filter?

#### Ans: We need Servlet Filters for the following reasons:

Logging the request parameters to log files.
Authentication and Authorization of the request for the needed resources.
Formatting of the request body/header before sending it to the servlet.
Compressing response data sent to the client.
Change the response by adding some cookies and header information

---
### Q11. Why is init() method is used in Servlets?

#### Ans: The init() method is used to create or load some data that will be used throughout the life of the servlet.
---

### Q12. What is load-on-startup in Servlet?

#### Ans: The load-on-startup element of servlet in web.xml is used to load the servlet at the time of deploying the project or the server to start. This saves time for the response of the first request.
---
### Q13. What is a WAR file?

#### Ans: The WAR(Web Application Resource) file specifies the web elements. Either a Servlet or JSP project can be converted into a war file. Moving one Servlet project from one place to another will be fast as it is combined into a single file.
---
### Q14. What does the following code snippet in an XML file mean?

#### Ans:
<load-on-startup>1</load-on-startup>
Ans: Whenever a request for a servlet is placed, then the servlet container will initialize the servlet and load it. This process is defined in our config file called web.xml. But, by default, Container will not initialize the servlet, when the context is loaded. This can be achieved by defining the servlet in a pre-initialization procedure syntax <load-on-startup>1</load-on-startup>. Then, the servlet that we have defined in this tag will be initialized at the start when the context gets loaded before even getting the request.

---
### Q15. How to get the server information in a servlet?

#### Ans: Yes, we can retrieve the information of a server in a servlet. We can use below code snippet to get the servlet information in a servlet through servlet context object.

getServletContext().getServerInfo()
---
### Q16. Explain MVC pattern.

#### Ans: Model-View-Controller (MVC) is a design pattern that divides a software application into three segments namely the Model, the View and the Controller.

A model deals with the behaviour of the application. It contains the data and business logic of the application. It notifies views and controllers when there is a change in its state.
A view renders the information to the user so that it looks attractive and appealing. It takes information from the model using which it generates output.
A controller takes input from a user and sends the command to model or view. It controls the flow of the application.
---
## Intermediate Level Interview Questions
---






