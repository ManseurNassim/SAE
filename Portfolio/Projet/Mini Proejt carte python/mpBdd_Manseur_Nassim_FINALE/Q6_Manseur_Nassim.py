#Question6
import folium
import mysql.connector
#Importation des 2 fonctions

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="france_regions_depts")
mycursor = mydb.cursor()
#Permet de lié le programme python avec la basse de donnée

mycursor.execute("ALTER TABLE regions ADD IF NOT EXISTS capt_region VARCHAR(255)")
#Permet d'executer la requete dans la base de donner pour Rajouter la colonne capt_region en vérifiant si elle existe déjà ou pas

mycursor.execute("SELECT nom_ville FROM villes_200 JOIN departements ON villes_200.dpt_ville=departements.num_dpt JOIN regions ON regions.code_region=departements.code_region WHERE code_commune=code_commune_capt")
#Permet d'executer la requete dans la base de donner pour trouver les villes qui sont les capitales de leurs région
myresult=mycursor.fetchall()
#Permet d'enregistrer dans la variable myresult les donnée trouvé sous forme de matrice donc une liste de liste
print (myresult)
#On affiche le résultat pour vérifier si la requête est bonne

mycursor.execute("UPDATE regions JOIN villes_200 ON villes_200.code_commune=regions.code_commune_capt SET capt_region=nom_ville WHERE code_commune=code_commune_capt")
#Permet de remplir la colonne qu'on a crée auparavant et on y met les capitales de chaque régions.



