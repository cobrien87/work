"""
import calc_savings function that returns the total savings after 36 months.
This function takes 2 numeric parameters:
*annual_sal: an int representing salary
*portion_saved: a float 0-1.0 representing the portion of salary  saved
"""
from calc_savings import calc_savings

#initialize annual_sal and total_cost
annual_sal = 100000
total_cost = 1200000

#set up bisection search 
low = 3600
high =  3600
portion_saved = (high + low)/2
#convert to decimal
portion_saved_dec = portion_saved / 10000
print("portion saved as int: ", int(portion_saved))
print("portion saved as dec: ", portion_saved_dec)


savings_36_months = calc_savings(annual_sal, portion_saved_dec)
down_payment = 0.25*total_cost
print("down payment: ", down_payment)
print("savings after 36 months: ", round(savings_36_months,2))
print("is total saved greater than down payment? ", savings_36_months >= down_payment)

print("are we >100 from the down payment? ", savings_36_months - down_payment <= 100 and savings_36_months - down_payment >=0)


