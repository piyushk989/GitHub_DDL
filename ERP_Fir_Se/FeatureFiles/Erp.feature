@tag
Feature:
 adding customer in ERP
@Suppliers

Scenario Outline:
 Validate Customers with multiple Data
Given Launch url "http://webapp.qedgetech.com/" in a browser
When Enter username with "id" and "username" and "admin"
And Enter poassword with "class" and "password" and "master"
And Click on login button with  "name" and "btnsubmit"
Then Validate title with "Dashboard « Stock Accounting"
When Click on the link suppliers with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Click on add icon with "xpath" and "//div[@class='panel-heading ewGridUpperPanel']//a[@class='btn btn-default ewAddEdit ewAdd btn-sm']"
When capture supplier number with "name" and "x_Supplier_Number"
When Enter in "<SupplierName>" with "xpath" and "//*[@id="x_Supplier_Name"]"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"  
When click Add with "id" and "btnAction"
When Click on Confirm with "xpath" and "//button[normalize-space()='OK!']"
When Click Alert Ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
When Click on search link with "xpath" and "//span[@class='glyphicon glyphicon-search ewIcon']"
Then Validate supplier table
When Close the broweser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhil|Ameeet1|Hyearbad|India|edgeTech1|65896547|Tst@gmail.com|345679098|Suppying goods|
#|Akhilesh71|Ameerpet81|Hydearbad|India|QedgeTech81|6547896547|Test@gmail.com|3456789098|Supplying goods|
#|Akhilesh51|Ameerpet14|Hydearbad|India|QedgeTech1|6547896547|Test@gmail.com|3456789098|Supplying goods|