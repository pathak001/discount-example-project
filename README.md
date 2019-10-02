# discount-example-project
discount based on customerType, amount and itemType.

POST : localhost:8080/getPayableAmount

BODY :

{
	"orderId" : 123,
	"currentDate" : "2015-10-09",
	"customerDetails" : {
		"customerId" : 1,
		"customerName" : "Pankaj Pathak",
		"creationDate" : "2019-10-19",
		"customerType" : "CUSTOMER"
	},
	"itemDetails" : [
		{
			"itemType" : "GROCERY", 
			"amount" : 150
		},
		{
			"itemType" : "OTHER",
			"amount" : 150
		},
		{
			"itemType" : "OTHER",
			"amount" : 100
		}
	]
}
=================================================================================================
"itemType" : "GROCERY" // Here itemType can GROCERY , OTHER
"customerType" : "CUSTOMER" // Here customerType can be EMPLOYEE, AFFILIATE, CUSTOMER

=================================================================================================

To generate SonarQube report please follow these steps -

1) Use version sonarqube-6.4 because latest version do support Java 11 
then you might have to change in wrapper configuration.
2) Start the sonarqube server by C:\sonarqube-6.4\bin\windows-x86-64\StartSonar.bat
3) Use this command to build the project :
    mvn clean install 
    mvn sonar:sonar

then you will get sonarqube report under :
	http://localhost:9000/dashboard?id=com.example%3Adiscount-example-project
	
=================================================================================================
