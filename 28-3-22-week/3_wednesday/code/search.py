def search(data, target):
    for index in range(len(data)):
        item = data[index]
        if item == target:
            return index
            break
    return None

target = int(input("enter a number: "))
data = [3,6,8,7,1,0,-3,100]

print("linear search \n Where is " + str(target) + "?: " + str(search(data, target)))


def binsearch(data, target, begin, end):
    if begin <= end:
        mid = (begin+end)/2
        if target == data[mid]:
            return data[mid]
        elif target < data[mid]:
            return binsearch(data, target, begin, mid)
        else:
            return binsearch(data, target, mid, end)
    return None


print("binary search \n Where is " + str(target) + "?: " + str(search(data, target)))
