import math #Wird gebraucht um die Funktion math.pi zu nutzen

rayon = float(input("Rayon:")) #Float, damit auch Dezimalzahlen als Radius eingegeben werden können

def aire():
    return rayon * rayon * math.pi #Exponenten können auch mit '**Exponent', also rayon ** 2 berechnet werden
    
def perimetre():
    return 2 * rayon * math.pi
    
print(aire())
print(perimetre())
