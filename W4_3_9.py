mon_mot = "Hard But Cool!!" #Anführungs- & Schlusszeichen gehören nicht dazu
premiere = mon_mot[0] #Computer zählen ab der Nummer 0
derniere = mon_mot[-3] #- zählt von hinten (fängt mit -1 an, weil -0 nicht existiert)
lettre_5 = mon_mot[5] #Leerzeichen werden auch gezählt, deshalb Nr. 5 und nicht Nr. 4
lettre_9_13 = mon_mot[9:13] # : steht hier für von, bis


print(premiere, derniere, lettre_5, lettre_9_13)