#QUESTION 2
import folium
import mysql.connector #Importation des 2 fonctions

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  database="France_regions_depts")
mycursor = mydb.cursor()
#Permet de lié le programme python avec la basse de donnée


mycursor.execute("SELECT latitude,longitude,nom_ville FROM villes_200 ORDER BY villes_200.population DESC LIMIT 20")
#Permet d'executer la requete dans la base de donner
myresult = mycursor.fetchall() #Transforme le résultat en liste


c=folium.Map(location=[ 49.26667, 2.46667],zoom_start=15) #point de départ de la carte
NumeroVille=0 #création d'une variable pour connaitre le numero de chaque ville de la requête
for i in range(20): #pour i qui prend la valeur de 0 a 20

  longitude=float(myresult[NumeroVille][0])#Permet de convertir chaque chiffre en flotant
  latitude=float(myresult[NumeroVille][1])#Permet de convertir chaque chiffre en flotant
  nomville=str(myresult[NumeroVille][2])#Permet de convertir chaque nom de ville en str
  print(longitude,latitude,nomville)#Affiche la longitude , la latitude , le nom de la ville corespondante
  folium.Marker([longitude,latitude],popup=nomville).add_to(c)#Création du point sur la carte avec les bonne coordonées et le nom de la ville afficher
  NumeroVille=NumeroVille+1 # la valeur de numéro ville augmente de 1 comme un compteur pour faire le marqueur pour chaque ville


c.save("Q2_Manseur_Nassim.html")#crée la carte en html





