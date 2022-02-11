import numpy

a = numpy.array([[1,1,1],[-1,2,2],[2,-6,4]])
print("original matrix: ")
print(a)
rows = a.shape[0]
#print("# rows: "  + str(rows))
cols = a.shape[1]
#print("# cols: "  + str(cols))

for col in range(cols):
    pivot = a[col][col]
    print("pivot: " + str(pivot))
    for row in range(col,rows):
         target = a[row][col]
         print("target: " + str(target))
         multiplier = -(target / pivot)
         print("multiplier: " + str(multiplier))
         row_a = a[col]*multiplier
         row_b = a[row]
         new_row = row_a + row_b
         print(str(row_a)+ " + " + str(row_b) + " = " + str(new_row))
         a[row] = new_row
         print("matrix for pivot " + str(pivot) + " at row " + str(row) + " and column " + str(col))
         print(a)
print("row echelon matrix: ")
print(a)
