# DISCLAIMER - this process if for WINDOWS OS.

# In case you are facing any issues even if you have installed the java development kit, it is advised that you uninstall/delete the present files and start the process from scratch. 

* First of all, according to your requirement or your project requirement, choose the necessary java version and download it from the official ORACLE PAGE ONLY.

* After that, simply install it by giving the nod to the next few "next" buttons. 

* Upon finishing the installation process, click on the close button. 

* Click on the windows button, choose advanced system settings. 

* ON the bottom, you can find the "Environment variables" button. Click on it. 

* Under System variables, create a new one to change it to "JAVA_HOME", the path to be set is in the C drive where the jdk has been installed
  It may look something like this " C:\Program Files\Java\jdk-17 ".

* Now is the time to update the path variable, click on edit.

* After adding new, paste this " %JAVA_HOME%\bin " .

* Click OK to save al the changes. 
* the way to find out if you've passed or not is to run the command prompt and then type this cmnd " java -version  ". if it shows you the java version, be delighted.
