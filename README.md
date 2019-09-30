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
