# Exploratory Test Report

### Focus:
the focus of the exploratory test is the hotel booking functionality in the site.

the first thing that we need to do is login in the page using the follow credentials 

    user: user@phptravels.com
    password: demouser

after that we will go to the home page and select one of the options to booking.
when we have a option selected we can found one of these cases:

 
####1. the user make a correctly booking without use additional information
    
      given that a user selec an option from the home page 
      and select the option booking now
      and confirm the booking
      when select the option to pay in arrived
      then can see the corrrectly status is Reserved




####2. the user make a correctly booking using additional information

      given that a user selec an option from the home page 
      and add 1 child and 1 infant 
      and select the option booking now
      and fill the formulare of guests
      and confirm the booking 
      when select the option to pay in arrived
      then can see the corrrectly status is Reserved



####3. the user check the correct info in her summary

      given that a user selec an option from the home page 
      and add 1 child and 1 infant 
      and select the option booking now
      and fill the formulare of guests
      and confirm the booking 
      when select the option to pay in arrived
      then can see all the gests in the reserved summary


#####Findings
- in all cases some times when select the option to "pay in arrive" we dont get the summary 
  reserved and the reserved is not made it

        this will happen if take long time finish the process but it will be a bug because 
        the time that show to client is more longest.
        
        - a possible solution is check the time session for booking
        
        
#####Priority of cases:
- these cases are of highest importance beecause the core of the application and bussines is the booking,
  if this dont worck correctly this will represnet big looses to the company and a bad user experience

#####Risks that need to be mitigated
- a big risk that we have in this scenarios is that the user not need fulling her personal information ,
  this will make in a problem when we can not found the client information to contact in case of  a problem
