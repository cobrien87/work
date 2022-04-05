import pandas as pd
from numpy import *
import inspect

#Data (to be move to separate library)
def namestr(obj, namespace):
    #takes a variable and namespace, returns variable name as a list of strings
    return [name for name in namespace if namespace[name] is obj]
def display(d, show_var=True):
  #displays matrix array as a data frame
  #If d is a variable referring to an array, prints 'd' =
  if show_var:
    try:
      name = namestr(d, globals())[0]
      print(name+" = ")
    except IndexError:
    #otherwise just print array
      pass
  df = pd.DataFrame(d)
  print('\n'.join(df.to_string(index = False).split('\n')[1:]))
  print()


P = [(0.2, 0.3, 0.4),
     (0.4, 0.4, 0.1),
     (0.5, 0.1, 0.3)]

Q = [(100),(50), (25)]

print(dot(P,Q))
