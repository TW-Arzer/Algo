nb_bonbons = 11
nb_personnes = 3
bonbons_personnes = int(nb_bonbons / nb_personnes) #int ändert hier Anzahl Bonbons von 3.6666665 zu 3
bonbons_reste = nb_bonbons % nb_personnes #% zeigt den Restwert an, in diesem Fall 2, weil 11/3 nicht zu einer natürlichen Zahl wird

print(bonbons_personnes, bonbons_reste)