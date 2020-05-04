# To get the updated Eclipselink JPA, go to 
https://www.eclipse.org/eclipselink/downloads/index.php#27


To get the missing .jar for JAVAFX if you are using autocomplete control, download the jar 
https://nexus.gluonhq.com/nexus/content/repositories/releases/com/gluonhq/charm-glisten/4.4.1/charm-glisten-4.4.1.jar, add it as a library in NetBeans 11.2 (e.g, GluonLib)

VM Options:
--add-modules javafx.controls,javafx.fxml

Connection String:
jdbc:mysql://localhost:3306/ist311_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC

Project Name: Gaming Project

Description: A web application used to customize a(n) beginner/amateur gaming PC with additional components. 

This project includes:
Parts 
Order
Customer
Company
Payment
SigninView
PaymentView
PartsView
CompanyView (firstFXML)
CompanyController (firstController)
SigninController
PaymentController
PartsSelectionController

To run this project: Clone the files in Gaming Project

Usage: 
1. Run project and sign in as a new user, Press 'Continue'
2. Select Company with buttons under description
3. Use dropdown menu to selection component options
4. Once component has been selected, review the available options in the table at the bottom of the page
5. Selection of the options
6. Look in the upper right hand corner to see the description of the selected part
7. Press 'Add Part' to add it to your shopping cart
8. Press 'Continue'
*If fully functional* 
9. Enter credit card information 
10. Review order summary in bottom left corner
11. Review selected items on right hand side of the page
12. Review tracking number on right hand side of the page
13. Press 'Checkout'

