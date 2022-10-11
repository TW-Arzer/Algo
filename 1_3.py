import sys
import math

rayon = float(input("Rayon:"))

def aire():
    return rayon * rayon * math.pi
    
def perimetre():
    return 2 * rayon * math.pi
    
print(aire())
print(perimetre())