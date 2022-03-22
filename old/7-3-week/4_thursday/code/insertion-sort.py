arr = [3,5, -7, 0, -10]
for i in range(1,len(arr)):
    temp = arr[i]
    print("at i = " + str(i) + " temp = " + str(temp))
    for j in range(0,i):
        if temp < arr[j]:
            arr.pop(i)
            arr.insert(j,temp)
            break
    print("i =" + str(i))
    print("arr[i]: " + str(arr[i]))
    print(arr)
