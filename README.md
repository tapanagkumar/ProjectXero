# This project demonstrates adding ANZ bank account inside Xero organisation using Katalon Studio:
Katalon Studio is a test automation solution that leverages Selenium’s core engine. Although it uses several Selenium’s functionality, it is not simply a Selenium wrapper. 
______
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Internet access
- Application Under Test (AUT):
     + Xero cloud: https://www.xero.com/au/
     + Account: tapanagkumar@gmail.com/qeSbeKQMf1o9DpEn381e7g==
	 
**Note**: The password is encrypted

### Setting Up
- [Check out](https://github.com/tapanagkumar/ProjectXero.git) the code from this repository
- [How to open the project from Katalon studio](https://docs.katalon.com/display/KD/Manage+Test+Project)
- Unzip the Downloaded code and open the project from File->Open Project ( EX: "Location of the file"\ProjectXero-master\ProjectXero-master\XeroProject)

### Executing a Test suite from Katalon Studio
1. Expand the Test Suites and double click the Regression Tests
3. Now Choose the browser for executing the test case (https://docs.katalon.com/display/KD/Execute+a+Test+Case+or+a+Test+Suite)

### Executing a Test suite from command line

#### *Note: For "-projectPath", Specify the project location (include .prj file). The absolute path must be used in this case.*

1. Open the command prompt and navigate to the folder of your Katalon Studio build, which contains **katalon executable**
   *(# Ex: C:\Users\tapan.LAPTOP-L18RHV6N\Downloads\Katalon_Studio_Windows_64-5.6.3>)*

2. Run the below command in the command prompt. Do not forget to change the "-projectPath"

	**C:\Users\tapan.LAPTOP-L18RHV6N\Downloads\Katalon_Studio_Windows_64-5.6.3>**
	
  `katalon -noSplash  -runMode=console -consoleLog -noExit -projectPath="C:\Users\tapan.LAPTOP-L18RHV6N\Downloads\ProjectXero\XeroProject.prj" -retry=0 -testSuitePath="Test Suites/Regression" -executionProfile="default" -browserType="Chrome"`

3. If you want to run the test on firefox change the -browserType="Firefox"

	**C:\Users\tapan.LAPTOP-L18RHV6N\Downloads\Katalon_Studio_Windows_64-5.6.3>**
	
  `katalon -noSplash  -runMode=console -consoleLog -noExit -projectPath="C:\Users\tapan.LAPTOP-L18RHV6N\Downloads\ProjectXero\XeroProject.prj" -retry=0 -testSuitePath="Test Suites/Regression" -executionProfile="default" -browserType="Firefox"`

### Reports

- Once a test suite finishes its execution, a historical report will be automatically generated and stored in Reports. 
- [How to view reports](https://docs.katalon.com/display/KD/Test+Suite+Report)

### Main Test Cases
  
  **Location: XeroProject\Test Cases\Tests\Add Bank Account**
  
- I want to be able to add an ANZ(NZ) bank account inside Xero Organisation

### Helper Test Cases
  
  **Location: XeroProject\Test Cases\Tests\Helper Test Cases**
  
- Login with username and encrypted password specified in GlobalVariable
- Navigate to Bank Accounts Page
- Add a Bank Account

### Page Objects

**Location: XeroProject\Object Repository**

- All the page objects are stored in the object Reprository folder

### Additional 3rd party libraries

- Java faker library has been used to generate Account names  (https://github.com/DiUS/java-faker)
