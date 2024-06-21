#Question5
import folium
import mysql.connector
#Importation des 2 fonctions

c= folium.Map(location=[50,3],zoom_start=15)
#point de départ de la carte

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="france_regions_depts")
mycursor = mydb.cursor()
#Permet de lié le programme python avec la basse de donnée


mycursor.execute("SELECT latitude,longitude,nom_ville FROM villes_200 WHERE latitude BETWEEN 40 AND 52 ORDER BY latitude desc limit 1")
myresult=mycursor.fetchall()
#Permet d'executer la requete dans la base de donner pour trouver les villes a l'Ouest au ,Sud au ,Nord et a l'Est et transforme le résultat en matrice donc liste de liste
for i in range(len(myresult)):#Création de la liste qui va tourner un nombre de fois correspondant a la taille de la liste
    latitude = float(myresult[i][0])#la longitude est sauvergarder dans la variable et on change le type en flotant
    longitude = float(myresult[i][1])#la latitude est sauvergarder dans la variable et on change le type en flotant
    nom = str(myresult[i][2])#le nom de la ville est sauvergarder dans la variable et on change le type en string
    folium.Marker([latitude, longitude],popup=nom).add_to(c)#on crée le marqueur sur la carte avec les coordonées et le nom de la ville
c.save('Q5_Nassim_Manseur.html')#on enregistre la carte dans le html



mycursor.execute("SELECT latitude,longitude,nom_ville FROM villes_200 WHERE latitude BETWEEN 40 AND 52 ORDER BY latitude asc limit 1")
myresult=mycursor.fetchall()
#Permet d'executer la requete dans la base de donner pour trouver les villes a l'Ouest au ,Sud au ,Nord et a l'Est et transforme le résultat en matrice donc liste de liste
for i in range(len(myresult)):#Création de la liste qui va tourner un nombre de fois correspondant a la taille de la liste
    latitude = float(myresult[i][0])#la longitude est sauvergarder dans la variable et on change le type en flotant
    longitude = float(myresult[i][1])#la latitude est sauvergarder dans la variable et on change le type en flotant
    nom = str(myresult[i][2])#le nom de la ville est sauvergarder dans la variable et on change le type en string
    folium.Marker([latitude, longitude],popup=nom).add_to(c)#on crée le marqueur sur la carte avec les coordonées et le nom de la ville
c.save('Q5_Nassim_Manseur.html')#on enregistre la carte dans le html



mycursor.execute("SELECT latitude,longitude,nom_ville FROM villes_200 WHERE longitude BETWEEN -5 AND 10 ORDER BY longitude desc limit 1")
myresult=mycursor.fetchall()
#Permet d'executer la requete dans la base de donner pour trouver les villes a l'Ouest au ,Sud au ,Nord et a l'Est et transforme le résultat en matrice donc liste de liste
for i in range(len(myresult)):#Création de la liste qui va tourner un nombre de fois correspondant a la taille de la liste
    latitude = float(myresult[i][0])#la longitude est sauvergarder dans la variable et on change le type en flotant
    longitude = float(myresult[i][1])#la latitude est sauvergarder dans la variable et on change le type en flotant
    nom = str(myresult[i][2])#le nom de la ville est sauvergarder dans la variable et on change le type en string
    folium.Marker([latitude, longitude],popup=nom).add_to(c)#on crée le marqueur sur la carte avec les coordonées et le nom de la ville
c.save('Q5_Nassim_Manseur.html')#on enregistre la carte dans le html



mycursor.execute("SELECT latitude,longitude,nom_ville FROM villes_200 WHERE longitude BETWEEN -5 AND 10 ORDER BY longitude asc limit 1")
myresult=mycursor.fetchall()
#Permet d'executer la requete dans la base de donner pour trouver les villes a l'Ouest au ,Sud au ,Nord et a l'Est et transforme le résultat en matrice donc liste de liste
for i in range(len(myresult)):#Création de la liste qui va tourner un nombre de fois correspondant a la taille de la liste
    latitude = float(myresult[i][0])#la longitude est sauvergarder dans la variable et on change le type en flotant
    longitude = float(myresult[i][1])#la latitude est sauvergarder dans la variable et on change le type en flotant
    nom = str(myresult[i][2])#le nom de la ville est sauvergarder dans la variable et on change le type en string
    folium.Marker([latitude, longitude],popup=nom).add_to(c)#on crée le marqueur sur la carte avec les coordonées et le nom de la ville
c.save('Q5_Nassim_Manseur.html')#on enregistre la carte dans le html


