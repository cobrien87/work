# cost :: String -> Number
# given a menu item, produce the cost of that menu item
fun cost(item):
  ask:
    | item == "hamburger"   then: 6.00
    | item == "onion rings" then: 3.50
    | item == "fried tofu"  then: 5.25
    | item == "pie"         then: 2.25
    | otherwise: "That's not on the menu!"
  end
end

# sales-tax :: String -> Number
# consumes the item and produces the cost of that
# item, plus a 5% sales tax
examples:
  sales-tax("hamburger") is cost("hamburger") * 1.05
  sales-tax("pie")       is cost("pie"      ) * 1.05
end
fun sales-tax(item):
  cost(item) * 1.05
end

# 1) Click "Run" and try using cost in the interactions area!
# for example, cost("hamburger") should evaluate to 6.

# 2) Once you've experimented in the interactions area, try
# using the "sales-tax" function with some inputs. What happens?
