import os 

validate = str(input("Are you sure, that you want to push the changes to the repo? (y/n) "))

if validate == "y": 									  
	print("Sure!")									  	
											
	commit_message = str(input("Enter the commit message: ")) 			    
	command = "git add . && git commit -m \"" + commit_message + "\" && git push"	     
	os.system(command) 								    
	
elif validate == "n":                                                                      
	print("exiting...")								   
											   
else: 											     
	print("Wrong input!!!") 							     
