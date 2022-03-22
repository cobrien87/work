name = ""
fname = "Chris"
lname = "OBrien"
possibleNames= []
for i in range(len(fname.lower())):
    name += fname.lower()[i]
    possibleNames.append(lname.lower()+name)
print(possibleNames)
