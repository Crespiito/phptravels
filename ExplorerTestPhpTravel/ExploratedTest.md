# Part 1: Exploratory Test

### Focus:
The focus of the exploratory test is to evaluate the hotel booking functionality of the phptravel site.

The first thing that we need to do is log onto in the page using the follow credentials:

    user: user@phptravels.com
    password: demouser

after that we will go to the home page and select one of the options to booking.
when we have a option selected we can found one of these cases:

Then, we go to the home page and select one of the booking options. Once we have 
selected an option, we can test one of the following cases:
 
####1. Can the user correctly make a booking without using additional information?
    
      given that a user selecs an option from the home page 
      and selects the option "Booking now"
      and confirms the booking
      when select the option "Pay in arrived"
      then they can see the corrrect status Reserved




####2. Can user make a correct booking using additional information

      Given that a user selects an option from the home page 
      and adds 1 child and/or 1 infant 
      and selects the option "Booking now"
      and fills out the registration from all guests
      and confirms the booking 
      when select the option "Pay in arrived"
      then they can see the corrrect status Reserved



####3.Can the user verify information in their summary?

      Given that a user selects an option from the home page 
      and adds 1 child and/or 1 infant 
      and selects the option "Booking now"
      and fills out the registration from all guests
      and confirms the booking 
      when select the option "Pay in arrived"
      Then they can see all the gests in the reservation summary


#####Findings
- in all test cases, some times when selects the option "Pay in arrived" they don't recive the 
  reservation confirmation and summary. Inded, the reservation is not made.
  

  reserved and the reserved is not made it

        this will happen if take long time finish the process but it will be a bug because 
        the time that show to client is more longest.
        
        -possible solution is check the time session for booking
        
        
#####Priority of cases:

These cases are of highest importance because they constitute the core of the business and the website booking, if this 
doesn’t worck correctly, the user experience on the website will be bad, and the company will lose income.

#####Risks to be Mitigated

- A big risk that we have in these scenarios is that the user does not need to give their personal 
  information. The lack of information, will be a problem when we can not find the client information to contact in case 
  of a change to their reservation.  