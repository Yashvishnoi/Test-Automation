set projectpath=C:\Users\Yash Vishnoi\eclipse-workspace\TestAutomation-Project
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause